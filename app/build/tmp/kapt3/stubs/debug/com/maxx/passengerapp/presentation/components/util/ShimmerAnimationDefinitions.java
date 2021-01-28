package com.maxx.passengerapp.presentation.components.util;

import java.lang.System;

/**
 * Inspiration from:
 * https://github.com/Gurupreet/ComposeCookBook/blob/master/app/src/main/java/com/guru/composecookbook/ui/Animations/AnimationDefinitions.kt
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/maxx/passengerapp/presentation/components/util/ShimmerAnimationDefinitions;", "", "widthPx", "", "heightPx", "animationDuration", "", "animationDelay", "(FFII)V", "gradientWidth", "getGradientWidth", "()F", "setGradientWidth", "(F)V", "shimmerTranslateAnimation", "Landroidx/compose/animation/core/TransitionDefinition;", "Lcom/maxx/passengerapp/presentation/components/util/ShimmerAnimationDefinitions$AnimationState;", "getShimmerTranslateAnimation", "()Landroidx/compose/animation/core/TransitionDefinition;", "xShimmerPropKey", "Landroidx/compose/animation/core/FloatPropKey;", "getXShimmerPropKey", "()Landroidx/compose/animation/core/FloatPropKey;", "yShimmerPropKey", "getYShimmerPropKey", "AnimationState", "app_debug"})
public final class ShimmerAnimationDefinitions {
    private float gradientWidth;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.animation.core.FloatPropKey xShimmerPropKey = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.animation.core.FloatPropKey yShimmerPropKey = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.animation.core.TransitionDefinition<com.maxx.passengerapp.presentation.components.util.ShimmerAnimationDefinitions.AnimationState> shimmerTranslateAnimation = null;
    private final float widthPx = 0.0F;
    private final float heightPx = 0.0F;
    private final int animationDuration = 0;
    private final int animationDelay = 0;
    
    public final float getGradientWidth() {
        return 0.0F;
    }
    
    public final void setGradientWidth(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.animation.core.FloatPropKey getXShimmerPropKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.animation.core.FloatPropKey getYShimmerPropKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.animation.core.TransitionDefinition<com.maxx.passengerapp.presentation.components.util.ShimmerAnimationDefinitions.AnimationState> getShimmerTranslateAnimation() {
        return null;
    }
    
    public ShimmerAnimationDefinitions(float widthPx, float heightPx, int animationDuration, int animationDelay) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/maxx/passengerapp/presentation/components/util/ShimmerAnimationDefinitions$AnimationState;", "", "(Ljava/lang/String;I)V", "START", "END", "app_debug"})
    public static enum AnimationState {
        /*public static final*/ START /* = new START() */,
        /*public static final*/ END /* = new END() */;
        
        AnimationState() {
        }
    }
}