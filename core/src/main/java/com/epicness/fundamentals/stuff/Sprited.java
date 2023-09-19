package com.epicness.fundamentals.stuff;

import static com.badlogic.gdx.graphics.Texture.TextureFilter.Linear;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.epicness.fundamentals.renderer.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.interfaces.Buttonable;
import com.epicness.fundamentals.stuff.interfaces.Transformable;

public class Sprited implements Buttonable, Transformable {

    private final Sprite sprite;

    public Sprited(Sprite sprite) {
        this.sprite = new Sprite(sprite);
    }

    public void setSprite(Sprite sprite) {
        this.sprite.setRegion(sprite);
    }

    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    public void drawDebug(ShapeDrawerPlus shapeDrawer) {
        shapeDrawer.rectangle(getBoundingRectangle());
    }

    @Override
    public boolean contains(float x, float y) {
        return getBoundingRectangle().contains(x, y);
    }

    public Rectangle getBoundingRectangle() {
        return sprite.getBoundingRectangle();
    }

    @Override
    public float getX() {
        return sprite.getX();
    }

    @Override
    public void translateX(float amount) {
        sprite.translateX(amount);
    }

    @Override
    public float getY() {
        return sprite.getY();
    }

    @Override
    public void translateY(float amount) {
        sprite.translateY(amount);
    }

    @Override
    public void stretchWidth(float amount) {
        sprite.setSize(sprite.getWidth() + amount, sprite.getHeight());
    }

    @Override
    public void stretchHeight(float amount) {
        sprite.setSize(sprite.getWidth(), sprite.getHeight() + amount);
    }

    @Override
    public float getWidth() {
        return sprite.getWidth();
    }

    @Override
    public float getHeight() {
        return sprite.getHeight();
    }

    @Override
    public float getRotation() {
        return sprite.getRotation();
    }

    @Override
    public void rotate(float degrees) {
        sprite.rotate(degrees);
    }

    public void setOriginBasedX(float x) {
        sprite.setOriginBasedPosition(x, getOriginBasedY());
    }

    public void setOriginBasedPosition(float x, float y) {
        sprite.setOriginBasedPosition(x, y);
    }

    public void setOriginBasedPosition(Vector2 position) {
        setOriginBasedPosition(position.x, position.y);
    }

    public float getCenterX() {
        return sprite.getX() + sprite.getWidth() / 2f;
    }

    public float getCenterY() {
        return sprite.getY() + sprite.getHeight() / 2f;
    }

    public Vector2 getCenter() {
        return new Vector2(getCenterX(), getCenterY());
    }

    public Vector2 getOrigin() {
        return new Vector2(sprite.getOriginX(), sprite.getOriginY());
    }

    public float getOriginBasedX() {
        return sprite.getX() + sprite.getOriginX();
    }

    public float getOriginBasedY() {
        return sprite.getY() + sprite.getOriginY();
    }

    public Vector2 getOriginBasedCenter() {
        return new Vector2(getOriginBasedX(), getOriginBasedY());
    }

    public float getScaleX() {
        return sprite.getScaleX();
    }

    public float getScaleY() {
        return sprite.getScaleY();
    }

    public Vector2 getScale(Vector2 output) {
        return output.set(sprite.getScaleX(), sprite.getScaleY());
    }

    public void setScale(float scale) {
        sprite.setScale(scale);
    }

    public float getOriginX() {
        return sprite.getOriginX();
    }

    public float getOriginY() {
        return sprite.getOriginY();
    }

    public void setOriginX(float originX) {
        sprite.setOrigin(originX, sprite.getOriginY());
    }

    public void setOriginY(float originY) {
        sprite.setOrigin(sprite.getOriginX(), originY);
    }

    public void setOrigin(float originX, float originY) {
        sprite.setOrigin(originX, originY);
    }

    public void setOriginCenter() {
        sprite.setOriginCenter();
    }

    public void setRotation(float degrees) {
        sprite.setRotation(degrees);
    }

    public boolean isFlipX() {
        return sprite.isFlipX();
    }

    public boolean isFlipY() {
        return sprite.isFlipY();
    }

    public void setFlip(boolean flipX, boolean flipY) {
        sprite.setFlip(flipX, flipY);
    }

    public void setFlipX(boolean flipX) {
        setFlip(flipX, sprite.isFlipY());
    }

    public void setFlipY(boolean flipY) {
        setFlip(sprite.isFlipX(), flipY);
    }

    public Color getColor() {
        return sprite.getColor();
    }

    public void setColor(Color color) {
        sprite.setColor(color);
    }

    public void setColor(float r, float g, float b, float a) {
        sprite.setColor(r, g, b, a);
    }

    public void useBilinearFilter() {
        sprite.getTexture().setFilter(Linear, Linear);
    }
}