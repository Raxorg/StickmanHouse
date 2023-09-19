package com.epicness.stickmanhouse.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {

    public static final List<AssetDescriptor<?>> ASSETS;
    public static final AssetDescriptor<Sprite> DINOFRAME_SPRITE;

    static {
        ASSETS = new ArrayList<>();
        ASSETS.add(DINOFRAME_SPRITE = new AssetDescriptor<>("stickmanhouse/dinoFrame.png", Sprite.class));
    }
}