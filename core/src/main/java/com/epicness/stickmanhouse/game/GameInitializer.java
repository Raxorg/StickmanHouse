package com.epicness.stickmanhouse.game;

import com.epicness.fundamentals.initializer.Initializer;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.logic.GameLogic;
import com.epicness.stickmanhouse.game.stuff.GameStuff;

public class GameInitializer extends Initializer<GameAssets, GameRenderer, GameStuff> {

    public GameInitializer(GameAssets assets) {
        super(assets, new GameLogic(), new GameRenderer(), new GameStuff());
    }
}