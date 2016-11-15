package Menu;

import java.io.Serializable;

import TextBasedGame.Game;

public class Menu implements Serializable {

	private static final long serialVersionUID = 8186306716640724624L;

	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("You opened the menu!");
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1: Pokedex");
			System.out.println("2: Pokemon");
			System.out.println("3: Inventory");
			System.out.println("4: Trainer card");
			System.out.println("5: Save");
			System.out.println("6: Options");
			System.out.println("7: Info");
			System.out.println("M: Close menu");
			System.out.println("exit: Close the game");
			String input = Game.in.nextLine();
			switch (input) {
			// TODO Menu
			case "1":
				// action
				// valid = true;
				break;
			case "2":
				Game.pokemon.menu();
				break;
			case "3":
				Game.inventory.action();
				break;
			case "4":
				Trainercard.action();
				break;
			case "5":
				Game.saveGame();
				;
				break;
			case "6":
				// action
				// valid = true;
				break;
			case "7":
				// action
				// valid = true;
				break;
			case "m":
			case "M":
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("You closed the menu");
				valid = true;
				break;
			case "exit":
			case "Exit":
			case "EXIT":
				boolean valid2 = false;
				while (valid2 == false) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("All unsaved data will be lost!");
					System.out.println("1: Exit the game");
					System.out.println("2: Continue playing");
					String input2 = Game.in.nextLine();
					switch (input2) {
					case "2":
						valid2 = true;
						break;
					case "1":
						System.exit(0);
						break;
					default:
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Invalid input");
					}
				}
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
	}
}
