package Locations;

import TextBasedGame.Game;

public class PlayersHouse implements Location {

	private static final long serialVersionUID = 2105702871103583681L;
	public String name = "playershouse";
	public int visits = 0;
	public int visitsUpstairs = 0;
	public boolean spokeWithMom = false;
	public boolean isUpstairs = false;

	@Override
	public void action() {
		boolean valid = false;
		if (isUpstairs == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			if (visits == 0) {
				System.out.println("So this is where I live now...");
				System.out.println("Better go talk to Mom!");
				visits++;
			} else {
				System.out.println("Home sweet home!");
			}
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("What do you want to do?");
				System.out.println("1: Talk to Mom");
				System.out.println("2: Go outside");
				System.out.println("3: Go upstairs");
				System.out.println("4: Watch TV");
				System.out.println("M: Open menu");
				String input = in.nextLine();
				switch (input) {
				case "1":
					Game.mom.action();
					spokeWithMom = true;
					break;
				case "2":
					if (spokeWithMom == false) {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Better go talk to Mom first!");
					} else {
						Game.player.location = Game.pircaltown;
						valid = true;
					}
					break;
				case "3":
					isUpstairs = true;
					valid = true;
					break;
				case "4":
					Game.tv.action();
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
			actionUpstairs();
			isUpstairs = false;
			valid = false;
		}
	}
	
	private void actionUpstairs() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		if (visitsUpstairs == 0) {
			System.out.println("Well, at least my room is bigger now!");
			visitsUpstairs++;
		} else {
			System.out.println("Ah, nothing is better then being in your own room!");
		}
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1: Go to sleep");
			System.out.println("2: Use your computer");
			System.out.println("3: Go downstairs");
			System.out.println("M: Open menu");
			String input = in.nextLine();
			switch (input) {
			case "1":
				Game.bed.action();
				break;
			case "2":
				Game.computer.action();
				break;
			case "3":
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
		case "visits":	return visits;
		case "visitsUpstairs":	return visitsUpstairs;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "visits":	visits = i;
		case "visitsUpstairs":	visitsUpstairs = i;
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
		case "spokeWithMom":	return spokeWithMom;
		case "isUpstairs":		return isUpstairs;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "spokeWithMom":	spokeWithMom = bool;
		case "isUpstairs":		isUpstairs = bool;
		default:	return;
		}
	}
}
