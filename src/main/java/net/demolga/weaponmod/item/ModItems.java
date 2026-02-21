package net.demolga.weaponmod.item;

import net.demolga.weaponmod.WeaponMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DOUBLADE = registerItem("doublade",new Item(new Item.Settings()));

    public static final Item BLASTSWORD = registerItem("blastsword",new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WeaponMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        WeaponMod.LOGGER.info("Registering Mod Items for"+WeaponMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLASTSWORD);
            fabricItemGroupEntries.add(DOUBLADE);
        });
    }
}
