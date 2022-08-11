package net.tsotciri.amogusimp.utils;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.debug.GoalSelectorDebugRenderer;
import net.tsotciri.amogusimp.entity.ModEntities;
import net.tsotciri.amogusimp.entity.custom.ImposterEntity;

public class ModRegistries  {

    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.IMPOSTER, ImposterEntity.setAttributes());
    }
}
