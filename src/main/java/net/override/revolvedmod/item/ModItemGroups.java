package net.override.revolvedmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.override.revolvedmod.RevolvedMod;
import net.override.revolvedmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CUSTOM_ORES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RevolvedMod.MOD_ID, "custom_ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT))
                    .displayName(Text.translatable("itemGroup.revolvedmod.custom_ores"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.BLOCK_OF_RAW_SILVER);
                        entries.add(ModBlocks.SILVER_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        RevolvedMod.LOGGER.info("Registering Item Groups for " + RevolvedMod.MOD_ID);
    }
}
