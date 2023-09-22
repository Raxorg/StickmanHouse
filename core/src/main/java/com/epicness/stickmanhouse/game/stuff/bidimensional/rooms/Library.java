package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Library extends Room {

    private final Sprited background;

    public Library(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets, 4);

        background = new Sprited(assets.getLibrary());
        background.setX(CAMERA_WIDTH * number);
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        background.draw(spriteBatch);
    }
}