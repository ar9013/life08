package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Life08 extends ApplicationAdapter {
	SpriteBatch batch;
	TextureRegion backgroundTexture;
	Texture bgTexture;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bgTexture = new Texture(Gdx.files.internal("ms_background.jpg")); // 設定背景圖片
		backgroundTexture = new TextureRegion(bgTexture,0,0,bgTexture.getWidth(),bgTexture.getHeight()); // 設定要渲染的範圍

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(backgroundTexture, 0, 0); // 渲染圖片，0,0的位置在螢幕左下角。
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		bgTexture.dispose();
	}
}
