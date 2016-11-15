package Items;

import java.io.Serializable;

import TextBasedGame.Game;

public class KeyItem implements Serializable {

	private static final long serialVersionUID = 2161794470029553067L;
	public String name;
	public KeyItems keyitem;
	
	public KeyItem(KeyItems KeyItem) {
		name = KeyItem.toString();
		keyitem = KeyItem;
	}
	
	public void use(KeyItem item) {
		if (Game.player.isInBattle == false) {
			System.out.println("your item is not here haha!");
		} else {
			System.out.println("You can't use this item right now");
		}
	}

	public enum KeyItems {
		TownMap(1), Bicycle(2);
		public int keyitems;
		
		KeyItems(int k) {
			keyitems = k;
		}
	}

	public void info(KeyItem item) {
		switch (item.keyitem) {
		case TownMap:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A very convenient map that can be viewed anytime. It even shows you your present location in the region.");
			break;
		case Bicycle:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A folding Bike that enables a rider to get around much faster.");
			break;
		default:
			break;
		}
	}
}
