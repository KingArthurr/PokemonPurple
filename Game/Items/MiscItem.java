package Items;

import java.io.Serializable;
import java.util.List;

import Menu.Pokemon;
import Pokemons.Move;
import Pokemons.Move.Moves;
import Pokemons.Pokemon.Species;
import TextBasedGame.Game;

public class MiscItem implements Serializable{
	
	private static final long serialVersionUID = -2533181087647665897L;
	int sellprice;
	int buyprice;
	public String name;
	public MiscItems miscitem;
	
	public MiscItem(MiscItems MiscItems) {
		name = MiscItems.toString();
		miscitem = MiscItems;
	}
	
	public enum MiscItems {
		MoonStone(1),EscapeRope(2),Repel(3),FireStone(4),ThunderStone(5),WaterStone(6),HPUp(7),Protein(8),Iron(9),Carbos(10),
		Calcium(11),Zinc(12),RareCandy(13),LeafStone(14),Nugget(15),PPUp(16),SuperRepel(17),MaxRepel(18);
		public int items;
		
		MiscItems(int i) {
			items = i;
		}
	}

	public void use(MiscItem item) {
		if (Game.player.isInBattle == false) {
			switch (item.miscitem) {
			case Calcium:
				Pokemons.Pokemon SATTmon = useOnPokemon();
				if (SATTmon.EVSATT < 100) {
					SATTmon.EVSATT =+ 10;
					if (SATTmon.EVSATT > 100) {
						SATTmon.EVSATT = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case Carbos:
				Pokemons.Pokemon SPDmon = useOnPokemon();
				if (SPDmon.EVSPD < 100) {
					SPDmon.EVSPD =+ 10;
					if (SPDmon.EVSPD > 100) {
						SPDmon.EVSPD = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case EscapeRope:
				//TODO
				break;
			case FireStone: case LeafStone: case MoonStone: case ThunderStone: case WaterStone:
				Pokemons.Pokemon STONEmon = useOnPokemon();
				Species species = STONEmon.species;
				STONEmon.evolve(item);
				Species species2 = STONEmon.species;
				if (!species.equals(species2)) {
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case HPUp:
				Pokemons.Pokemon HPmon = useOnPokemon();
				if (HPmon.EVHP < 100) {
					HPmon.EVHP =+ 10;
					if (HPmon.EVHP > 100) {
						HPmon.EVHP = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case Iron:
				Pokemons.Pokemon DEFmon = useOnPokemon();
				if (DEFmon.EVDEF < 100) {
					DEFmon.EVDEF =+ 10;
					if (DEFmon.EVDEF > 100) {
						DEFmon.EVDEF = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case MaxRepel:
				//TODO
				break;
			case Nugget:
				//TODO
				System.out.println("So what do you want to use this for?");
				break;
			case PPUp:
				Pokemons.Pokemon PPmon = useOnPokemon();
				if (PPmon.Health != 0) {
					List<Move> moves = PPmon.moves;
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Moves:");
					boolean valid = false;
					while (valid == false) {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Which move?");
						(new Move(Moves.Absorb)).viewMoves(PPmon);
						System.out.println("M: Exit");
						String input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (moves.size() < 1) {
								System.out.println("No move here!");
							} else {
								if (PPmon.moves.get(0).PPUp < 8) {
									PPmon.moves.get(0).PPUp++;
									PPmon.moves.get(0).MaxPP = PPmon.moves.get(0).move.getPPMax(PPmon.moves.get(0).move);
									PPmon.moves.get(0).MaxPP = PPmon.moves.get(0).MaxPP * (PPmon.moves.get(0).PPUp/5);
									Game.inventory.removeMiscItem(item);
									valid = true;
								} else {
									System.out.println("It won't have any effect!");
								}
							}	
							break;
						case "2":
							if (moves.size() < 2) {
								System.out.println("No move here!");
							} else {
								if (PPmon.moves.get(1).PPUp < 8) {
									PPmon.moves.get(1).PPUp++;
									PPmon.moves.get(1).MaxPP = PPmon.moves.get(1).move.getPPMax(PPmon.moves.get(1).move);
									PPmon.moves.get(1).MaxPP = PPmon.moves.get(1).MaxPP * (PPmon.moves.get(1).PPUp/5);
									Game.inventory.removeMiscItem(item);
									valid = true;
								} else {
									System.out.println("It won't have any effect!");
								}
							}	
							break;
						case "3":
							if (moves.size() < 3) {
								System.out.println("No move here!");
							} else {
								if (PPmon.moves.get(2).PPUp < 8) {
									PPmon.moves.get(2).PPUp++;
									PPmon.moves.get(2).MaxPP = PPmon.moves.get(2).move.getPPMax(PPmon.moves.get(2).move);
									PPmon.moves.get(2).MaxPP = PPmon.moves.get(2).MaxPP * (PPmon.moves.get(2).PPUp/5);
									Game.inventory.removeMiscItem(item);
									valid = true;
								} else {
									System.out.println("It won't have any effect!");
								}
							}	
							break;
						case "4":
							if (moves.size() < 4) {
								System.out.println("No move here!");
							} else {
								if (PPmon.moves.get(3).PPUp < 8) {
									PPmon.moves.get(3).PPUp++;
									PPmon.moves.get(3).MaxPP = PPmon.moves.get(3).move.getPPMax(PPmon.moves.get(3).move);
									PPmon.moves.get(3).MaxPP = PPmon.moves.get(3).MaxPP * (PPmon.moves.get(3).PPUp/5);
									Game.inventory.removeMiscItem(item);
									valid = true;
								} else {
									System.out.println("It won't have any effect!");
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
					System.out.println("The Pokemon is fainted!");
				}	
				break;
			case Protein:
				Pokemons.Pokemon ATTmon = useOnPokemon();
				if (ATTmon.EVATT < 100) {
					ATTmon.EVATT =+ 10;
					if (ATTmon.EVATT > 100) {
						ATTmon.EVATT = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			case RareCandy:
				Pokemons.Pokemon RCmon = useOnPokemon();
				if (RCmon.Health != 0) {
					if (RCmon.level < 100) {
						RCmon.levelUp();
						Game.inventory.MiscItems.remove(item);
					} else {
						System.out.println("It won't have any effect!");
					}
				} else {
					System.out.println("The Pokemon is fainted!");
				}
				break;
			case Repel:
				//TODO
				break;
			case SuperRepel:
				//TODO
				break;
			case Zinc:
				Pokemons.Pokemon SDEFmon = useOnPokemon();
				if (SDEFmon.EVSDEF < 100) {
					SDEFmon.EVSDEF =+ 10;
					if (SDEFmon.EVSDEF > 100) {
						SDEFmon.EVSDEF = 100;
					}
					Game.inventory.MiscItems.remove(item);
				} else {
					System.out.println("It won't have any effect!");
				}
				break;
			default:
				break;
			
			}
		} else {
			System.out.println("You can't use this item right now");
		}	
	}

	public Pokemons.Pokemon useOnPokemon() {
		List<Pokemons.Pokemon> team = Game.player.team;
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Use on which Pokemon?");
			Pokemon.viewTeam();
			System.out.println("M: Exit");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				if (team.size() < 1) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(0);
				}
				break;
			case "2":
				if (team.size() < 2) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(1);
				}	
				break;
			case "3":
				if (team.size() < 3) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(2);
				}	
				break;
			case "4":
				if (team.size() < 4) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(3);
				}	
				break;
			case "5":
				if (team.size() < 5) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(4);
				}	
				break;
			case "6":
				if (team.size() < 6) {
					System.out.println("No Pokemon here!");
				} else {
					return Game.player.team.get(5);
				}	
				break;
			case "m": case "M":
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				valid = true;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
		return null;
	}
	
	public void info(MiscItem item) {
		switch (item.miscitem) {
		case Calcium:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base Sp. Atk stat of a single Pokémon.");
			break;
		case Carbos:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base Speed stat of a single Pokémon.");
			break;
		case EscapeRope:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A long and durable rope. Use it to escape instantly from a cave or a dungeon.");
			break;
		case FireStone:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A peculiar stone that can make certain species of Pokémon evolve. The stone has a fiery orange heart.");
			break;
		case HPUp:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base HP of a single Pokémon.");
			break;
		case Iron:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base Defense stat of a single Pokémon.");
			break;
		case LeafStone:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A peculiar stone that can make certain species of Pokémon evolve. It has an unmistakable leaf pattern.");
			break;
		case MaxRepel:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that prevents any low-level wild Pokémon from jumping out at you for 250 steps after its use.");
			break;
		case MoonStone:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A peculiar stone that can make certain species of Pokémon evolve. It is as black as the night sky.");
			break;
		case Nugget:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nugget of the purest gold that gives off a lustrous gleam in direct light. It can be sold at a high price to shops.");
			break;
		case PPUp:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A medicine that can slightly raise the maximum PP of a single move that has been learned by the target Pokémon.");
			break;
		case Protein:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base Attack stat of a single Pokémon.");
			break;
		case RareCandy:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A candy that is packed with energy. When consumed, it will instantly raise the level of a single Pokémon by one.");
			break;
		case Repel:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that prevents any low-level wild Pokémon from jumping out at you for 100 steps after its use.");
			break;
		case SuperRepel:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that prevents any low-level wild Pokémon from jumping out at you for 200 steps after its use.");
			break;
		case ThunderStone:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A peculiar stone that can make certain species of Pokémon evolve. It has a distinct thunderbolt pattern.");
			break;
		case WaterStone:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A peculiar stone that can make certain species of Pokémon evolve. It is the blue of a pool of clear water.");
			break;
		case Zinc:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A nutritious drink for Pokémon. When consumed, it raises the base Sp. Def stat of a single Pokémon.");
			break;
		default:
			break;
		}
	}

	public void toss(MiscItem item) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("How many do you want to toss?");
		String input = Game.in.nextLine();
		int i = Integer.parseInt(input);
		if (i > 0 && i <= Game.inventory.MiscItems.get(item.miscitem)) {
			for (int j = 0; j < i; j++) {
				Game.inventory.removeMiscItem(item);
			}
		} else {
			System.out.println("Invalid input!");
		}
	}
}
