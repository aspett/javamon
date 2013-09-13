package map;

import entities.Entity;

public interface ChunkI {
	public Tile getTile(int x, int y);

	public Entity getEntity(int x, int y);
}
