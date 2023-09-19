package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Kitchen extends Room {

    private final Sprited background;


    public Kitchen(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets);

        background = new Sprited(assets.getLivingRoom());
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        background.draw(spriteBatch);
    }
}