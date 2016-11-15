package Items;

import java.io.Serializable;

import TextBasedGame.Game;

public class Pokeball implements Serializable{

	private static final long serialVersionUID = 7589493257830912831L;
	
	public String name;
	public Pokeballs pokeball;
	public double catchrate;
	
	public Pokeball(Pokeballs pokeball) {
		name = pokeball.toString();
		this.pokeball = pokeball;
		catchrate = getCatchRate(pokeball);
	}

	private double getCatchRate(Pokeballs pokeball2) {
		switch (pokeball2) {
		case GreatBall:
			return 1.5;
		case MasterBall:
			return Double.MAX_VALUE;
		case PokeBall:
			return 1;
		case SafariBall:
			return 1.5;
		case UltraBall:
			return 2;
		default:
			return 0;	
		}
	}

	public enum Pokeballs {
		GreatBall(1),MasterBall(2),PokeBall(3),SafariBall(4),UltraBall(5);
		public int pokeballs;
		
		Pokeballs(int p){
			pokeballs = p;
		}
	}

	public Pokeball use(Pokeball item) {
		if (Game.player.isInBattle == true) {
			return item;
		} else {
			System.out.println("You can't use this item right now");
		}
		return null;
	}

	public void toss(Pokeball item) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("How many do you want to toss?");
		String input = Game.in.nextLine();
		int i = Integer.parseInt(input);
		if (i > 0 && i <= Game.inventory.Pokeballs.get(item.pokeball)) {
			for (int j = 0; j < i; j++) {
				Game.inventory.removePokeball(item);
			}
		} else {
			System.out.println("Invalid input!");
		}
	}

	public void info(Pokeball item) {
		switch (item.pokeball) {
		case GreatBall:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A good, high-performance Poké Ball that provides a higher Pokémon catch rate than a standard Poké Ball can.");
			break;
		case MasterBall:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("The best Poké Ball with the ultimate level of performance. With it, you will catch any wild Pokémon without fail.");
			break;
		case PokeBall:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A device for catching wild Pokémon. It's thrown like a ball at a Pokémon, comfortably encapsulating its target.");
			break;
		case SafariBall:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("A special Poké Ball that is used only in the Safari Zone. It is recognizable by the camouflage pattern decorating it.");
			break;
		case UltraBall:
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("An ultra-high-performance Poké Ball that provides a higher success rate for catching Pokémon than a Great Ball.");
			break;
		default:
			break;
		
		}
	}
}
