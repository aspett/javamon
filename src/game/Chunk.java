package game;

/**
 * A chunk represents one section of the overall map. These are displayed on the
 * screen one at a time and can be connected with teleporters to create larger
 * levels. This class is responsible for keeping track of the tiles contained
 * within the chunk and handling any game actions which occur in the chunk. All
 * interaction with Chunk must go through Game.
 * 
 * @author Lachlan Ridley
 * 
 */
public class Chunk {
	/** This is the dimensions of the chunk, width and height */
	private static final int CHUNK_SIZE = 32;
	/**
	 * This is the size of the tiles in pixels. Tiles must be square, hence only
	 * one value
	 */
	private static final int TILE_SIZE = 32;

	private Tile[][] chunkMap;

	/** Returns the tile at the given (x,y) coordinates */
	public Tile getTile(int x, int y) {
		if (!validCoordinates(x, y))
			return null; // TODO throw an exception
		return chunkMap[x][y];
	}

	/**
	 * Returns the entity present at the given (x,y) coordinates. Throws an
	 * exception if no entity is at the coordinates
	 */
	public Entity getEntity(int x, int y) {
		if (!validCoordinates(x, y))
			return null; // TODO throw an exception
		Tile t = getTile(x, y);
		if (!t.containsEntity())
			return null; // TODO maybe throw an exception
		return t.getEntity();
	}

	// HELPER METHODS
	/**
	 * Checks if the given (x,y) coordinates are a point within the chunk's map
	 */
	private boolean validCoordinates(int x, int y) {
		if (x >= 0 && x < CHUNK_SIZE && y >= 0 && y < CHUNK_SIZE)
			return true;
		return false;
	}
}
