package com.epicness.stickmanhouse.game.logic;

import com.epicness.fundamentals.logic.Logic;
import com.epicness.stickmanhouse.game.logic.other.CameraHandler;
import com.epicness.stickmanhouse.game.logic.other.KeyHandler;
import com.epicness.stickmanhouse.game.logic.other.WorldCornerHandler;
import com.epicness.stickmanhouse.game.logic.player.LadderDetector;
import com.epicness.stickmanhouse.game.logic.player.PlatformDetector;
import com.epicness.stickmanhouse.game.logic.player.PlayerSpawner;
import com.epicness.stickmanhouse.game.logic.player.movement.ClimbingHandler;
import com.epicness.stickmanhouse.game.logic.player.movement.FallingHandler;
import com.epicness.stickmanhouse.game.logic.player.movement.IdleHandler;
import com.epicness.stickmanhouse.game.logic.player.movement.MovementHandler;
import com.epicness.stickmanhouse.game.logic.player.movement.RunningHandler;
import com.epicness.stickmanhouse.game.logic.rooms.FlameHandler;

public class GameLogic extends Logic {

    // Player movement
    private final MovementHandler movementHandler;
    // Player
    private final LadderDetector ladderDetector;
    private final PlatformDetector platformDetector;
    // Rooms
    private final FlameHandler flameHandler;
    // Other
    private final CameraHandler cameraHandler;
    private final WorldCornerHandler worldCornerHandler;

    public GameLogic() {
        // Player
        registerHandler(ladderDetector = new LadderDetector());
        registerHandler(platformDetector = new PlatformDetector());
        registerHandler(new PlayerSpawner());
        // Player movement
        registerHandler(new ClimbingHandler());
        registerHandler(new FallingHandler());
        registerHandler(new IdleHandler());
        registerHandler(movementHandler = new MovementHandler());
        registerHandler(new RunningHandler());
        // Rooms
        registerHandler(flameHandler = new FlameHandler());
        // Other
        registerHandler(cameraHandler = new CameraHandler());
        registerHandler(0, new KeyHandler());
        registerHandler(worldCornerHandler = new WorldCornerHandler());
    }

    @Override
    public void update() {
        // Player movement
        movementHandler.update();
        // Player
        ladderDetector.update();
        platformDetector.update();
        // Rooms
        flameHandler.update();
        // Other
        cameraHandler.update();
        worldCornerHandler.update();
    }
}