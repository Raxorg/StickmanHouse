package com.epicness.stickmanhouse.game.assets;

import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.ASSETS;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.BEDROOM_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.DINOFRAME_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.KITCHEN_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LADDER_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LIBRARY_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LIVINGROOM_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_CLIMBING_ANIMATION;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_FALLING_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_IDLE_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_RUNNING_ANIMATION;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {

    private Sprite[] stickmanClimbing, stickmanRunning;
    private Sprite bedroom, kitchen, library, livingRoom;
    private Sprite dinoFrame;
    private Sprite ladder;
    private Sprite stickmanIdle, stickmanFalling;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    protected void initializeAssets() {
        stickmanClimbing = get(STICKMAN_CLIMBING_ANIMATION);
        stickmanRunning = get(STICKMAN_RUNNING_ANIMATION);
        bedroom = get(BEDROOM_SPRITE);
        kitchen = get(KITCHEN_SPRITE);
        library = get(LIBRARY_SPRITE);
        livingRoom = get(LIVINGROOM_SPRITE);
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

    public Sprite getBedroom() {
        return bedroom;
    }

    public Sprite getKitchen() {
        return kitchen;
    }

    public Sprite getLibrary() {
        return library;
    }

    public Sprite getLivingRoom() {
        return livingRoom;
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