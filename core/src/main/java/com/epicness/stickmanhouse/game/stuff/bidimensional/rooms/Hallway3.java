package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Hallway3 extends Room {

    private final Sprited dinoFrame;

    public Hallway3(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets, 5);

        dinoFrame = new Sprited(assets.getDinoFrame());
        dinoFrame.setX(CAMERA_WIDTH * 5.5f - dinoFrame.getWidth() / 2f);
        dinoFrame.setY(CAMERA_HEIGHT * 0.5f);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        dinoFrame.draw(spriteBatch);
    }
}