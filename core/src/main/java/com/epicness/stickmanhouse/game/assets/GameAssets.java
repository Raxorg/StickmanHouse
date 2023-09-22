package com.epicness.stickmanhouse.game.assets;

import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.ASSETS;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.BEDROOM_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.DINOFRAME_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.FIRE_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.FLAME_ANIMATION;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.KITCHEN_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LADDER_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LIBRARY_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.LIVINGROOM_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_CLIMBING_ANIMATION;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_FALLING_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_IDLE_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.STICKMAN_RUNNING_ANIMATION;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.VENOM_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.WATER_SPRITE;
import static com.epicness.stickmanhouse.game.assets.GameAssetPaths.WIND_SPRITE;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {

    private Sprite[] flames;
    private Sprite[] stickmanClimbing, stickmanRunning;
    private Sprite bedroom, kitchen, library, livingRoom;
    private Sprite dinoFrame;
    private Sprite ladder;
    private Sprite fire, venom, water, wind;
    private Sprite stickmanIdle, stickmanFalling;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    protected void initializeAssets() {
        flames = get(FLAME_ANIMATION);
        stickmanClimbing = get(STICKMAN_CLIMBING_ANIMATION);
        stickmanRunning = get(STICKMAN_RUNNING_ANIMATION);
        bedroom = get(BEDROOM_SPRITE);
        kitchen = get(KITCHEN_SPRITE);
        library = get(LIBRARY_SPRITE);
        livingRoom = get(LIVINGROOM_SPRITE);
        dinoFrame = get(DINOFRAME_SPRITE);
        ladder = get(LADDER_SPRITE);
        fire = get(FIRE_SPRITE);
        venom = get(VENOM_SPRITE);
        water = get(WATER_SPRITE);
        wind = get(WIND_SPRITE);
        stickmanFalling = get(STICKMAN_FALLING_SPRITE);
        stickmanIdle = get(STICKMAN_IDLE_SPRITE);
    }

    public Sprite[] getFlames() {
        return flames;
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

    public Sprite getFire() {
        return fire;
    }

    public Sprite getVenom() {
        return venom;
    }

    public Sprite getWater() {
        return water;
    }

    public Sprite getWind() {
        return wind;
    }

    public Sprite getStickmanIdle() {
        return stickmanIdle;
    }

    public Sprite getStickmanFalling() {
        return stickmanFalling;
    }
}