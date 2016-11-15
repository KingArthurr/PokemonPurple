package Locations;

import Items.KeyItem;
import TextBasedGame.Game;

public class Pircaltown implements Location {

	private static final long serialVersionUID = 3503979495475668027L;
	public String name = "pircaltown";

	@Override
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Welcome to Pircaltown!");
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Where do you want to go?");
			System.out.println("1: To my house");
			System.out.println("2: To route 101");
			System.out.println("3: To " + Game.rival.name + "'s house");
			System.out.println("4: To Professor Knight's lab");
			System.out.println("M: Open menu");
			String input = in.nextLine();
			switch (input) {
			case "1":
				Game.player.location = Game.playershouse;
				valid = true;
				break;
			case "2":
				if (!Game.inventory.KeyItems.containsKey(KeyItem.KeyItems.TownMap)) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("I will get lost without a map"); //TODO  check if has map
				} else {
					Game.player.location = Game.route101;
					valid = true;
				}
				break;
			case "3":
				Game.player.location = Game.rivalshouse;
				valid = true;
				break;
			case "4":
				Game.player.location = Game.knightslab;
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
	}

	@Override
	public Integer getInt(String integer) {
		switch (integer) {
		case "1":	return null;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "1":	return;
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
		case "1":	return;
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
		case "1":	return;
		default:	return;
		}
	}
}
