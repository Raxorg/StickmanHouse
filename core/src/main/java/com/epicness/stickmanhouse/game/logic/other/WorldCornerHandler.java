package com.epicness.stickmanhouse.game.logic.other;

import static com.epicness.stickmanhouse.game.constants.GameConstants.STICKMAN_WORLD_WIDTH;

import com.epicness.stickmanhouse.game.logic.GameLogicHandler;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Player;

public class WorldCornerHandler extends GameLogicHandler {

    private Player player, playerMirror;

    @Override
    protected void init() {
        player = stuff.getHouse3D().getHouse2D().getPlayer();
        playerMirror = stuff.getHouse3D().getHouse2D().getPlayerMirror();
    }

    @Override
    protected void update(float delta) {
        if (player.getEndX() >= STICKMAN_WORLD_WIDTH) {
            player.setX(player.getX() - STICKMAN_WORLD_WIDTH);
        }
        if (player.getEndX() <= 0f) {
            player.setX(player.getX() + STICKMAN_WORLD_WIDTH);
        }
        playerMirror.setPosition(player.getX() + STICKMAN_WORLD_WIDTH, player.getY());
        playerMirror.setStatus(player.getStatus());
        playerMirror.setFlipX(player.isFlipX());
        playerMirror.setTime(player.getTime());
    }
}