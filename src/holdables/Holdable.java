package game;

public abstract class Holdable implements Interactable {
	public void interact(Player p) {
		// TODO remove holdable from world
		p.addItemToInventory(this);
	}
}
