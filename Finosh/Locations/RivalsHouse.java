package Locations;

import TextBasedGame.Game;

public class RivalsHouse implements Location {

	private static final long serialVersionUID = 7163202711956779447L;
	String name = "rivalshouse";
	int visits = 0;
	
	@Override
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		if(Game.knightslab.getBoolean("spokeWithKnightBoolean") == false) {
			System.out.println("The house is empty. Where is everybody?");
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("What do you want to do?");
				System.out.println("1: Go outside");
				System.out.println("M: Open menu");
				String input = in.nextLine();
				switch (input) {
				case "1":
					Game.player.location = Game.pircaltown;
					valid = true;
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
		} else {
			System.out.println("The grass is actually greener here!");
			//TODO
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("What do you want to do?");
				System.out.println("1: Go outside");
				System.out.println("M: Open menu");
				String input = in.nextLine();
				switch (input) {
				case "1":
					Game.player.location = Game.pircaltown;
					valid = true;
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
			//TODO
			}
		}
	}

	@Override
	public Integer getInt(String integer) {
		switch (integer) {
		case "visits":	return visits;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "visits":	visits = i;
		default:	return;
		}
	}
	@Override
	public String getString(String string) {
		switch (string) {
		case "name":	return name;
		default:	return null;
		}
	}
	@Override
	public void setString(String string, String str) {
		switch(string) {
		case "name":	name = str;
		default:	return;
		}
	}
	@Override
	public Boolean getBoolean(String boolen) {
		switch (boolen) {
		case "1":	return null;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "1":	return /* boolean = bool*/;
		default:	return;
		}
	}
}
