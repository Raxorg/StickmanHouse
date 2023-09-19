package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Hallway1 extends Room {

    private final Sprited dinoFrame;

    public Hallway1(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets);

        dinoFrame = new Sprited(assets.getDinoFrame());
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        dinoFrame.draw(spriteBatch);
    }
}