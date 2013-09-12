package game;

public class TeleportTile implements Tile {
	private Chunk destinationChunk;
	private int destinationX;
	private int destinationY;
	private Door door;
	
	public TeleportTile(Chunk destinationChunk, int destinationX, int destinationY) {
		this.destinationChunk = destinationChunk;
		this.destinationX = destinationX;
		this.destinationY = destinationY;
	}
	
	public void setDoor(Door d) {
		door = d;
	}
	
	public Door getDoor() {
		return door;
	}
}
