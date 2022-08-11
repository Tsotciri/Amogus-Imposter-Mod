package net.tsotciri.amogusimp.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tsotciri.amogusimp.AmogusImposter;
import net.tsotciri.amogusimp.entity.ModEntities;

public class ModItems {

    public static final Item IMPOSTER_SPAWNER = registerItem("imposter_spawner",
            new SpawnEggItem(ModEntities.IMPOSTER,0xFFFFFF,0xFFFFFF,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM,new Identifier(AmogusImposter.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AmogusImposter.LOGGER.debug("Registering Items for Mod: " + AmogusImposter.MOD_ID);
    }
}
