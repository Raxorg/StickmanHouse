package com.epicness.stickmanhouse.game.stuff;

import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.tridimensional.House3D;

public class GameStuff extends Stuff<GameAssets> {

    private House3D house3D;

    @Override
    public void initializeStuff() {
        house3D = new House3D(sharedAssets, assets);
    }

    public House3D getHouse3D() {
        return house3D;
    }
}