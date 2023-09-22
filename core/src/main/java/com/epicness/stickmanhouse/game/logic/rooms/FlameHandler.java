package com.epicness.stickmanhouse.game.logic.rooms;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;
import static com.epicness.stickmanhouse.game.constants.GameConstants.FLAME_SIZE;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.fundamentals.stuff.SpritedAnimation;
import com.epicness.stickmanhouse.game.logic.GameLogicHandler;

public class FlameHandler extends GameLogicHandler {

    private SpritedAnimation[] flames;

    @Override
    protected void init() {
        flames = stuff.getHouse3D().getHouse2D().getHallway1().getFlames();
        for (int i = 0; i < 10; i++) {
            flames[i] = new SpritedAnimation(MathUtils.random(0.03f, 0.04f), assets.getFlames());
            flames[i].setSize(200f);
            flames[i].enableLooping();
            flames[i].setOriginCenter();
        }
        for (int i = 0; i < 5; i++) {
            flames[i].setX(CAMERA_WIDTH);
            flames[i].setY(FLAME_SIZE * i);
            flames[i].rotate(270f);
        }

        for (int i = 5; i < 10; i++) {
            flames[i].setX(CAMERA_WIDTH * 2f - FLAME_SIZE);
            flames[i].setY(FLAME_SIZE * (i - 5));
            flames[i].rotate(90f);
        }
    }

    @Override
    protected void update(float delta) {
        for (int i = 0; i < flames.length; i++) {
            flames[i].addTime(delta);
        }
    }
}