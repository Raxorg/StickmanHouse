package com.epicness.stickmanhouse.game.stuff.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class LivingRoom extends Room {

    private final Sprited background;
    private final Sprited dinoFrame;

    public LivingRoom(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets);

        background = new Sprited(sharedAssets.getPixel());
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);

        dinoFrame = new Sprited(assets.getDinoFrame());
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        background.draw(spriteBatch);
        dinoFrame.draw(spriteBatch);
    }
}