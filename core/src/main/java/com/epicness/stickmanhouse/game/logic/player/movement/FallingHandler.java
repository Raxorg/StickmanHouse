package com.epicness.stickmanhouse.game.logic.player.movement;

import static com.epicness.stickmanhouse.game.constants.GameConstants.DOWN_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.GRAVITY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.LEFT_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.PLAYER_CLIMBING_SPEED;
import static com.epicness.stickmanhouse.game.constants.GameConstants.PLAYER_RUNNING_SPEED;
import static com.epicness.stickmanhouse.game.constants.GameConstants.RIGHT_KEY;
import static com.epicness.stickmanhouse.game.constants.GameConstants.UP_KEY;
import static com.epicness.stickmanhouse.game.constants.PlayerStatus.CLIMBING;
import static com.epicness.stickmanhouse.game.constants.PlayerStatus.FALLING;
import static com.epicness.stickmanhouse.game.constants.PlayerStatus.IDLE;
import static com.epicness.stickmanhouse.game.constants.PlayerStatus.RUNNING;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.epicness.stickmanhouse.game.logic.GameLogicHandler;
import com.epicness.stickmanhouse.game.logic.other.KeyHandler;
import com.epicness.stickmanhouse.game.logic.player.LadderDetector;
import com.epicness.stickmanhouse.game.logic.player.PlatformDetector;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Ladder;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Player;

public class FallingHandler extends GameLogicHandler {

    private Player player;
    private Vector2 playerSpeed;

    @Override
    protected void init() {
        player = stuff.getHouse3D().getHouse2D().getPlayer();
        playerSpeed = player.speed;
    }

    @Override
    protected void update(float delta) {
        if (player.getStatus() != FALLING) return;

        playerSpeed.y += GRAVITY * delta;
        player.translate(playerSpeed.cpy().scl(delta));

        if (playerSpeed.x != 0f) player.setFlipX(playerSpeed.x < 0f);

        checkLadder();

        PlatformDetector platformDetector = logic.get(PlatformDetector.class);
        if (platformDetector.isGrounded()) {
            if (playerSpeed.x != 0f) {
                playerSpeed.x = PLAYER_RUNNING_SPEED * (playerSpeed.x / Math.abs(playerSpeed.x));
                player.setStatus(RUNNING);
            } else {
                player.setStatus(IDLE);
            }
            Rectangle landedPlatform = platformDetector.getLandedPlatform();
            player.setY(landedPlatform.y + landedPlatform.height);
            playerSpeed.y = 0f;
        }

        if (player.getY() <= 0f) {
            player.setY(0f);
            playerSpeed.y = 0f;
            if (playerSpeed.x != 0f) player.setStatus(RUNNING);
            else player.setStatus(IDLE);
        }
    }

    private void checkLadder() {
        if (!logic.get(LadderDetector.class).isLadderDetected()) return;

        Ladder ladder = logic.get(LadderDetector.class).getDetectedLadder();
        KeyHandler keyHandler = logic.get(KeyHandler.class);

        float playerSpeedX = playerSpeed.x == 0f ? 0f : PLAYER_CLIMBING_SPEED * (playerSpeed.x / Math.abs(playerSpeed.x));
        if (keyHandler.isPressed(UP_KEY) && player.getY() != ladder.getTopY()) {
            playerSpeed.x = playerSpeedX;
            playerSpeed.y = PLAYER_CLIMBING_SPEED;
            player.setStatus(CLIMBING);
        } else if (keyHandler.isPressed(DOWN_KEY) && player.getY() != ladder.getY()) {
            playerSpeed.x = playerSpeedX;
            playerSpeed.y = -PLAYER_CLIMBING_SPEED;
            player.setStatus(CLIMBING);
        }
    }

    @Override
    public void keyDown(int keycode) {
        if (player.getStatus() != FALLING) return;

        switch (keycode) {
            case LEFT_KEY:
                playerSpeed.x -= PLAYER_RUNNING_SPEED;
                break;
            case RIGHT_KEY:
                playerSpeed.x += PLAYER_RUNNING_SPEED;
                break;
        }
    }

    @Override
    public void keyUp(int keycode) {
        if (player.getStatus() != FALLING) return;

        switch (keycode) {
            case LEFT_KEY:
                playerSpeed.x += PLAYER_RUNNING_SPEED;
                break;
            case RIGHT_KEY:
                playerSpeed.x -= PLAYER_RUNNING_SPEED;
                break;
        }
    }
}