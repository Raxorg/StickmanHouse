package com.epicness.stickmanhouse.game.constants;

import static com.badlogic.gdx.Input.Keys.A;
import static com.badlogic.gdx.Input.Keys.D;
import static com.badlogic.gdx.Input.Keys.S;
import static com.badlogic.gdx.Input.Keys.W;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HALF_WIDTH;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;
import static com.epicness.fundamentals.constants.SharedConstants.RATIO;

public class GameConstants {

    public static final int UP_KEY = W;
    public static final int LEFT_KEY = A;
    public static final int DOWN_KEY = S;
    public static final int RIGHT_KEY = D;

    public static final float STICKMAN_WORLD_WIDTH = CAMERA_WIDTH * 8f;
    public static final float STICKMAN_WORLD_HEIGHT = CAMERA_HEIGHT;

    public static final float DECAL_SCREEN_HEIGHT = 5f;
    public static final float DECAL_SCREEN_WIDTH = DECAL_SCREEN_HEIGHT * RATIO;
    public static final float DECAL_CUBE_XZ_RADIUS = DECAL_SCREEN_WIDTH / 2f;
    public static final float DECAL_CUBE_Y_RADIUS = DECAL_SCREEN_HEIGHT / 2f;

    public static final float LADDER_WIDTH = 75f;
    public static final float LADDER_PART_HEIGHT = LADDER_WIDTH * 2f;

    private static final float PLAYER_PNG_WIDTH = 82f;
    private static final float PLAYER_PNG_HEIGHT = 110f;
    private static final float PLAYER_RATIO = PLAYER_PNG_WIDTH / PLAYER_PNG_HEIGHT;
    public static final float PLAYER_HEIGHT = 350f;
    public static final float PLAYER_WIDTH = PLAYER_HEIGHT * PLAYER_RATIO;

    public static final float PLAYER_STARTING_X = CAMERA_HALF_WIDTH - PLAYER_WIDTH / 2f;

    public static final float PLAYER_RUNNING_SPEED = 1200f;
    public static final float PLAYER_CLIMBING_SPEED = PLAYER_RUNNING_SPEED / 2f;
    public static final float GRAVITY = -1000f;

    public static final float FLAME_SIZE = CAMERA_HEIGHT / 5f;
}