package com.epicness.stickmanhouse;

import com.badlogic.gdx.Game;
import com.epicness.fundamentals.SharedResources;
import com.epicness.stickmanhouse.game.GameInitializer;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class StickmanHouseGame extends Game {

    @Override
    public void create() {
        GameAssets assets = new GameAssets();
        assets.queueAssetLoading();
        assets.finishLoading();
        assets.initAssets();
        new GameInitializer(assets).initialize(new SharedResources());
    }
}