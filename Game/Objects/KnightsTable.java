package Objects;

import Pokemons.Pokemon;
import Pokemons.Pokemon.Species;
import TextBasedGame.Game;

public class KnightsTable implements Object {

	private static final long serialVersionUID = -6914700909939870201L;
	public int visits = 0;
	public boolean gotPokemon = false;
	
	@Override
	public void action() {
		if (gotPokemon == false && Game.knightslab.getBoolean("spokeWithKnightBoolean") == true) {		
			boolean valid = false;
			while (valid == false) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Please pick a Pokemon:");
				System.out.println("1: Bulbasaur");
				System.out.println("2: Charmander");
				System.out.println("3: Squirtle");
				String input = in.nextLine();
				switch (input) {
				case "1":
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Do you want the Grass Type Pokemon Bulbasaur?");
					System.out.println("1: Yes");
					System.out.println("2: No");
					input = in.nextLine();
					switch (input) {
					case "1" :
						Pokemon Bulbasaur = new Pokemon(Species.Bulbasaur, 5);
						Game.player.addPokemon(Game.player.team.size(), Bulbasaur);
						valid = true;
						break;
					case "2" :
						break;
					default:
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Invalid input");	
					}
					break;
				case "2":
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Do you want the Fire Type Pokemon Charmander?");
					System.out.println("1: Yes");
					System.out.println("2: No");
					input = in.nextLine();
					switch (input) {
					case "1" : 
						Pokemon Charmander = new Pokemon(Species.Charmander, 5);
						Game.player.addPokemon(Game.player.team.size(), Charmander);
						valid = true;
						break;
					case "2" :
						break;
					default:
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Invalid input");	
					}
					break;
				case "3":
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Do you want the Water Type Pokemon Squirtle?");
					System.out.println("1: Yes");
					System.out.println("2: No");
					input = in.nextLine();
					switch (input) {
					case "1" : 
						Pokemon Squirtle = new Pokemon(Species.Squirtle, 5);
						Game.player.addPokemon(Game.player.team.size(), Squirtle);
						valid = true;
						break;
					case "2" :
						break;
					default:
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("Invalid input");	
					}
					break;
				default:
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Invalid input");
				}
			}
			gotPokemon = true;
			visits++;
			Game.professorknight.setInt("spokeWithKnight", 2);
		} else if (gotPokemon == true) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("There is just one Pokeball left.");
		} else if (visits == 0) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("There are three Pokeballs on the table");
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
		case "gotPokemon":	return gotPokemon;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "gotPokemon":	gotPokemon = bool;
		default:	return;
		}
	}
}
