package Locations;

import java.util.ArrayList;
import java.util.List;

import Battle.WildBattle;
import Pokemons.Pokemon.Species;
import TextBasedGame.Game;

public class Route101 implements Location {

	private static final long serialVersionUID = -5620158728988516416L;

	boolean TalkedToProfessor = false;
	
	public void action() {
		if (TalkedToProfessor == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Professor Knight:	Hey! Over here!");
			System.out.println("Professor Knight:	" + Game.player.name + ", where is " + Game.rival.name + "?");
			System.out.println("Professor Knight:	There he is! I wanted to tell you guys something");
			System.out.println("Professor Knight:	When you are traveling a route wild Pokemon can appear.");
			System.out.println("Professor Knight:	You can use these encounters to train your own Pokemon.");
			System.out.println("Professor Knight:	But you can also catch the Pokemon to add him to your team.");
			System.out.println("Professor Knight:	You have to be carefull though! If all your Pokemon faint you can't go further into the route.");
			System.out.println("Professor Knight:	Your best bet is to run back to the Pokemon Center in the last town.");
			System.out.println("Professor Knight:	I need to go back to the lab now. Be sure to check in with me regularly");
			TalkedToProfessor = true;
			Game.player.location = Game.route101;
		} else {
			List<Species> wildPokemon = new ArrayList<Species>();
			//wildPokemon.add(Species.Pidgey); wildPokemon.add(Species.Rattata);
			wildPokemon.clear(); wildPokemon.add(Species.Bulbasaur); // TODO for development only plz remove
			double lenght = 65.0;
			double devider = (9.0 + Math.random() * 55.0);
			int encounters = (int) (lenght/devider);
			for (int i = 0; i < encounters; i++) {
				new WildBattle(wildPokemon.get((int)(Math.random()*wildPokemon.size())), (int) (2.0+Math.random()*4.0));
			}
			Game.player.location = Game.pircaltown;//TODO next town  check last location and set other location
		}	
	}

	@Override
	public Integer getInt(String integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInt(String integer, Integer i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setString(String string, String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getBoolean(String boolen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBoolean(String boolen, Boolean bool) {
		// TODO Auto-generated method stub
		
	}

}
