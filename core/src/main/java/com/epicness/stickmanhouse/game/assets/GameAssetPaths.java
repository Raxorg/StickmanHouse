package com.epicness.stickmanhouse.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {

    public static final List<AssetDescriptor<?>> ASSETS;
    public static final AssetDescriptor<Sprite[]> STICKMAN_CLIMBING_ANIMATION;
    public static final AssetDescriptor<Sprite[]> STICKMAN_RUNNING_ANIMATION;
    public static final AssetDescriptor<Sprite> DINOFRAME_SPRITE;
    public static final AssetDescriptor<Sprite> LADDER_SPRITE;
    public static final AssetDescriptor<Sprite> STICKMAN_FALLING_SPRITE;
    public static final AssetDescriptor<Sprite> STICKMAN_IDLE_SPRITE;

    static {
        ASSETS = new ArrayList<>();
        ASSETS.add(STICKMAN_CLIMBING_ANIMATION = descriptor("stickmanClimbing.anim", Sprite[].class));
        ASSETS.add(STICKMAN_RUNNING_ANIMATION = descriptor("stickmanRunning.anim", Sprite[].class));
        ASSETS.add(DINOFRAME_SPRITE = descriptor("dinoFrame.png", Sprite.class));
        ASSETS.add(LADDER_SPRITE = descriptor("ladder.png", Sprite.class));
        ASSETS.add(STICKMAN_FALLING_SPRITE = descriptor("stickmanFalling.png", Sprite.class));
        ASSETS.add(STICKMAN_IDLE_SPRITE = descriptor("stickmanIdle.png", Sprite.class));
    }

    private static <T> AssetDescriptor<T> descriptor(String path, Class<T> assetClass) {
        switch (assetClass.getSimpleName()) {
            case "Sprite":
            case "Texture":
                return new AssetDescriptor<>("stickmanhouse/images/" + path, assetClass);
            case "Sprite[]":
            default:
                return new AssetDescriptor<>("stickmanhouse/animations/" + path, assetClass);
        }
    }
}