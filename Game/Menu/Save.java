package Menu;

import java.io.Serializable;

import TextBasedGame.Game;

public class Save implements Serializable {

	private static final long serialVersionUID = 4535729221405228938L;

	public void saveGame() {
		Game.saveGame();
	}
}