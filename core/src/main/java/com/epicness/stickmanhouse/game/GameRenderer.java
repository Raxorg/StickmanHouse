package com.epicness.stickmanhouse.game;

import static com.badlogic.gdx.graphics.Color.RED;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.renderer.Renderer;
import com.epicness.stickmanhouse.game.stuff.GameStuff;

public class GameRenderer extends Renderer<GameStuff> {

    private final OrthographicCamera houseCamera;
    private final PerspectiveCamera perspectiveCamera;
    private final ModelBatch modelBatch;

    public GameRenderer() {
        shapeDrawer.setDefaultLineWidth(2f);

        houseCamera = new OrthographicCamera();
        houseCamera.setToOrtho(false, CAMERA_WIDTH, CAMERA_HEIGHT);

        perspectiveCamera = new PerspectiveCamera(67f, CAMERA_WIDTH, CAMERA_HEIGHT);
        perspectiveCamera.far = 1000f;

        modelBatch = new ModelBatch();
    }

    @Override
    public void render() {
        ScreenUtils.clear(RED, true);

        spriteBatch.begin();
        stuff.getHouse3D().draw2D(spriteBatch, shapeDrawer, houseCamera);
        spriteBatch.end();

        modelBatch.begin(perspectiveCamera);
        stuff.getHouse3D().draw3D(modelBatch);
        modelBatch.end();
    }

    public PerspectiveCamera getPerspectiveCamera() {
        return perspectiveCamera;
    }
}