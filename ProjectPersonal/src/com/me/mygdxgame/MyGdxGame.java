package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private Sprite sprite2;
	int rotacion =0;
	private Texture textura_fondo;
	private Sprite sprite_fondo;
	private Texture textura_nave;
	private Sprite sprite_nave;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		

		texture = new Texture(Gdx.files.internal("data/libgdx.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		
		textura_fondo = new Texture(Gdx.files.internal("data/libgdx2.png"));
		TextureRegion region2 = new TextureRegion(textura_fondo, 0, 0, 512, 400);
		sprite_fondo = new Sprite(region2);
		sprite_fondo.setSize(1.0f, 1.0f * sprite_fondo.getHeight()/sprite_fondo.getWidth());
		sprite_fondo.setOrigin(sprite_fondo.getWidth()/2, sprite_fondo.getHeight()/2);
		sprite_fondo.setPosition(-0.5f,-0.4f);
		
		sprite = new Sprite(region);
		sprite2 = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		sprite.setRotation(25);
		
		
		textura_nave = new Texture(Gdx.files.internal("data/Nave.png"));
		sprite_nave = new Sprite(textura_nave,128,64);
		sprite_nave.setPosition(-0.5f, -0.5f);
		sprite_nave.setSize(0.5f, 0.5f);
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(0f,0f,0f,0);
		//Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite_fondo.draw(batch);
		//sprite.draw(batch);
		//sprite2.draw(batch);
		
		sprite_nave.draw(batch);
		batch.end();
		/*sprite.setRotation(rotacion);
		if(Gdx.input.isTouched()){		
			rotacion++;
		}*/
		
		
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
