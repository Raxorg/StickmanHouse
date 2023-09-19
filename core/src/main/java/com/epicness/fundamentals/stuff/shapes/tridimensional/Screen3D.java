package com.epicness.fundamentals.stuff.shapes.tridimensional;

import static com.badlogic.gdx.graphics.Color.CLEAR;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Screen2D;

public class Screen3D<S extends Shape3D<?, ?>> {

    protected final S shape;
    public final float offsetX2D, offsetY2D, cameraX, cameraY;
    private final FrameBuffer frameBuffer;
    private final Sprite bufferSprite;
    private Screen2D screen2D;

    public Screen3D(S shape, float offsetX2D, float offsetY2D, float cameraWidth, float cameraHeight, Screen2D screen2D) {
        this.shape = shape;
        this.offsetX2D = offsetX2D;
        this.offsetY2D = offsetY2D;
        this.cameraX = offsetX2D + cameraWidth / 2f;
        this.cameraY = offsetY2D + cameraHeight / 2f;
        frameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), false);
        bufferSprite = new Sprite();
        bufferSprite.setSize(cameraWidth, cameraHeight);
        this.screen2D = screen2D;
    }

    public Screen3D(S shape, float offsetX2D, float offsetY2D, float cameraWidth, float cameraHeight) {
        this(shape, offsetX2D, offsetY2D, cameraWidth, cameraHeight, null);
    }

    public final void draw2D(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer, OrthographicCamera camera) {
        begin(spriteBatch, shapeDrawer, camera);
        screen2D.draw(spriteBatch, shapeDrawer);
        end(spriteBatch);
    }

    private void begin(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer, OrthographicCamera camera) {
        // Move the camera and use its new projection matrix
        camera.position.set(cameraX, cameraY, 0f);
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
        shapeDrawer.update();
        // Render to frame buffer
        frameBuffer.bind();
        ScreenUtils.clear(CLEAR);
    }

    private void end(SpriteBatch spriteBatch) {
        spriteBatch.flush();
        frameBuffer.end();
        // Set the frame buffer's texture as the decal's texture
        bufferSprite.setRegion(frameBuffer.getColorBufferTexture());
        bufferSprite.flip(false, true);
        shape.setSprite(bufferSprite);
    }

    public final void draw3D(ModelBatch modelBatch) {
        shape.draw(modelBatch);
    }

    public final void drawDebug3D(ModelBatch modelBatch) {
        shape.drawDebug(modelBatch);
    }

    public S getShape() {
        return shape;
    }

    public void setScreen2D(Screen2D screen2D) {
        this.screen2D = screen2D;
    }
}