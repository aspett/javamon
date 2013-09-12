package game;

public class RegularTile implements Tile {
	public Object on;
	
	public RegularTile(Object on) {
		this.on = on;
	}
	
	public Object removeObject() {
		Object toReturn = on;
		on = null;
		return toReturn;
	}
}
