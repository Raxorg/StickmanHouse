package com.epicness.stickmanhouse.game.stuff.bidimensional;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.fundamentals.stuff.Text;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Inventory {

    private final Text title;
    private final Rectangle[] frames;
    private final Sprited[] items;

    public Inventory(SharedAssets sharedAssets, GameAssets assets) {
        title = new Text(sharedAssets.getTimesSquare());
        title.setText("Inventory");
        title.setTextTargetWidth(CAMERA_WIDTH);

        frames = new Rectangle[4];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new Rectangle(
                0f, 0f,
                100f, 100f
            );
            frames[i].x = CAMERA_WIDTH * 3f;
        }

        items = new Sprited[4];
        items[0] = new Sprited(assets.getFire());
        items[1] = new Sprited(assets.getVenom());
        items[2] = new Sprited(assets.getWater());
        items[3] = new Sprited(assets.getWind());
        for (int i = 0; i < items.length; i++) {
            items[i].setSize(100f);
        }
    }

    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        title.draw(spriteBatch);
        for (int i = 0; i < frames.length; i++) {
            shapeDrawer.rectangle(frames[i]);
        }
        for (int i = 0; i < items.length; i++) {
            items[i].draw(spriteBatch);
        }
    }
}