package com.epicness.stickmanhouse.game.assets;

import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.ASSETS;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.DINOFRAME_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LADDER_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_CLIMBING_ANIMATION;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_FALLING_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_IDLE_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_RUNNING_ANIMATION;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {

    private Sprite[] stickmanClimbing;
    private Sprite[] stickmanRunning;
    private Sprite dinoFrame;
    private Sprite ladder;
    private Sprite stickmanIdle;
    private Sprite stickmanFalling;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    protected void initializeAssets() {
        stickmanClimbing = get(STICKMAN_CLIMBING_ANIMATION);
        stickmanRunning = get(STICKMAN_RUNNING_ANIMATION);
        dinoFrame = get(DINOFRAME_SPRITE);
        ladder = get(LADDER_SPRITE);
        stickmanFalling = get(STICKMAN_FALLING_SPRITE);
        stickmanIdle = get(STICKMAN_IDLE_SPRITE);
    }

    public Sprite[] getStickmanClimbing() {
        return stickmanClimbing;
    }

    public Sprite[] getStickmanRunning() {
        return stickmanRunning;
    }

    public Sprite getDinoFrame() {
        return dinoFrame;
    }

    public Sprite getLadder() {
        return ladder;
    }

    public Sprite getStickmanIdle() {
        return stickmanIdle;
    }

    public Sprite getStickmanFalling() {
        return stickmanFalling;
    }
}