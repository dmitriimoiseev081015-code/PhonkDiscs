package com.dimon.phonkdiscs.phonkdiscs;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PHONK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PhonkDiscsMod.MOD_ID, "phonk_discs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.phonkdiscs.phonk_group"))
                    .icon(() -> new ItemStack(ModItems.MUSIC_DISC_PHONK_1))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_PHONK_1);
                        entries.add(ModItems.MUSIC_DISC_PHONK_2);
                        entries.add(ModItems.MUSIC_DISC_PHONK_3);
                        entries.add(ModItems.MUSIC_DISC_PHONK_4);
                        entries.add(ModItems.MUSIC_DISC_PHONK_5);
                        entries.add(ModItems.MUSIC_DISC_PHONK_6);
                        entries.add(ModItems.MUSIC_DISC_PHONK_7);
                        entries.add(ModItems.MUSIC_DISC_PHONK_8);
                        entries.add(ModItems.MUSIC_DISC_PHONK_9);
                        entries.add(ModItems.MUSIC_DISC_PHONK_10);
                        entries.add(ModItems.MUSIC_DISC_PHONK_11);
                    }).build());

    public static void registerItemGroups() {
        PhonkDiscsMod.LOGGER.info("Registering Item Groups for " + PhonkDiscsMod.MOD_ID);
    }
}