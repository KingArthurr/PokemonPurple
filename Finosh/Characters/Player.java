package Characters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Locations.Location;
import Objects.Object;
import Pokemons.Pokemon;
import TextBasedGame.Game;

public class Player implements Serializable {

	private static final long serialVersionUID = -9179537893709898095L;
	public String name;
	public Location location;
	public List<Pokemon> team = new ArrayList<Pokemon>();
	public boolean isInTrainerBattle = false;
	public boolean usedBattleEnd = false;
	public boolean isInBattle = false;
	public Pokemon pokemonInBattle;
	
	public void addPokemon(int place, Pokemon pokemon){
		System.out.println(pokemon.name + " was added to your party.");
		Boolean valid = false;
		while (valid==false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Do you want to give " + pokemon.name +" a nickname?");
			System.out.println("1: Yes");
			System.out.println("2: No");
			String input = Game.in.nextLine();
			switch (input) {
			case "1" : 
				boolean nameBoolean = false;
				while (nameBoolean == false) {
					System.out.println(
							"--------------------------------------------------------------------------------------------------------------");
					System.out.println("Please enter a nickname:");
					String name = Game.in.nextLine();
					if (!name.isEmpty()) {
						pokemon.name = name;
						nameBoolean = true;
					}
				}
				valid = true;
				break;
			case "2" :
				valid = true;
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}
		if (team.size() < 6) {
			team.add(place, pokemon);
		} else {
			Object.pokemonstorage.add(pokemon);
		}
	}
	
	public void removePokemon(Pokemon pokemon) {
		team.remove(pokemon);
	}
}
