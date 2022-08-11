package net.tsotciri.amogusimp.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.tsotciri.amogusimp.AmogusImposter;
import net.tsotciri.amogusimp.entity.custom.ImposterEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
public class ImposterRenderer extends GeoEntityRenderer<ImposterEntity> {
    public ImposterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ImposterModel());
    }

    @Override
    public Identifier getTextureResource(ImposterEntity instance) {
        return new Identifier(AmogusImposter.MOD_ID, "textures/entity/imposter/imposter.png");
    }
}