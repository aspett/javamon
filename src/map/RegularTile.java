package map;

import entities.Entity;

public class RegularTile implements Tile {
	public Entity on;
	
	public RegularTile(Entity on) {
		this.on = on;
	}
	
	public Entity removeEntity() {
		Entity toReturn = on;
		on = null;
		return toReturn;
	}
	
	public void setEntity(Entity e) {
		// TODO throw exception if there is already an object here
		this.on = e;
	}

	@Override
	public boolean containsEntity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity getEntity() {
		// TODO Auto-generated method stub
		return null;
	}
}
