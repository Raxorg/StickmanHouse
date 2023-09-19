package com.epicness.stickmanhouse.game.stuff.tridimensional;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.tridimensional.Screen3D;
import com.epicness.fundamentals.stuff.shapes.tridimensional.cylinder.Cylinder;
import com.epicness.fundamentals.stuff.shapes.tridimensional.plane.Plane;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.bidimensional.House2D;

import java.util.ArrayList;
import java.util.List;

public class House3D {

    private final List<Screen3D<Plane>> planeScreens;
    private final List<Screen3D<Cylinder>> cylinderScreens;
    private final House2D house2D;

    public House3D(SharedAssets sharedAssets, GameAssets assets) {
        planeScreens = new ArrayList<>();
        cylinderScreens = new ArrayList<>();
        house2D = new House2D(sharedAssets, assets);
        spawnWalls();
        spawnCorners();
    }

    private void spawnWalls() {
        for (int i = 0; i < 8; i += 2) {
            Screen3D<Plane> plane = new Screen3D<>(
                new Plane(5f, 3f),
                i * CAMERA_WIDTH, 0f,
                CAMERA_WIDTH, CAMERA_HEIGHT);
            plane.setScreen2D(house2D);
            planeScreens.add(plane);
        }

    }

    private void spawnCorners() {
        for (int i = 1; i < 8; i += 2) {
            Screen3D<Cylinder> cylinder = new Screen3D<>(
                new Cylinder(5f, 3f, 5f, 90f),
                i * CAMERA_WIDTH, 0f,
                CAMERA_WIDTH, CAMERA_HEIGHT);
            cylinder.setScreen2D(house2D);
            cylinderScreens.add(cylinder);
        }
    }

    @SuppressWarnings("GDXJavaFlushInsideLoop")
    public void draw2D(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer, OrthographicCamera camera) {
        for (int i = 0; i < planeScreens.size(); i++) {
            planeScreens.get(i).draw2D(spriteBatch, shapeDrawer, camera);
        }
        for (int i = 0; i < cylinderScreens.size(); i++) {
            cylinderScreens.get(i).draw2D(spriteBatch, shapeDrawer, camera);
        }
    }

    public void draw3D(ModelBatch modelBatch) {
        for (int i = 0; i < planeScreens.size(); i++) {
            planeScreens.get(i).draw3D(modelBatch);
        }
        for (int i = 0; i < cylinderScreens.size(); i++) {
            cylinderScreens.get(i).draw3D(modelBatch);
        }
    }
}