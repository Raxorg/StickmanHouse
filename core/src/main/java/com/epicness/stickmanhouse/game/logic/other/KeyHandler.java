package com.epicness.stickmanhouse.game.logic.other;

import static com.epicness.stickmanhouse.game.constants.GameConstants.DOWN_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.LEFT_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.RIGHT_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.UP_KEY;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.stickmanhouse.game.logic.GameLogicHandler;
import com.epicness.stickmanhouse.game.logic.player.movement.IdleHandler;

public class KeyHandler extends GameLogicHandler {

    private DelayedRemovalArray<Integer> pressedKeys;

    @Override
    protected void init() {
        pressedKeys = new DelayedRemovalArray<>();
        checkKey(UP_KEY);
        checkKey(DOWN_KEY);
        checkKey(LEFT_KEY);
        checkKey(RIGHT_KEY);
    }

    private void checkKey(int keycode) {
        if (Gdx.input.isKeyPressed(keycode)) {
            logic.get(IdleHandler.class).keyDown(keycode);
        }
    }

    @Override
    public void keyDown(int keycode) {
        pressedKeys.add(keycode);
    }

    @Override
    public void keyUp(int keycode) {
        pressedKeys.removeValue(keycode, true);
    }

    public boolean isPressed(int keycode) {
        return pressedKeys.contains(keycode, true);
    }

    public boolean areAllPressed(int... keycodes) {
        for (int i = 0; i < keycodes.length; i++) {
            if (!pressedKeys.contains(keycodes[i], true)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEitherPressed(int... keycodes) {
        for (int i = 0; i < keycodes.length; i++) {
            if (pressedKeys.contains(keycodes[i], true)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNonePressed(int... keycodes) {
        for (int i = 0; i < keycodes.length; i++) {
            if (pressedKeys.contains(keycodes[i], true)) {
                return false;
            }
        }
        return true;
    }
}