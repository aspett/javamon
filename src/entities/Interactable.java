package entities;

import characters.Player;

public interface Interactable extends Entity {
	public void interact(Player p);
}
