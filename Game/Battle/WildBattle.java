
package Battle;

import java.util.ArrayList;
import java.util.List;

import Pokemons.Move;
import Pokemons.Pokemon;
import Pokemons.Pokemon.*;
import Pokemons.Type.Types;
import TextBasedGame.Game;

public class WildBattle {
	
	Pokemon wildPokemon;
	Pokemon winningPokemon;
	Boolean ran = false;

	public WildBattle(Species species, int lvl) {
		wildPokemon = new Pokemon(species, lvl);
		Game.player.pokemonInBattle = Game.player.team.get(0);
		battle();
	}
	
	private void battle(){
		Game.player.isInBattle = true;
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("A wild " + wildPokemon.name + " appeared!");
		System.out.println("You send in " + Game.player.pokemonInBattle.name + ".");
		while (Game.player.isInBattle) {
			showSituation();
			action();
			if (ran == true || Game.player.usedBattleEnd == true) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("You got away safely!");
				Game.player.usedBattleEnd = false;
				Game.player.isInBattle = false;
				return;
			}
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("This was just a test");
	}
	
	private void showSituation(){
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Wild "+wildPokemon.name+"'s Level: "+wildPokemon.level);
		System.out.println("Wild "+wildPokemon.name+"'s Health: "+wildPokemon.Health+"/"+wildPokemon.HP);
		System.out.println("Wild "+wildPokemon.name+"'s Status: "+wildPokemon.statuseffect);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println(Game.player.pokemonInBattle.name+"'s Level: "+Game.player.pokemonInBattle.level);
		System.out.println(Game.player.pokemonInBattle.name+"'s Health: "+Game.player.pokemonInBattle.Health+"/"+Game.player.pokemonInBattle.HP);
		System.out.println(Game.player.pokemonInBattle.name+"'s Status: "+Game.player.pokemonInBattle.statuseffect);
	}
	
	private void action(){
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1: Fight");
			System.out.println("2: Inventory");
			System.out.println("3: Pokemon");
			System.out.println("4: Run");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				fight();
				valid = true;
				break;
			case "2":
				Game.inventory.action();
				if (Game.inventory.battleItemUsed == true) {
					Game.inventory.battleItemUsed = false;
					valid = true;
				}
				break;
			case "3":
				Game.pokemon.menu();
				if (Game.pokemon.battleSwitchMade == true) {
					Game.pokemon.battleSwitchMade = false;
					valid = true;
				}
				break;
			case "4":
				int C = 1;
				if (Game.player.pokemonInBattle.SPEED*128/wildPokemon.SPEED+30*C > (int) Math.random() * 256){
					ran = true;
					valid = true;
				} else {
					C++;
				}
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
	}

	private void fight(){
		List<Pokemons.Move> moves = Game.player.pokemonInBattle.moves;
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Which move do you want to use?");
		if (moves.isEmpty()) {
			System.out.println("Your Pokemon has no moves");
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(i+1 + ": ");
			if (moves.size() > i) {
				System.out.println(moves.get(i).name + "	" + moves.get(i).PP + "/" + moves.get(i).MaxPP);
			} else { 
				System.out.println("");
			}
		}
		String input = Game.in.nextLine();
		Move PlayerMove = null;
		switch (input) {
		case "1": 
			PlayerMove = Game.player.pokemonInBattle.moves.get(0);
			break;
		case "2": 
			PlayerMove = Game.player.pokemonInBattle.moves.get(1);
			break;
		case "3": 
			PlayerMove = Game.player.pokemonInBattle.moves.get(2);
			break;
		case "4": 
			PlayerMove = Game.player.pokemonInBattle.moves.get(3);
			break;
		default:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Invalid input");
		}
		Move WildMove = wildPokemon.moves.get((int) (0 + Math.random() * (wildPokemon.moves.size()-1)));
		
		
		if (wildPokemon.SPEED > Game.player.pokemonInBattle.SPEED) {
			 Game.player.pokemonInBattle.Health -= DamageCalc(wildPokemon, Game.player.pokemonInBattle, WildMove);
			 wildPokemon.moves.get(wildPokemon.moves.indexOf(WildMove)).PP -= 1;
			if (Game.player.pokemonInBattle.Health <= 0) {
				winningPokemon = wildPokemon;
				Game.player.isInBattle = false;
				System.out.println("LOST");
				//TODO you LOST!
				return;
			} else {
				wildPokemon.Health -= DamageCalc(Game.player.pokemonInBattle, wildPokemon, PlayerMove);
				Game.player.pokemonInBattle.moves.get(Game.player.pokemonInBattle.moves.indexOf(PlayerMove)).PP -= 1;
				if (wildPokemon.Health <= 0) {
					winningPokemon = Game.player.pokemonInBattle;
					Game.player.isInBattle = false;
					System.out.println("WON");
					//TODO you won!
					return;
				}
			}
		} else if (wildPokemon.SPEED < Game.player.pokemonInBattle.SPEED) {
			wildPokemon.Health -= DamageCalc(Game.player.pokemonInBattle, wildPokemon, PlayerMove);
			Game.player.pokemonInBattle.moves.get(Game.player.pokemonInBattle.moves.indexOf(PlayerMove)).PP -= 1;
			if (wildPokemon.Health <= 0) {
				winningPokemon = Game.player.pokemonInBattle;
				Game.player.isInBattle = false;
				System.out.println("WON");
				//TODO you won!
				return;
			} else {
				Game.player.pokemonInBattle.Health -= DamageCalc(wildPokemon, Game.player.pokemonInBattle, WildMove);
				wildPokemon.moves.get(wildPokemon.moves.indexOf(WildMove)).PP -= 1;
				if(Game.player.pokemonInBattle.Health <= 0) {
					winningPokemon = wildPokemon;
					Game.player.isInBattle = false;
					System.out.println("LOST");
					//TODO you lost
					return;
				}	
			}
		} else {
			List<Pokemon> inBattle = new ArrayList<Pokemon>();
			inBattle.add(wildPokemon);
			inBattle.add(Game.player.pokemonInBattle);
			int random = (int) Math.round(Math.random());
			
			if (wildPokemon == inBattle.get(random)) {
				 Game.player.pokemonInBattle.Health -= DamageCalc(wildPokemon, Game.player.pokemonInBattle, WildMove);
				 wildPokemon.moves.get(wildPokemon.moves.indexOf(WildMove)).PP -= 1;
				if (Game.player.pokemonInBattle.Health <= 0) {
					winningPokemon = wildPokemon;
					Game.player.isInBattle = false;
					System.out.println("LOST");
					//TODO you lost!
					return;
				} else {
					wildPokemon.Health -= DamageCalc(Game.player.pokemonInBattle, wildPokemon, PlayerMove);
					Game.player.pokemonInBattle.moves.get(Game.player.pokemonInBattle.moves.indexOf(PlayerMove)).PP -= 1;
					if (wildPokemon.Health <= 0) {
						winningPokemon = Game.player.pokemonInBattle;
						Game.player.isInBattle = false;
						System.out.println("WON");
						//TODO you won!
						return;
					}
				}
			} else {
				wildPokemon.Health -= DamageCalc(Game.player.pokemonInBattle, wildPokemon, PlayerMove);
				Game.player.pokemonInBattle.moves.get(Game.player.pokemonInBattle.moves.indexOf(PlayerMove)).PP -= 1;
				if (wildPokemon.Health <= 0) {
					winningPokemon = Game.player.pokemonInBattle;
					Game.player.isInBattle = false;
					System.out.println("WON");
					//TODO you won!
					return;
				} else {
					Game.player.pokemonInBattle.Health -= DamageCalc(wildPokemon, Game.player.pokemonInBattle, WildMove);
					wildPokemon.moves.get(wildPokemon.moves.indexOf(WildMove)).PP -= 1;
					if(Game.player.pokemonInBattle.Health <= 0) {
						winningPokemon = wildPokemon;
						Game.player.isInBattle = false;
						System.out.println("LOST");
						//TODO you lost
						return;
					}	
				}
			}
		}
	}

	public int DamageCalc(Pokemon attacker, Pokemon defender, Move move){
		double STAB;
		double Critical;
		double Type;
		if (attacker.type.contains(move.type)) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		Type = getTypeEffectiveness(defender, move);
		if (Type > 1) {
			System.out.println("It's super effective!");
		} else if (Type == 0) {
			System.out.println("It doesn't affect " + defender.name + "...");
		} else if (Type < 1) {
			System.out.println("It's not very effective.");
		}
		if (Math.random() <= attacker.SPEED/512) { //TODO
			Critical = 2;
			System.out.println("It's a critical hit!");
		} else {
			Critical = 1;
		}
		//TODO other
		double other = 1;
		double Modifier = STAB*Type*Critical*other*(Math.random() * (1 - 0.85) + 0.85);
		int damage = (int) ((((2.0*(double) attacker.level+10.0)/250.0)*((double) attacker.ATTACK/(double) defender.DEFENCE) * (double) move.Power +2.0)*Modifier);
		return damage;
	}

	private double getTypeEffectiveness(Pokemon defender, Move move) {
		double eff = 1;
		switch (move.type) {
		case Bug:
			if (defender.type.contains(Types.Grass)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Psychic)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Fire)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Fighting)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ghost)) {
				eff /= 2;
			}
			break;
		case Dragon:
			if (defender.type.contains(Types.Dragon)) {
				eff *= 2;
			}
			break;
		case Electric:
			if (defender.type.contains(Types.Flying)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Water)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Dragon)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Electric)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ground)) {
				return 0;
			}
			break;
		case Fighting:
			if (defender.type.contains(Types.Normal)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Ice)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Bug)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Psychic)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ghost)) {
				return 0;
			}
			break;
		case Fire:
			if (defender.type.contains(Types.Ice)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Bug)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Dragon)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Fire)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Water)) {
				eff /= 2;
			}
			break;
		case Flying:
			if (defender.type.contains(Types.Bug)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Fighting)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Electric)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff /= 2;
			}
			break;
		case Ghost:
			if (defender.type.contains(Types.Ghost)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Normal) || defender.type.contains(Types.Psychic)) {
				return 0;
			}
			break;
		case Grass:
			if (defender.type.contains(Types.Ground)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Water)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Bug)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Dragon)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Fire)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff /= 2;
			}
			break;
		case Ground:
			if (defender.type.contains(Types.Electric)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Fire)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Bug)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				return 0;
			}
			break;
		case Ice:
			if (defender.type.contains(Types.Dragon)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Ground)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Ice)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Water)) {
				eff /= 2;
			}
			break;
		case Normal:
			if (defender.type.contains(Types.Rock)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ghost)) {
				return 0;
			}
			break;
		case Poison:
			if (defender.type.contains(Types.Bug)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ground)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ghost)) {
				eff /= 2;
			}
			break;
		case Psychic:
			if (defender.type.contains(Types.Fighting)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Poison)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Psychic)) {
				eff /= 2;
			}
			break;
		case Rock:
			if (defender.type.contains(Types.Bug)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Fire)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Flying)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Ice)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Fighting)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Ground)) {
				eff /= 2;
			}
			break;
		case Water:
			if (defender.type.contains(Types.Fire)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Ground)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Rock)) {
				eff *= 2;
			}
			if (defender.type.contains(Types.Dragon)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Grass)) {
				eff /= 2;
			}
			if (defender.type.contains(Types.Water)) {
				eff /= 2;
			}
			break;
		}
		return eff;
	}

}
