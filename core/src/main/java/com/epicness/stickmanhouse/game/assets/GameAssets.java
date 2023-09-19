package com.epicness.stickmanhouse.game.assets;

import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.ASSETS;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.DINOFRAME_SPRITE;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {

    private Sprite dinoFrame;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    protected void initializeAssets() {
        dinoFrame = get(DINOFRAME_SPRITE);
    }

    public Sprite getDinoFrame() {
        return dinoFrame;
    }
}