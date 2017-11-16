package dev.flash.tilegame;

import dev.flash.tilegame.entities.EntityManager;
import dev.flash.tilegame.gfx.GameCamera;
import dev.flash.tilegame.menu.Menu;
import dev.flash.tilegame.tiles.ChunkManager;
import dev.flash.tilegame.timers.TimerManager;
import dev.flash.tilegame.worlds.World;

public class Handler {
	
	private Game game;
	private World world;
	private Menu menu;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	
	public EntityManager getEntityManager() {
		return world.getEntityManager();
	}
	
	
	public ChunkManager getChunkManager() {
		return world.getChunkManager();
	}
	
	public TimerManager getTimerManager() {
		return game.getTimerManager();
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public int getFPS() {
		return game.getFPS();
	}
	
	public Game getGame() {
		return game;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
	
	public World getWorld() {
		return world;
	}
	
	public void setWorld(World world) {
		this.world = world;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
}
