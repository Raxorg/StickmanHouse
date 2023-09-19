package com.epicness.stickmanhouse.game.logic.player;

import static com.epicness.stickmanhouse.game.constants.GameConstants.PLAYER_STARTING_X;

import com.epicness.stickmanhouse.game.logic.GameLogicHandler;

public class PlayerSpawner extends GameLogicHandler {

    @Override
    protected void init() {
        stuff.getHouse3D().getHouse2D().getPlayer().setPosition(PLAYER_STARTING_X, 0f);
        logic.get(LadderDetector.class).detectLadder();
    }
}