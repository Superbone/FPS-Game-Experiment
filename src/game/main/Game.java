package game.main;

import org.lwjgl.opengl.Display;

import game.graphics.Render;
import game.graphics.Screen;
import game.logic.Tick;

public class Game {
	
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	
	private boolean running = true;
	
	private Tick tick = new Tick();
	private Screen screen = new Screen();
	private Render render = new Render();
	
	private void loop(){
		while (running){
			if (Display.isCloseRequested()){
				this.RequestClose();
			}
		}
		screen.destroy();
		close();
		System.exit(0);
	}
	private void start(){
		screen.createScreen();
		loop();
	}
	private void close(){
		
	}
	public void RequestClose(){
		running = false;
	}
	public static void main(String[] args){
		Game game = new Game();
		game.start();
	}
}