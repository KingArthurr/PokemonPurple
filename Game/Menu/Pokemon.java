package Menu;

import java.io.Serializable;
import java.util.List;

import TextBasedGame.Game;

public class Pokemon implements Serializable {
	
	private static final long serialVersionUID = 6107653364028414002L;
	public boolean battleSwitchMade = false;
	
	public static void viewTeam() {
		List<Pokemons.Pokemon> team = Game.player.team;
		if (team.isEmpty()) {
			System.out.println("Your team is empty!");
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(i+1 + ": ");
			if (team.size() > i) {
				System.out.println(team.get(i).name);
			} else { 
				System.out.println("");
			}
		}
	}

	public void menu() {
		List<Pokemons.Pokemon> team = Game.player.team;
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Party:");
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			viewTeam();
			System.out.println("M: Close Pokemon");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				if (team.size() < 1) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(0));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "2":
				if (team.size() < 2) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(1));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "3":
				if (team.size() < 3) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(2));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "4":
				if (team.size() < 4) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(3));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "5":
				if (team.size() < 5) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(4));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "6":
				if (team.size() < 6) {
					System.out.println("No Pokemon here!");
				} else {
					menu2(team.get(5));
					if (battleSwitchMade == true) {
						valid = true;
					}
				}	
				break;
			case "m": case "M":
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("You closed Pokemon");
				valid = true;
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
	}

	public void menu2(Pokemons.Pokemon pokemon) {
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1: Summary");
			System.out.println("2: Switch");
			//TODO ITEMS
			//TODO HMS
			System.out.println("M: Exit");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				Summary(pokemon);
				valid = true;
				break;
			case "2":
				Switch(pokemon);
				valid = true;
				break;
			case "m": case "M":
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				valid = true;
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
	}

	public void Switch(Pokemons.Pokemon pokemon) {
		List<Pokemons.Pokemon> team = Game.player.team;
		if (Game.player.isInBattle == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Party:");
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Who do you want to switch " + pokemon.name + " with?");
				viewTeam();
				System.out.println("M: Exit");
				String input = Game.in.nextLine();
				switch (input) {
				case "1":
					if (team.size() < 1) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(0);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "2":
					if (team.size() < 2) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(1);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "3":
					if (team.size() < 3) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(2);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "4":
					if (team.size() < 4) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(3);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "5":
					if (team.size() < 5) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(4);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "6":
					if (team.size() < 6) {
						System.out.println("No Pokemon here!");
					} else {
						Pokemons.Pokemon pokemon1 = pokemon;
						Pokemons.Pokemon pokemon2 = Game.player.team.get(5);
						int poke1 = Game.player.team.indexOf(pokemon1);
						int poke2 = Game.player.team.indexOf(pokemon2);
						if (poke1 == poke2) {
							System.out.println("You can not switch a Pokemon with itself");
						} else {
							Game.player.team.remove(poke1);
							Game.player.team.remove(poke2);
							Game.player.team.add(poke1, pokemon2);
							Game.player.team.add(poke2, pokemon1);
							valid = true;
						}
					}	
					break;
				case "m": case "M":
					valid = true;
					break;
				default:
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Invalid input");
				}
			}
		} else {
			if (Game.player.pokemonInBattle == pokemon) {
				System.out.println(Game.player.pokemonInBattle.name + " is already in battle!");
			} else {
				Game.player.pokemonInBattle = pokemon;
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("You send out "+Game.player.pokemonInBattle.name+"!");
				battleSwitchMade = true;
			}
		}
	}

	public static void Summary(Pokemons.Pokemon pokemon) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println(pokemon.name);
		System.out.println("Pokemon:	" + pokemon.species.toString());
		System.out.print("Type:		"); pokemon.type.forEach(item->System.out.print(item + " ")); System.out.println("");
		System.out.println("Level:		" + pokemon.level);
		System.out.println("Health:		" + pokemon.Health + "/" + pokemon.HP);
		if (pokemon.moves == null || pokemon.moves.isEmpty()) {
			System.out.println("Moves:		None");
		} else {
			System.out.println("Moves:		"); pokemon.moves.forEach(item->System.out.print(item.name + " " + item.PP + "/" +item.MaxPP + "\n")); 
			System.out.println("");
		}
		System.out.println("		HP	ATK	DEF	SAT	SDE	SPD");
		System.out.println("Stats:		" + pokemon.HP + "	" + pokemon.ATTACK + "	" + pokemon.DEFENCE + "	" + 
											pokemon.SATTACK + "	" + pokemon.SDEFENCE + "	" + pokemon.SPEED);
		System.out.println("Basestats:	" + pokemon.basestats[0] + "	" + pokemon.basestats[1] + "	" + pokemon.basestats[2] + "	" + 
											pokemon.basestats[3] + "	" + pokemon.basestats[4] + "	" + pokemon.basestats[5]);
	}
}
