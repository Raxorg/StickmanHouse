package com.epicness.stickmanhouse.game.stuff.bidimensional;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.rooms.LivingRoom;

public class House2D extends Drawable2D {

    private final LivingRoom livingRoom;
    private final Player player;

    public House2D(SharedAssets sharedAssets, GameAssets assets) {
        livingRoom = new LivingRoom(sharedAssets, assets);
        player = new Player(assets);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawerPlus) {
        livingRoom.draw(spriteBatch, shapeDrawerPlus);
        player.draw(spriteBatch);
    }
}