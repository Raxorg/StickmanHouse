package com.epicness.stickmanhouse;

import com.badlogic.gdx.Game;
import com.epicness.fundamentals.SharedResources;
import com.epicness.stickmanhouse.game.GameInitializer;

public class StickmanHouseGame extends Game {

    @Override
    public void create() {
        new GameInitializer().initialize(new SharedResources());
    }
}