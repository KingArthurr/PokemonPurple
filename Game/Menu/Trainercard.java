package Menu;

import java.io.Serializable;

import TextBasedGame.Game;

public class Trainercard implements Serializable {

	private static final long serialVersionUID = 5566385028695237572L;

	public static void action() {
		System.out.println(Game.player.name);
	}
}
