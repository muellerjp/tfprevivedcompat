package com.yourname.tfprevivedcompat.mixin;

import net.dries007.tfc.common.blockentities.QuernBlockEntity;
import net.dries007.tfc.common.recipes.QuernRecipe;
import net.dries007.tfc.util.Helpers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Batches the TFC quern so that a single grind processes up to {@value #TFPREVIVED$MAX_BATCH}
 * input items at once, preserving the 1:1 input-to-output ratio.
 *
 * <p>Vanilla TFC grinds exactly one item per spin ({@code finishGrinding} does
 * {@code inputStack.shrink(1)} and inserts one {@code recipe.assemble(...)}). This injection
 * reimplements that for batchable inputs: it consumes {@code min(4, available)} and produces an
 * equal number of outputs, then cancels the original method. Any other quern input falls through
 * untouched to vanilla behaviour.
 *
 * <p>Scope is data-driven via the {@code #tfprevived_compat:quern_batchable} item tag, which by
 * default points at {@code #c:ores/chunks} (the tfcorewashing chunk items). Even if the tag is
 * widened, only items that <em>also</em> have a quern recipe are affected.
 */
@Mixin(QuernBlockEntity.class)
public abstract class QuernBlockEntityMixin
{
    @Unique
    private static final int TFPREVIVED$MAX_BATCH = 4;

    @Unique
    private static final TagKey<Item> TFPREVIVED$BATCHABLE = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("tfprevived_compat", "quern_batchable")
    );

    @Shadow @Final protected IItemHandlerModifiable inventory;

    @Shadow private float recipeTimer;

    @Shadow public abstract void markForSync();

    @Inject(method = "finishGrinding", at = @At("HEAD"), cancellable = true)
    private void tfprevived$batchGrind(CallbackInfo ci)
    {
        final BlockEntity self = (BlockEntity) (Object) this;
        final Level level = self.getLevel();
        if (level == null)
        {
            return;
        }

        final ItemStack inputStack = inventory.getStackInSlot(QuernBlockEntity.SLOT_INPUT);
        if (inputStack.isEmpty() || !inputStack.is(TFPREVIVED$BATCHABLE))
        {
            return; // not a batchable input — let vanilla finishGrinding run
        }

        final QuernRecipe recipe = QuernRecipe.getRecipe(inputStack);
        if (recipe == null || !recipe.matches(inputStack))
        {
            return; // no valid recipe — let vanilla handle (and break the handstone as usual)
        }

        final int toProcess = Math.min(TFPREVIVED$MAX_BATCH, inputStack.getCount());
        for (int i = 0; i < toProcess; i++)
        {
            ItemStack outputStack = recipe.assemble(inputStack);
            outputStack = Helpers.mergeInsertStack(inventory, QuernBlockEntity.SLOT_OUTPUT, outputStack);
            if (!outputStack.isEmpty() && !level.isClientSide)
            {
                Helpers.spawnItem(level, self.getBlockPos(), outputStack);
            }
            inputStack.shrink(1);
        }

        markForSync();
        recipeTimer = 0f;
        ci.cancel();
    }
}
