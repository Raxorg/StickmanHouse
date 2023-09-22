package com.epicness.stickmanhouse.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {

    public static final List<AssetDescriptor<?>> ASSETS;
    public static final AssetDescriptor<Sprite[]> FLAME_ANIMATION;
    public static final AssetDescriptor<Sprite[]> STICKMAN_CLIMBING_ANIMATION;
    public static final AssetDescriptor<Sprite[]> STICKMAN_RUNNING_ANIMATION;
    public static final AssetDescriptor<Sprite> BEDROOM_SPRITE;
    public static final AssetDescriptor<Sprite> KITCHEN_SPRITE;
    public static final AssetDescriptor<Sprite> LIBRARY_SPRITE;
    public static final AssetDescriptor<Sprite> LIVINGROOM_SPRITE;
    public static final AssetDescriptor<Sprite> DINOFRAME_SPRITE;
    public static final AssetDescriptor<Sprite> LADDER_SPRITE;
    public static final AssetDescriptor<Sprite> FIRE_SPRITE;
    public static final AssetDescriptor<Sprite> VENOM_SPRITE;
    public static final AssetDescriptor<Sprite> WATER_SPRITE;
    public static final AssetDescriptor<Sprite> WIND_SPRITE;
    public static final AssetDescriptor<Sprite> STICKMAN_FALLING_SPRITE;
    public static final AssetDescriptor<Sprite> STICKMAN_IDLE_SPRITE;

    static {
        ASSETS = new ArrayList<>();
        ASSETS.add(FLAME_ANIMATION = descriptor("flameSheet.anim", Sprite[].class));
        ASSETS.add(STICKMAN_CLIMBING_ANIMATION = descriptor("stickmanClimbing.anim", Sprite[].class));
        ASSETS.add(STICKMAN_RUNNING_ANIMATION = descriptor("stickmanRunning.anim", Sprite[].class));
        ASSETS.add(BEDROOM_SPRITE = descriptor("bedroom.png", Sprite.class));
        ASSETS.add(KITCHEN_SPRITE = descriptor("kitchen.png", Sprite.class));
        ASSETS.add(LIBRARY_SPRITE = descriptor("library.png", Sprite.class));
        ASSETS.add(LIVINGROOM_SPRITE = descriptor("livingRoom.png", Sprite.class));
        ASSETS.add(DINOFRAME_SPRITE = descriptor("dinoFrame.png", Sprite.class));
        ASSETS.add(LADDER_SPRITE = descriptor("ladder.png", Sprite.class));
        ASSETS.add(FIRE_SPRITE = descriptor("library.png", Sprite.class));
        ASSETS.add(VENOM_SPRITE = descriptor("library.png", Sprite.class));
        ASSETS.add(WATER_SPRITE = descriptor("library.png", Sprite.class));
        ASSETS.add(WIND_SPRITE = descriptor("library.png", Sprite.class));
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