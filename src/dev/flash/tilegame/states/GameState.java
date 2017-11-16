package dev.flash.tilegame.states;

import dev.flash.tilegame.Handler;
import dev.flash.tilegame.worlds.World;

import java.awt.*;

public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		//inputManager = null;
		world = new World(handler, "res/worlds/world3.txt");
		handler.setWorld(world);
	}
	
	@Override
	public void tick(double delta) {
		world.tick(delta);
		
	}
	
	@Override
	public void render(Graphics g) {
		world.render(g);
	}
	
}