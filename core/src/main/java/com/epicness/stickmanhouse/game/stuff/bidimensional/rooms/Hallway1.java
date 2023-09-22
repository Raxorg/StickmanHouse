package com.epicness.stickmanhouse.game.stuff.bidimensional.rooms;

import static com.badlogic.gdx.graphics.GL20.GL_ONE;
import static com.badlogic.gdx.graphics.GL20.GL_ONE_MINUS_SRC_ALPHA;
import static com.badlogic.gdx.graphics.GL20.GL_SRC_ALPHA;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.fundamentals.stuff.SpritedAnimation;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class Hallway1 extends Room {

    private final Sprited background;
    private final SpritedAnimation[] flames;

    public Hallway1(SharedAssets sharedAssets, GameAssets assets) {
        super(sharedAssets, assets, 1);

        background = new Sprited(sharedAssets.getPixel());
        background.setX(CAMERA_WIDTH);
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);
        background.setColor(Color.BLACK);

        flames = new SpritedAnimation[10];
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        background.draw(spriteBatch);
        for (int i = 0; i < flames.length; i++) {
            flames[i].draw(spriteBatch);
        }
    }

    public SpritedAnimation[] getFlames() {
        return flames;
    }
}