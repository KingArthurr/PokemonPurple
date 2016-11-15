import Battle.WildBattle;
import Pokemons.Pokemon;
import Pokemons.Move;
import Pokemons.Move.Moves;
import Pokemons.Pokemon.Species;
import TextBasedGame.Game;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		Game.player.team.add(new Pokemon(Species.Bulbasaur, 5));
		Pokemon bulba = new Pokemon(Species.Bulbasaur, 5);
		Pokemon bulbas = new Pokemon(Species.Bulbasaur, 3);
		//WildBattle battle = new WildBattle(Species.Bulbasaur, 3);
		while (true) {
			//battle.DamageCalc(bulba, bulbas, new Move(Moves.Tackle));
			//System.out.println(65.0/(9 + Math.random() * 55));
		}
	}
		
}
