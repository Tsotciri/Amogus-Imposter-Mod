package net.tsotciri.amogusimp.entity.custom;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tsotciri.amogusimp.sound.ModSounds;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ImposterEntity extends HostileEntity implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public ImposterEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.0f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.5f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 10.0f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, -0.1f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.95f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new MeleeAttackGoal(this, 0.75, false));
        this.goalSelector.add(1,new LookAroundGoal(this));
        this.goalSelector.add(2,new WanderAroundGoal(this, 0.10f));
        this.goalSelector.add(3,new EatGrassGoal(this));
        this.goalSelector.add(4,new WanderAroundFarGoal(this, 0.10f,1.0f));
        this.targetSelector.add(0, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true));
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.imposter.run", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.imposter.idle", true));
        return PlayState.CONTINUE;
    }


    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }


    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.IMPOSTER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.IMPOSTER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.IMPOSTER_DEATH;
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(ModSounds.IMPOSTER_WALK, 0.15f, 1.0f);
    }


}
