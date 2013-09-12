package game;

import java.util.ArrayList;
import java.util.List;

public class Player implements Character {

	private List<Holdable> inventory = new ArrayList<Holdable>();
	
	@Override
	public void interact(Player p) {
		// TODO How do players interact? Chat, fight?
	}
	
	public boolean addItemToInventory(Holdable h) {
		inventory.add(h);
		return true;
	}
}
