package entities;

import holdables.Holdable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import characters.Player;

/**
 * A Chest is a kind of entity which can contain various holdable items. Players
 * can there remove or add items to the chest
 * 
 * @author Lachlan Ridley
 * 
 */
public class Chest implements Interactable {
	private List<Holdable> contents;

	public Chest(Collection<Holdable> c) {
		contents = new ArrayList<Holdable>(c);
	}

	public Chest() {
		contents = new ArrayList<Holdable>();
	}

	@Override
	public void interact(Player p) {
		// TODO How does the player interact with chests?
	}
}
