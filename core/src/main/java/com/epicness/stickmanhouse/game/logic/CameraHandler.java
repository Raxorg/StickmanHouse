package com.epicness.stickmanhouse.game.logic;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.utils.FirstPersonCameraController;

public class CameraHandler extends GameLogicHandler {

    private FirstPersonCameraController cameraController;
    private boolean usingCamera;

    @Override
    protected void init() {
        PerspectiveCamera camera = renderer.getPerspectiveCamera();
        camera.near = 0.001f;
        camera.translate(0f, 0f, 5f);
        camera.update();
        cameraController = new FirstPersonCameraController(camera);
    }

    @Override
    protected void update(float delta) {
        if (!usingCamera) return;
        cameraController.update();
    }

    @Override
    public void keyDown(int keycode) {
        if (!usingCamera) return;
        cameraController.keyDown(keycode);
    }

    @Override
    public void keyUp(int keycode) {
        cameraController.keyUp(keycode);
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (button == Input.Buttons.RIGHT) usingCamera = true;
    }

    @Override
    public void touchDragged(float x, float y) {
        if (!usingCamera) return;
        cameraController.touchDragged((int) x, (int) y, 0);
    }

    @Override
    public void touchUp(float x, float y) {
        usingCamera = false;
    }
}