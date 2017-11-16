package dev.flash.tilegame.states;

import dev.flash.tilegame.Handler;

import java.awt.*;

public abstract class State {
	
	
	
	private static State currentState = null;
	
	//Class
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick(double delta);
	
	public abstract void render(Graphics g);
	
	public static void setState(State state) {
		currentState = state;
	}
	
	
	public static State getState() {
		return currentState;
	}
	
	
}
