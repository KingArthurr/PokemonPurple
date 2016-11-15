package Items;

import java.io.Serializable;
import java.util.List;

import Menu.Pokemon;
import Pokemons.Move;
import Pokemons.Move.Moves;
import Pokemons.Pokemon.StatusEffects;
import TextBasedGame.Game;

public class BattleItem implements Serializable{

	private static final long serialVersionUID = 7368252435019334618L;
	public String name;
	public BattleItems battleitem;
	
	
	public BattleItem(BattleItems battleitems) {
		name = battleitems.toString();
		battleitem = battleitems;
	}
	
	public void use(BattleItem item) {
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
					useMedicine(Game.player.team.get(0), item);
					valid = true;
				}
				break;
			case "2":
				if (team.size() < 2) {
					System.out.println("No Pokemon here!");
				} else {
					useMedicine(Game.player.team.get(1), item);
					valid = true;
				}	
				break;
			case "3":
				if (team.size() < 3) {
					System.out.println("No Pokemon here!");
				} else {
					useMedicine(Game.player.team.get(2), item);
					valid = true;
				}	
				break;
			case "4":
				if (team.size() < 4) {
					System.out.println("No Pokemon here!");
				} else {
					useMedicine(Game.player.team.get(3), item);
					valid = true;
				}	
				break;
			case "5":
				if (team.size() < 5) {
					System.out.println("No Pokemon here!");
				} else {
					useMedicine(Game.player.team.get(4), item);
					valid = true;
				}	
				break;
			case "6":
				if (team.size() < 6) {
					System.out.println("No Pokemon here!");
				} else {
					useMedicine(Game.player.team.get(5), item);
					valid = true;
				}	
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

	public void useMedicine(Pokemons.Pokemon pokemon, BattleItem item) {
		switch (item.battleitem) {
		case Antidote: 
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects == StatusEffects.Poisoned.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case Awakening:
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects == StatusEffects.Asleep.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case BurnHeal:
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects == StatusEffects.Burned.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case DireHit:
			if(Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XCRIT < 1) {
							pokemon.XCRIT++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case Elixer:
			if (pokemon.Health != 0) {
				int check = 0;
				int moves = pokemon.moves.size();
				for (int i = 0; i < moves; i++) {
					if (pokemon.moves.get(i).PP != pokemon.moves.get(i).MaxPP) {
						check++;
					}
				}
				if (check != 0) {
					for (int j = 0; j < moves; j++) {
						pokemon.moves.get(j).PP += 10;
						if (pokemon.moves.get(j).PP > pokemon.moves.get(j).MaxPP) {
							pokemon.moves.get(j).PP = pokemon.moves.get(j).MaxPP;
						}
					}
					Game.inventory.removeBattleItem(item);
				}  else {
					System.out.println("It won't have any effect");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case Ether:
			if (pokemon.Health != 0) {
				List<Move> moves = pokemon.moves;
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Moves:");
				boolean valid = false;
				while (valid == false) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Which move?");
					(new Move(Moves.Absorb)).viewMoves(pokemon);
					System.out.println("M: Exit");
					String input = Game.in.nextLine();
					switch (input) {
					case "1":
						if (moves.size() < 1) {
							System.out.println("No move here!");
						} else {
							if (pokemon.moves.get(0).PP != pokemon.moves.get(0).MaxPP) {
								pokemon.moves.get(0).PP += 10;
								if (pokemon.moves.get(0).PP > pokemon.moves.get(0).MaxPP) {
									pokemon.moves.get(0).PP = pokemon.moves.get(0).MaxPP;
								}
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(1).PP != pokemon.moves.get(1).MaxPP) {
								pokemon.moves.get(1).PP += 10;
								if (pokemon.moves.get(1).PP > pokemon.moves.get(1).MaxPP) {
									pokemon.moves.get(1).PP = pokemon.moves.get(1).MaxPP;
								}
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(2).PP != pokemon.moves.get(2).MaxPP) {
								pokemon.moves.get(2).PP += 10;
								if (pokemon.moves.get(2).PP > pokemon.moves.get(2).MaxPP) {
									pokemon.moves.get(2).PP = pokemon.moves.get(2).MaxPP;
								}
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(3).PP != pokemon.moves.get(3).MaxPP) {
								pokemon.moves.get(3).PP += 10;
								if (pokemon.moves.get(3).PP > pokemon.moves.get(3).MaxPP) {
									pokemon.moves.get(3).PP = pokemon.moves.get(3).MaxPP;
								}
								Game.inventory.removeBattleItem(item);
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
		case FreshWater:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 50;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case FullHeal:
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects != StatusEffects.None.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case FullRestore:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP || pokemon.statuseffect.statuseffects != StatusEffects.None.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					pokemon.Health = pokemon.HP;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case GuardSpec:
			if(Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XSTATPRCT == 0) {
							pokemon.XSTATPRCT = 5;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case HyperPotion:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 200;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case IceHeal:
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects == StatusEffects.Frozen.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case Lemonade:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 80;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case MaxElixer:
			if (pokemon.Health != 0) {
				int check = 0;
				int moves1 = pokemon.moves.size();
				for (int i = 0; i < moves1; i++) {
					if (pokemon.moves.get(i).PP != pokemon.moves.get(i).MaxPP) {
						check++;
					}
				}
				if (check != 0) {
					for (int j = 0; j < moves1; j++) {
						pokemon.moves.get(j).PP = pokemon.moves.get(j).MaxPP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case MaxEther:
			if (pokemon.Health != 0) {
				List<Move> moves = pokemon.moves;
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Moves:");
				boolean valid = false;
				while (valid == false) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Which move?");
					(new Move(Moves.Absorb)).viewMoves(pokemon);
					System.out.println("M: Exit");
					String input = Game.in.nextLine();
					switch (input) {
					case "1":
						if (moves.size() < 1) {
							System.out.println("No move here!");
						} else {
							if (pokemon.moves.get(0).PP != pokemon.moves.get(0).MaxPP) {
								pokemon.moves.get(0).PP = pokemon.moves.get(0).MaxPP;
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(1).PP != pokemon.moves.get(1).MaxPP) {
								pokemon.moves.get(1).PP = pokemon.moves.get(1).MaxPP;
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(2).PP != pokemon.moves.get(2).MaxPP) {
								pokemon.moves.get(2).PP = pokemon.moves.get(2).MaxPP;
								Game.inventory.removeBattleItem(item);
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
							if (pokemon.moves.get(3).PP != pokemon.moves.get(3).MaxPP) {
								pokemon.moves.get(3).PP = pokemon.moves.get(3).MaxPP;
								Game.inventory.removeBattleItem(item);
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
		case MaxPotion:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health = pokemon.HP;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case MaxRevive:
			if (pokemon.Health == 0) {
				pokemon.Health = pokemon.HP;
				Game.inventory.removeBattleItem(item);
			} else {
				System.out.println("It won't have any effect!");
			}
			break;
		case ParlyzHeal:
			if (pokemon.Health != 0) {
				if (pokemon.statuseffect.statuseffects == StatusEffects.Paralyzed.statuseffects) {
					pokemon.statuseffect = StatusEffects.None;
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case PokeDoll:
			if (Game.player.isInBattle == true && Game.player.isInTrainerBattle == false) {
				Game.player.usedBattleEnd = true;
				Game.inventory.removeBattleItem(item);
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case Potion:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 10;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case Revive:
			if (pokemon.Health == 0) {
				pokemon.Health = pokemon.HP/2;
				Game.inventory.removeBattleItem(item);
			} else {
				System.out.println("It won't have any effect!");
			}
			break;
		case SodaPop:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 60;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case SuperPotion:
			if (pokemon.Health != 0) {
				if (pokemon.Health != pokemon.HP) {
					pokemon.Health += 50;
					if (pokemon.Health > pokemon.HP) {
						pokemon.Health = pokemon.HP;
					}
					Game.inventory.removeBattleItem(item);
				} else {
					System.out.println("It won't have any effect!");
				}
			} else {
				System.out.println("The Pokemon is fainted!");
			}
			break;
		case XAccuracy:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XACC < 6) {
							pokemon.XACC++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case XAttack:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XATT < 6) {
							pokemon.XATT++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case XDefend:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XDEF < 6) {
							pokemon.XDEF++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case XSpAtk:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XSATT < 6) {
							pokemon.XSATT++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case XSpDef:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XSDEF < 6) {
							pokemon.XSDEF++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		case XSpeed:
			if (Game.player.isInBattle == true) {
				if (Game.player.pokemonInBattle == pokemon) {
					if (pokemon.Health != 0) {
						if (pokemon.XSPD < 6) {
							pokemon.XSPD++;
							Game.inventory.removeBattleItem(item);
						} else {
							System.out.println("It won't have any effect!");
						}
					} else {
						System.out.println("The Pokemon is fainted!");
					}
				} else {
					System.out.println("You can only use this item on the Pokemon you are using!");
				}
			} else {
				System.out.println("You can't use this item right now");
			}
			break;
		default:
			break;		
		}
	}

	public void info(BattleItem item) {
		switch (item.battleitem) {
		case Antidote:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine. It lifts the effect of poison from one Pokémon.");
			break;
		case Awakening:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine. It awakens a Pokémon from the clutches of sleep.");
			break;
		case BurnHeal:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine. It heals a single Pokémon that is suffering from a burn.");
			break;
		case DireHit:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("It raises the critical-hit ratio greatly. It can be used only once and wears off if the Pokémon is withdrawn.");
			break;
		case Elixer:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("It restores the PP of all the moves learned by the targeted Pokémon by 10 points each.");
			break;
		case Ether:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("It restores the PP of a Pokémon's selected move by a maximum of 10 points.");
			break;
		case FreshWater:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Water with a high mineral content. It restores the HP of one Pokémon by 50 points.");
			break;
		case FullHeal:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine. It heals all the status problems of a single Pokémon.");
			break;
		case FullRestore:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A medicine that fully restores the HP and heals any status problems of a single Pokémon.");
			break;
		case GuardSpec:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that prevents stat reduction among the Trainer's party Pokémon for five turns after it is used in battle.");
			break;
		case HyperPotion:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine for wounds. It restores the HP of one Pokémon by 200 points.");
			break;
		case IceHeal:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine. It defrosts a Pokémon that has been frozen solid.");
			break;
		case Lemonade:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A very sweet drink. It restores the HP of one Pokémon by 80 points.");
			break;
		case MaxElixer:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("It fully restores the PP of all the moves learned by the targeted Pokémon.");
			break;
		case MaxEther:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("It fully restores the PP of a single selected move that has been learned by the target Pokémon.");
			break;
		case MaxPotion:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine for wounds. It completely restores the HP of a single Pokémon.");
			break;
		case MaxRevive:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A medicine that can revive fainted Pokémon. It also fully restores a fainted Pokémon's maximum HP.");
			break;
		case ParlyzHeal:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine for paralysis. It can be used once to free a Pokémon that has been paralyzed.");
			break;
		case PokeDoll:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A doll that attracts the attention of a Pokémon. It guarantees escape from any battle with wild Pokémon");
			break;
		case Potion:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine for wounds. It restores the HP of one Pokémon by just 20 points.");
			break;
		case Revive:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A medicine that can revive fainted Pokémon. It also restores half of a fainted Pokémon's maximum HP.");
			break;
		case SodaPop:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A highly carbonated soda drink. When consumed, it restores 60 HP to an injured Pokémon.");
			break;
		case SuperPotion:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A spray-type medicine for treating wounds. It can be used to restore 50 HP to an injured Pokémon.");
			break;
		case XAccuracy:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that boosts the accuracy of a Pokémon during a battle. It wears off once the Pokémon is withdrawn.");
			break;
		case XAttack:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that boosts the Attack stat of a Pokémon during a battle. It wears off once the Pokémon is withdrawn.");
			break;
		case XDefend:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that boosts the Defense stat of a Pokémon during a battle. It wears off once the Pokémon is withdrawn.");
			break;
		case XSpAtk:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that raises the Sp. Atk stat of a Pokémon in battle. It wears off if the Pokémon is withdrawn.");
			break;
		case XSpDef:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that boosts the Sp. Def stat of a Pokémon during a battle. It wears off once the Pokémon is withdrawn.");
			break;
		case XSpeed:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An item that boosts the Speed stat of a Pokémon during a battle. It wears off once the Pokémon is withdrawn.");
			break;
		default:
			break;
		}
	}
	
	public void toss(BattleItem item) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("How many do you want to toss?");
		String input = Game.in.nextLine();
		int i = Integer.parseInt(input);
		if (i > 0 && i <= Game.inventory.BattleItems.get(item.battleitem)) {
			for (int j = 0; j < i; j++) {
				Game.inventory.removeBattleItem(item);
			}
		} else {
			System.out.println("Invalid input!");
		}
	}
	
	public enum BattleItems {
		Antidote(1),BurnHeal(2),IceHeal(3),Awakening(4),ParlyzHeal(5),FullRestore(6),MaxPotion(7),HyperPotion(8),SuperPotion(9),Potion(10),
		FullHeal(11),Revive(12),MaxRevive(13),FreshWater(14),SodaPop(15),Lemonade(16),Ether(17),MaxEther(18),Elixer(19),MaxElixer(20),
		XAccuracy(21),GuardSpec(22),XAttack(23),XDefend(24),XSpeed(25),XSpAtk(26),XSpDef(27),PokeDoll(28), DireHit(29);
		public int battleItems;
		
		BattleItems(int b){
			battleItems = b;
		}
	}
}
