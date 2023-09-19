package com.epicness.stickmanhouse.game.stuff.bidimensional;

import static com.epicness.stickmanhouse.game.constants.GameConstants.PLAYER_HEIGHT;
import static com.epicness.stickmanhouse.game.constants.GameConstants.PLAYER_WIDTH;
import static com.epicness.stickmanhouse.game.constants.PlayerStatus.IDLE;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.SpritedAnimation;
import com.epicness.fundamentals.stuff.interfaces.Movable;
import com.epicness.fundamentals.utils.CollisionUtils;
import com.epicness.stickmanhouse.game.assets.GameAssets;
import com.epicness.stickmanhouse.game.constants.PlayerStatus;

public class Player implements Movable {

    private final SpritedAnimation idle, running, climbing, falling;
    private SpritedAnimation currentAnimation;
    public final Vector2 speed;
    private PlayerStatus status;

    public Player(GameAssets assets) {
        idle = new SpritedAnimation(1f, assets.getStickmanIdle());
        idle.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
        idle.useBilinearFilter();

        running = new SpritedAnimation(0.05f, assets.getStickmanRunning());
        running.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
        running.enableLooping();
        running.useBilinearFilter();

        climbing = new SpritedAnimation(0.1f, assets.getStickmanClimbing());
        climbing.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
        climbing.enableLooping();
        climbing.useBilinearFilter();

        falling = new SpritedAnimation(1f, assets.getStickmanFalling());
        falling.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
        falling.useBilinearFilter();

        currentAnimation = idle;

        speed = new Vector2();
        status = IDLE;
    }

    public void draw(SpriteBatch spriteBatch) {
        currentAnimation.draw(spriteBatch);
    }

    public void drawDebug(ShapeDrawerPlus shapeDrawer) {
        shapeDrawer.rectangle(currentAnimation.getBoundingRectangle());
    }

    @Override
    public float getX() {
        return currentAnimation.getX();
    }

    public float getCenterX() {
        return currentAnimation.getCenterX();
    }

    public float getEndX() {
        return currentAnimation.getEndX();
    }

    @Override
    public void translateX(float amount) {
        currentAnimation.translateX(amount);
    }

    @Override
    public float getY() {
        return currentAnimation.getY();
    }

    public float getCenterY() {
        return currentAnimation.getCenterY();
    }

    @Override
    public void translateY(float amount) {
        currentAnimation.translateY(amount);
    }

    public boolean overlaps(Rectangle other) {
        return CollisionUtils.overlapsInclusive(currentAnimation.getBoundingRectangle(), other);
    }

    public void addTime(float delta) {
        currentAnimation.addTime(delta);
    }

    public boolean isFlipX() {
        return currentAnimation.isFlipX();
    }

    public void setFlipX(boolean flipX) {
        currentAnimation.setFlipX(flipX);
    }

    public float getTime() {
        return currentAnimation.getTime();
    }

    public void setTime(float time) {
        currentAnimation.setTime(time);
    }

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus newStatus) {
        status = newStatus;
        Vector2 position = currentAnimation.getPosition();
        switch (status) {
            case IDLE:
                currentAnimation = idle;
                break;
            case RUNNING:
                currentAnimation = running;
                break;
            case CLIMBING:
                currentAnimation = climbing;
                break;
            case FALLING:
                currentAnimation = falling;
                break;
        }
        currentAnimation.setPosition(position);
    }
}