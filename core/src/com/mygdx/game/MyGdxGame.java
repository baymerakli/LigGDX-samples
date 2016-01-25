package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	private BitmapFont font;
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		img = new Texture("badlogic.jpg");
		sprite = new Sprite(img,img.getWidth(),img.getHeight());
		sprite.setPosition(
				Gdx.graphics.getWidth()/2 - img.getWidth() / 2,
				Gdx.graphics.getHeight()/2 - img.getHeight() / 2);
		sprite.setRotation(50f);
		sprite.setScale(0.7f);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, sprite.getX(),sprite.getY(),sprite.getWidth()/2, sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),sprite.getScaleX(),
				sprite.getScaleY(),sprite.getRotation());
//		batch.draw(sprite, Gdx.graphics.getWidth()/2 - img.getWidth()/2, Gdx.graphics.getHeight()/2-img.getHeight()/2);
//		font.draw(batch, "Hello World", 300, 200);
		batch.end();
	}
}
