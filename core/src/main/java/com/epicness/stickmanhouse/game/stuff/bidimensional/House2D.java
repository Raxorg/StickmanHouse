package com.epicness.stickmanhouse.game.stuff.bidimensional;

import static com.badlogic.gdx.graphics.GL20.GL_ONE;
import static com.badlogic.gdx.graphics.GL20.GL_ONE_MINUS_SRC_ALPHA;
import static com.badlogic.gdx.graphics.GL20.GL_SRC_ALPHA;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.fundamentals.assets.SharedAssets;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Bedroom;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Hallway1;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Hallway2;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Hallway3;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Hallway4;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Kitchen;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.Library;
import com.epicness.stickmanhouse.game.stuff.bidimensional.rooms.LivingRoom;

public class House2D extends Drawable2D {

    private final LivingRoom livingRoom;
    private final Hallway1 hallway1;
    private final Kitchen kitchen;
    private final Hallway2 hallway2;
    private final Library library;
    private final Hallway3 hallway3;
    private final Bedroom bedroom;
    private final Hallway4 hallway4;

    private final DelayedRemovalArray<Ladder> ladders;
    private final Player player, playerMirror;

    public House2D(SharedAssets sharedAssets, GameAssets assets) {
        livingRoom = new LivingRoom(sharedAssets, assets);
        hallway1 = new Hallway1(sharedAssets, assets);
        kitchen = new Kitchen(sharedAssets, assets);
        hallway2 = new Hallway2(sharedAssets, assets);
        library = new Library(sharedAssets, assets);
        hallway3 = new Hallway3(sharedAssets, assets);
        bedroom = new Bedroom(sharedAssets, assets);
        hallway4 = new Hallway4(sharedAssets, assets);

        ladders = new DelayedRemovalArray<>();
        player = new Player(assets);
        playerMirror = new Player(assets);
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawerPlus) {
        livingRoom.draw(spriteBatch, shapeDrawerPlus);
        hallway1.draw(spriteBatch, shapeDrawerPlus);
        kitchen.draw(spriteBatch, shapeDrawerPlus);
        hallway2.draw(spriteBatch, shapeDrawerPlus);
        library.draw(spriteBatch, shapeDrawerPlus);
        hallway3.draw(spriteBatch, shapeDrawerPlus);
        bedroom.draw(spriteBatch, shapeDrawerPlus);
        hallway4.draw(spriteBatch, shapeDrawerPlus);
        player.draw(spriteBatch);
        playerMirror.draw(spriteBatch);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Hallway1 getHallway1() {
        return hallway1;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Hallway2 getHallway2() {
        return hallway2;
    }

    public Library getLibrary() {
        return library;
    }

    public Hallway3 getHallway3() {
        return hallway3;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Hallway4 getHallway4() {
        return hallway4;
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