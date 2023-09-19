package com.epicness.stickmanhouse.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.stickmanhouse.game.logic.other.CameraHandler;

public class GameLogic extends Logic {

    private final CameraHandler cameraHandler;

    public GameLogic() {
        registerHandler(cameraHandler = new CameraHandler());
    }

    @Override
    public void update() {
        cameraHandler.update();
    }
}