package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GraphicsDemo2 implements ApplicationListener {
    private SpriteBatch batch;
    private Pixmap pixmap;
    private Texture texture;
    private Texture texture2;
    private Sprite sprite;
    private Sprite sprite2;

    @Override
    public void create() {
        batch = new SpriteBatch();

        // A Pixmap is basically a raw image in memory as repesented by pixels
        // We create one 256 wide, 128 height using 8 bytes for Red, Green, Blue and Alpha channels
        pixmap = new Pixmap(256,128, Pixmap.Format.RGBA8888);

        //Fill it red
        pixmap.setColor(Color.RED);
        pixmap.fill();

        //Draw two lines forming an X
        pixmap.setColor(Color.BLACK);
        pixmap.drawLine(0, 0, pixmap.getWidth()-1, pixmap.getHeight()-1);
        pixmap.drawLine(0, pixmap.getHeight()-1, pixmap.getWidth()-1, 0);

        //Draw a circle about the middle
        pixmap.setColor(Color.YELLOW);
        pixmap.drawCircle(pixmap.getWidth() / 2, pixmap.getHeight() / 2, pixmap.getHeight() / 2 - 1);


        texture = new Texture(pixmap);

        pixmap.setColor(Color.GREEN);
        pixmap.drawCircle(pixmap.getWidth()/3, pixmap.getHeight()/3, pixmap.getHeight()/3 - 1);
        texture2 = new Texture(pixmap);

        //It's the textures responsibility now... get rid of the pixmap
        pixmap.dispose();

        sprite = new Sprite(texture);
        sprite2 = new Sprite(texture2);
    }

    @Override
    public void dispose() {
        batch.dispose();
        texture.dispose();
        texture2.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        sprite.setPosition(0, 0);
        sprite.draw(batch);
        sprite.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        sprite.draw(batch);
        sprite2.setPosition(100, 200);
        sprite2.draw(batch);
        sprite2.setPosition(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() / 3);
        sprite2.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
}