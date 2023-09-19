package com.epicness.stickmanhouse.game.stuff.rooms;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class LivingRoom extends Room {

    private Sprited dinoFrame;

    public LivingRoom(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {

    }
}