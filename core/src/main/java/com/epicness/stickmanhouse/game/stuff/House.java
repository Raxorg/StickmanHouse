package com.epicness.stickmanhouse.game.stuff;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.epicness.fundamentals.stuff.shapes.tridimensional.Screen3D;
import com.epicness.fundamentals.stuff.shapes.tridimensional.cylinder.Cylinder;
import com.epicness.fundamentals.stuff.shapes.tridimensional.plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class House {

    private final List<Screen3D<Plane>> planeScreens;
    private final List<Screen3D<Cylinder>> cylinderScreens;

    public House() {
        planeScreens = new ArrayList<>();
        cylinderScreens = new ArrayList<>();
        spawnWalls();
        spawnCorners();
    }

    private void spawnWalls() {
        for (int i = 0; i < 8; i += 2) {
            Screen3D<Plane> plane = new Screen3D<>(
                new Plane(5f, 3f),
                i * CAMERA_WIDTH, 0f,
                CAMERA_WIDTH, CAMERA_HEIGHT);
            planeScreens.add(plane);
        }
    }

    private void spawnCorners() {

    }
}