package com.epicness.stickmanhouse.game.stuff.bidimensional;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Hallway1;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Kitchen;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.LivingRoom;

public class House2D extends Drawable2D {

    private final LivingRoom livingRoom;
    private final Hallway1 hallway1;
    private final Kitchen kitchen;

    private final DelayedRemovalArray<Ladder> ladders;
    private final Player player, playerMirror;

    public House2D(SharedAssets sharedAssets, GameAssets assets) {
        livingRoom = new LivingRoom(sharedAssets, assets);
        hallway1 = new Hallway1(sharedAssets, assets);
        kitchen = new Kitchen(sharedAssets, assets);

        ladders = new DelayedRemovalArray<>();
        player = new Player(assets);
        playerMirror = new Player(assets);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawerPlus) {
        livingRoom.draw(spriteBatch, shapeDrawerPlus);
        hallway1.draw(spriteBatch, shapeDrawerPlus);
        kitchen.draw(spriteBatch, shapeDrawerPlus);
        player.draw(spriteBatch);
        playerMirror.draw(spriteBatch);
    }

    public DelayedRemovalArray<Ladder> getLadders() {
        return ladders;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getPlayerMirror() {
        return playerMirror;
    }
}