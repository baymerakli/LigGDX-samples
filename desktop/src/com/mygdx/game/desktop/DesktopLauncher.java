package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.GraphicsDemo;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		new LwjglApplication(new MyGdxGame(), config);
		new LwjglApplication(new GraphicsDemo(), config);
//		new LwjglApplication(new GraphicsDemo1(), config);
//		new LwjglApplication(new GraphicsDemo2(), config);
//		new LwjglApplication(new GraphicsDemo3(), config);
//		new LwjglApplication(new GraphicsDemo4(), config);
	}
}
