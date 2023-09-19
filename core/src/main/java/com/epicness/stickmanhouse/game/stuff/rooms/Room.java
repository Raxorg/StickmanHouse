package com.epicness.stickmanhouse.game.stuff.rooms;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public abstract class Room {

    protected SharedAssets sharedAssets;
    protected GameAssets assets;

    public Room(SharedAssets sharedAssets, GameAssets assets) {
        this.sharedAssets = sharedAssets;
        this.assets = assets;
    }

    public abstract void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer);
}