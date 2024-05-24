package net.aflockosheep.minerology.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DwellerTailCarapaceItem extends Item {
    public DwellerTailCarapaceItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.minerology.dweller_tail_carapace.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

   /* @Override
    public InteractionResult useOn(UseOnContext pContext) {

        return InteractionResult.SUCCESS;
    }*/


    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block block) {

    }
}
