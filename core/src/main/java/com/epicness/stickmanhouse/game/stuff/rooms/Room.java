package com.epicness.stickmanhouse.game.stuff.rooms;

import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public abstract class Room {

    protected SharedAssets sharedAssets;
    protected GameAssets assets;

    public Room(SharedAssets sharedAssets, GameAssets assets) {
        this.sharedAssets = sharedAssets;
        this.assets = assets;
    }
}