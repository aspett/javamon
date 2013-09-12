package game;

public interface Tile {
	/** Returns whether this tile contains an entity. */
	public boolean containsEntity();

	/**
	 * Returns the entity at this tile. Returns null is no entity is present at
	 * this tile.
	 */
	public Entity getEntity();

	/** Removes the entity present at this tile and returns it. */
	public Entity removeEntity();

	/**
	 * Removes the entity present at this tile. If there is already an entity on
	 * the tile, then the original entity is returned. This prevents important
	 * items being accidently lost.
	 */
	public void setEntity(Entity e);
}
