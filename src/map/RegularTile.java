package game;

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
}
