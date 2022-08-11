package net.tsotciri.amogusimp.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tsotciri.amogusimp.AmogusImposter;
import net.tsotciri.amogusimp.entity.custom.ImposterEntity;

public class ModEntities {
    public static final EntityType<ImposterEntity> IMPOSTER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AmogusImposter.MOD_ID, "imposter"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ImposterEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.5f)).build());
}
