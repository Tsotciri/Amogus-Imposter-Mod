package net.tsotciri.amogusimp.entity.client;

import net.minecraft.util.Identifier;
import net.tsotciri.amogusimp.AmogusImposter;
import net.tsotciri.amogusimp.entity.custom.ImposterEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ImposterModel  extends AnimatedGeoModel<ImposterEntity> {
    @Override
    public Identifier getModelResource(ImposterEntity object) {
        return new Identifier(AmogusImposter.MOD_ID, "geo/imposter.geo.json");
    }

    @Override
    public Identifier getTextureResource(ImposterEntity object) {
        return new Identifier(AmogusImposter.MOD_ID, "textures/entity/imposter/imposter.png");
    }

    @Override
    public Identifier getAnimationResource(ImposterEntity animatable) {
        return new Identifier(AmogusImposter.MOD_ID, "animations/imposter.animation.json");
    }

}