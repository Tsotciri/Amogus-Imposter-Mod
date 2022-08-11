package net.tsotciri.amogusimp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tsotciri.amogusimp.entity.ModEntities;
import net.tsotciri.amogusimp.entity.client.ImposterRenderer;
import net.tsotciri.amogusimp.sound.ModSounds;

public class AmogusImposterClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.IMPOSTER, ImposterRenderer::new);
        ModSounds.registerSounds();
    }
}
