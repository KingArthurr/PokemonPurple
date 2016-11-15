package TextBasedGame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import Characters.Character;
import Characters.Mom;
import Characters.Player;
import Characters.ProfessorKnight;
import Characters.Rival;
import Locations.KnightsLab;
import Locations.Location;
import Locations.Pircaltown;
import Locations.PlayersHouse;
import Locations.RivalsHouse;
import Locations.Route101;
import Menu.Info;
import Menu.Inventory;
import Menu.Menu;
import Menu.Options;
import Menu.Pokedex;
import Menu.Pokemon;
import Menu.Save;
import Menu.Trainercard;
import Objects.Bed;
import Objects.Computer;
import Objects.KnightsTable;
import Objects.Object;
import Objects.TV;

public class Game implements Serializable {

	public static Scanner in = new Scanner(System.in);
	private static final long serialVersionUID = 2849571168150377660L;
	public static Player player = new Player();
	public static Rival rival = new Rival();

	public static Location playershouse = new PlayersHouse();
	public static Location pircaltown = new Pircaltown();
	public static Location knightslab = new KnightsLab();
	public static Location rivalshouse = new RivalsHouse();
	public static Location route101 = new Route101();

	public static Character mom = new Mom();
	public static Character professorknight = new ProfessorKnight();

	public static Object tv = new TV();
	public static Object bed = new Bed();
	public static Object computer = new Computer();
	public static Object knightstable = new KnightsTable();

	public static Menu menu = new Menu();
	public static Info info = new Info();
	public static Inventory inventory = new Inventory();
	public static Options options = new Options();
	public static Pokedex pokedex = new Pokedex();
	public static Pokemon pokemon = new Pokemon();
	public static Save save = new Save();
	public static Trainercard trainercard = new Trainercard();

	public static boolean startInGame;

	public void startGame() {
		startInGame = false;
		while (startInGame == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Hi! Welcome to Pokemon Purple!");
			System.out.println("This is a text-based Pokemon Game made by Reinier de Ridder");
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1: Continue saved game");
				System.out.println("2: Start new game");
				System.out.println("3: Exit game");
				String input = in.nextLine();
				switch (input) {
				case "1":
					loadGame();
					valid = true;
					break;
				case "2":
					newGame();
					valid = true;
					break;
				case "3":
					System.exit(0);
				default:
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Invalid input");
				}
			}
		}
		inGame();
	}

	public void newGame() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Proffesor Knight:	Hi, and welcome to the world of Pokemon. I'm happy to welcome you to the region of Finosh.");
		System.out.println("Proffesor Knight:	My name is Professor Knight. Now remind me, what is your name?");
		boolean nameBoolean = false;
		while (nameBoolean == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Please enter your name:");
			String name = in.nextLine();
			if (!name.isEmpty()) {
				boolean valid = false;
				while (valid == false) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Proffesor Knight:	Is " + name + " your name?");
					System.out.println("1: Yes");
					System.out.println("2: No");
					String input = in.nextLine();
					switch (input) {
					case "2":
						System.out.println("Proffesor Knight:	No? What is your name then?");
						valid = true;
						break;
					case "1":
						player.name = name;
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
		System.out.println("Proffesor Knight:	Great! Nice to meet you " + player.name + "!");
		System.out.println("Proffesor Knight:	Now I assume that you saw some weird creatures on your way here.");
		System.out.println("Proffesor Knight:	These creatures are called Pokemon.");
		System.out.println("Proffesor Knight:	There are many different Pokemon in Finosh.");
		System.out.println("Proffesor Knight:	I am a Pokemon Professor. I study Pokemon.");
		System.out.println("Proffesor Knight:	Besides studying Pokemon, you can also train them.");
		System.out.println(
				"Proffesor Knight:	You can catch Pokemon and train them. Ofcourse you also can become friends with them.");
		System.out.println("			RING, RING, RING");
		System.out.println("Proffesor Knight:	Ow, sorry! I've got to take this call.");
		System.out.println("Proffesor Knight:	Please come see me soon!");
		boolean Continue = false;
		while (Continue == false) {
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Do you want to continue?");
				System.out.println("1: Yes");
				System.out.println("2: No");
				String input = in.nextLine();
				switch (input) {
				case "2":
					boolean valid2 = false;
					while (valid2 == false) {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Do you want to start over?");
						System.out.println("1: Yes");
						System.out.println("2: No");
						String input2 = in.nextLine();
						switch (input2) {
						case "2":
							valid2 = true;
							break;
						case "1":
							System.out.println("Starting new Game");
							return;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
					valid = true;
					break;
				case "1":
					Continue = true;
					valid = true;
					startInGame = true;
					break;
				default:
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Invalid input");
				}
			}
		}
		player.location = playershouse;
	}

	public void inGame() {
		while (true) {
			player.location.action();
		}
	}
	
	public static void saveGame() {
		try {
			FileOutputStream saveFile= new FileOutputStream("Game/TextBasedGame/Save.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			save.writeObject(player);
			save.writeObject(playershouse);
			save.writeObject(pircaltown);
			save.writeObject(knightslab);
			save.writeObject(rivalshouse);
			save.writeObject(route101);
			save.writeObject(mom);
			save.writeObject(rival);
			save.writeObject(professorknight);
			save.writeObject(tv);
			save.writeObject(bed);
			save.writeObject(computer);
			save.writeObject(knightstable);
			save.writeObject(menu);
			save.writeObject(inventory);
			save.writeObject(info);
			save.writeObject(options);
			save.writeObject(pokedex);
			save.writeObject(pokemon);
			save.writeObject(trainercard);
			save.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while saving!");
			e.printStackTrace();
		}
	}
	
	public static void loadGame() {
		try {
			FileInputStream saveFile = new FileInputStream("Game/TextBasedGame/Save.sav");
			ObjectInputStream save = new ObjectInputStream(saveFile);
			player = (Player) save.readObject();
			playershouse = (Location) save.readObject();
			pircaltown = (Location) save.readObject();
			knightslab = (Location) save.readObject();
			rivalshouse = (Location) save.readObject();
			route101 = (Location) save.readObject();
			mom = (Character) save.readObject();
			rival = (Rival) save.readObject();
			professorknight = (Character) save.readObject();
			tv = (Object) save.readObject();
			bed = (Object) save.readObject();
			computer = (Object) save.readObject();
			knightstable = (Object) save.readObject();
			menu = (Menu) save.readObject();
			inventory = (Inventory) save.readObject();
			info = (Info) save.readObject();
			options = (Options) save.readObject();
			pokedex = (Pokedex) save.readObject();
			pokemon = (Pokemon) save.readObject();
			trainercard = (Trainercard) save.readObject();
			startInGame = true;
			save.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("There is no save game!");
		} catch (ClassCastException e) {
			System.out.println("Your save file is corrupted! Please start a new game.");
		}
	}
}