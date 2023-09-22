package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public abstract class Room {

    protected SharedAssets sharedAssets;
    protected GameAssets assets;
    protected int number;

    public Room(SharedAssets sharedAssets, GameAssets assets, int number) {
        this.sharedAssets = sharedAssets;
        this.assets = assets;
        this.number = number;
    }

    public abstract void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer);
}