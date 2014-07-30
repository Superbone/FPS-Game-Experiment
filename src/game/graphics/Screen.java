package game.graphics;

import game.main.Game;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Screen{
	public void createScreen(){
		try {
			Display.setDisplayMode(new DisplayMode(Game.WIDTH, Game.HEIGHT));
			Display.setTitle("LWJGL");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, Game.WIDTH, Game.HEIGHT, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	public void destroy(){
		Display.destroy();
	}
}
