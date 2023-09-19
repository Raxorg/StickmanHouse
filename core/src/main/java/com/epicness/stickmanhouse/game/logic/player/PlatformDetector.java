package com.epicness.stickmanhouse.game.logic.player;

import static com.badlogic.gdx.graphics.Color.RED;
import static com.badlogic.gdx.graphics.Color.YELLOW;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.stickmanhouse.game.logic.GameLogicHandler;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Ladder;
import com.epicness.stickmanhouse.game.stuff.bidimensional.Player;

public class PlatformDetector extends GameLogicHandler {

    private Player player;
    private DelayedRemovalArray<Ladder> ladders;
    private float lastPlayerY;
    private boolean grounded;
    private Rectangle landedPlatform;

    @Override
    protected void init() {
        player = stuff.getHouse3D().getHouse2D().getPlayer();
        ladders = stuff.getHouse3D().getHouse2D().getLadders();

        lastPlayerY = player.getY();
        grounded = true;
        landedPlatform = null;
    }

    @Override
    protected void update(float delta) {
        grounded = false;
        if (player.getY() == 0f) {
            grounded = true;
            lastPlayerY = player.getY();
            return;
        }

        // Check if we're still grounded
        if (landedPlatform != null && player.getY() == landedPlatform.y + landedPlatform.height) {
            float playerX = player.getX();
            float playerEndX = player.getEndX();
            float platformEndX = landedPlatform.x + landedPlatform.width;
            if (playerEndX >= landedPlatform.x && playerX <= platformEndX) {
                grounded = true;
                lastPlayerY = player.getY();
                return;
            }
        }

        // Check if we're gonna land on a platform
        landedPlatform = null;
        for (int i = 0; i < ladders.size; i++) {
            Ladder ladder = ladders.get(i);
            Rectangle bounds = ladder.bounds;
            if (player.overlaps(bounds) && lastPlayerY >= ladder.getTopY()) {
                grounded = true;
                landedPlatform = bounds;
                ladder.debugColor.set(ladder.debugColor.equals(RED) ? YELLOW : RED);
                break;
            }
        }
        lastPlayerY = player.getY();
    }

    public boolean isGrounded() {
        return grounded;
    }

    public Rectangle getLandedPlatform() {
        return landedPlatform;
    }
}