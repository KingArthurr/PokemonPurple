import TextBasedGame.Game;

public class Notebook {

	public Notebook() {
		
		//TODO Route101
		//TODO Moves
		//TODO Battle engines
		//TODO Items
		
		// TODO Story
		// TODO Save & Load
		// TODO TV
		// TODO Computer
		// TODO MENU
		// TODO Bed
	}

	public void Switch() {

		boolean valid = false;
		while (valid == false) {
			// Options
			System.out.println("M: Open menu");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				// action
				// valid = true;
				break;
			case "2":
				// action
				// valid = true;
				break;
			case "m":
			case "M":
				Game.menu.action();
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
	}
	
	public Integer getInt(String integer) {
		switch (integer) {
		case "1":	return null;
		default:	return null;
		}
	}
	
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "1":	return;
		default:	return;
		}
	}
	
	public String getString(String string) {
		switch (string) {
		case "1":	return null;
		default:	return null;
		}
	}
	
	public void setString(String string, String str) {
		switch(string) {
		case "1":	return;
		default:	return;
		}
	}
	
	public Boolean getBoolean(String boolen) {
		switch (boolen) {
		case "1":	return null;
		default:	return null;
		}
	}
	
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "1":	return;
		default:	return;
		}
	}
	
}
