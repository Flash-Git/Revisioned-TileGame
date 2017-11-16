package dev.flash.tilegame.entities.units;


public class UnitControlledState extends UnitState {
	
	public UnitControlledState(Unit unit) {
		super(unit);
	}
	
	@Override
	public void tick(double delta) {
		handler.getGameCamera().centerOnEntity(unit);
		
		setVelocity();
		unit.move(delta, unit.getX() + unit.getvX() * delta / 1000 * 60, unit.getY() + unit.getvY() * delta / 1000 * 60);
	}
	
	
	
	private void setVelocity() {
	
		
	}
}