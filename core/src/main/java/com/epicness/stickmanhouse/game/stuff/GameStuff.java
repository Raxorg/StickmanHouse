package com.epicness.stickmanhouse.game.stuff;

import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.stickmanhouse.game.assets.GameAssets;

public class GameStuff extends Stuff<GameAssets> {

    private House house;

    @Override
    public void initializeStuff() {
        house = new House(sharedAssets, assets);
    }

    public House getHouse() {
        return house;
    }
}