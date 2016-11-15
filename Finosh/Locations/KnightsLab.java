package Locations;

import TextBasedGame.Game;

public class KnightsLab implements Location {

	private static final long serialVersionUID = -843109605394015503L;
	public String name = "knightslab";
	public int visits = 0;
	public boolean spokeWithKnightBoolean = false;
	
	@Override
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		if (visits == 0) {
			System.out.println("Wow! This lab is awesome!");
			System.out.println("Now where is Professor Knight.");
			visits++;
		} else {
			System.out.println("This lab seems to get more awesome by the minute");
		}
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1: Talk to Knight");
			System.out.println("2: Use the Computer");
			System.out.println("3: Watch the Table");
			System.out.println("4: Go outside");
			System.out.println("M: Open menu");
			String input = in.nextLine();
			switch (input) {
			case "1":
				Game.professorknight.action();
				spokeWithKnightBoolean = true;
				break;
			case "4":
				if (Game.professorknight.getInt("spokeWithKnight") == 2) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Professor Knight:		Hold on " + Game.player.name + "! I want to say something before you leave!");
				} else {
					Game.player.location = Game.pircaltown;
					valid = true;
				}
				break;
			case "3":
				// TODO table
				Game.knightstable.action();
				break;
			case "2":
				Game.computer.action();
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
		case "spokeWithKnightBoolean":	return spokeWithKnightBoolean;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "spokeWithKnightBoolean":	spokeWithKnightBoolean = bool;
		default:	return;
		}
	}
}
