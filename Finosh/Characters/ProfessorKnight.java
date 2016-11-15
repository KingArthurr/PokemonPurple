package Characters;

import Items.BattleItem;
import Items.BattleItem.BattleItems;
import TextBasedGame.Game;

public class ProfessorKnight implements Character {
	
	private static final long serialVersionUID = 8568319498391776925L;
	int spokeWithKnight = 0;

	@Override
	public void action() {
		if (spokeWithKnight == 0) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Proffesor Knight:	Hey " + Game.player.name + ", I'd like you to meet your new neighbour.");
			System.out.println(("Proffesor Knight:	I'm sorry, I forgot your name already. What was it again?"));
			boolean nameBoolean = false;
			while (nameBoolean == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Please enter your neighbours name:");
				String name = in.nextLine();
				if (!name.isEmpty()) {
					boolean valid = false;
					while (valid == false) {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Proffesor Knight:	Is " + name + " your neighbours name?");
						System.out.println("1: Yes");
						System.out.println("2: No");
						String input = in.nextLine();
						switch (input) {
						case "2":
							System.out.println("Proffesor Knight:	No? What is your neighbours name then?");
							valid = true;
							break;
						case "1":
							Game.rival.name = name;
							nameBoolean = true;
							valid = true;
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
				}
			}
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Proffesor Knight:	Yeah that's it. I'm so sorry " + Game.rival.name + "! My age is catching up with me..");
			System.out.println("Proffesor Knight:	I wanted to show you two something. On the table here you can see three Pokeballs");
			System.out.println("Professor Knight:	It was your dream to become Pokemon Trainers wasn't it?");
			System.out.println("Professor Knight:	One of these Pokemon can be your first. But only if you want to do something for me.");
			System.out.println("Professor Knight:	This is a Pokedex. It records information of Pokemon you encounter.");
			System.out.println("Professor Knight:	I need you guys to gather information of all the Pokemon in Finosh.");
			System.out.println("Professor Knight:	Do you want to do this for me?");
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Do you want to use the Pokedex for Professor Knight?");
				System.out.println("1: Yes");
				System.out.println("2: No");
				String input = in.nextLine();
				switch (input) {
				case "2":
					System.out.println("You sure you don't want to do this?");
					boolean valid2 = false;
					while (valid2 == false) {
						System.out.println("1: Yes");
						System.out.println("2: No");
						String input2 = in.nextLine();
						switch (input2) {
						case "1":
							System.out.println("You sure you don't want to do this?");
							break;
						case "2":
							valid2 = true;
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
					
					break;
				case "1":
					valid = true;
					Game.pokedex.pokedex = 1;
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Professor Knight:	Please pick a Pokemon!");
					break;
				default:
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Invalid input");
				}
			}
			spokeWithKnight++;
		} else if (spokeWithKnight == 2) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Professor Knight:	Great choice! Both of you.");
			System.out.println("Professor Knight:	Now here is the software for your Pokedex");
			//TODO vanaf nu pokedex gebruiken.
			System.out.println("Professor Knight:	Have a Potion! This will heal your Pokemon.");
			Game.inventory.addBattleItem(new BattleItem(BattleItems.Potion));
			System.out.println("Professor Knight:	Now go home and tell your parents. And after that please meet me at route 101.");
			spokeWithKnight++;
			Game.mom.setInt("spokeWithMom", 2);
		} else if (spokeWithKnight == 1) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Professor Knight:	Please pick a Pokemon!");
		} else if (spokeWithKnight == 3) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("The Professor is busy!");
		}
	}
	
	@Override
	public Integer getInt(String integer) {
		switch (integer) {
		case "spokeWithKnight":	return spokeWithKnight;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "spokeWithKnight":	spokeWithKnight = i;
		default:	return;
		}
	}
	@Override
	public String getString(String string) {
		switch (string) {
		case "1":	return null;
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
