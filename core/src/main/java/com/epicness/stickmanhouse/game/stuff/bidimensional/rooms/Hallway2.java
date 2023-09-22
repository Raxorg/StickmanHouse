package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Inventory;

public class Hallway2 extends Room {

    private final Sprited background;
    private final Inventory inventory;

    public Hallway2(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets, 3);

        background = new Sprited(sharedAssets.getPixel());
        background.setX(CAMERA_WIDTH * number);
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);

        inventory = new Inventory(sharedAssets, assets);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        background.draw(spriteBatch);
        inventory.draw(spriteBatch, shapeDrawer);
    }
}