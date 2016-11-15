package Characters;

import Items.KeyItem;
import Items.KeyItem.KeyItems;
import TextBasedGame.Game;

public class Mom implements Character {

	private static final long serialVersionUID = -7599949367914005552L;
	public int spokeWithMom = 0;

	@Override
	public void action() {
		if (spokeWithMom == 0) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Mom:			Hey darling! Do you like your new room?");
			System.out.println("Mom:			Ahw I'm sorry you mis your friends.");
			System.out.println("Mom:			After your dad left, I couldn't afford our house anymore.");
			System.out.println("Mom:			But I'm sure you will make new friends quickly!");
			System.out.println("			RING, RING, RING");
			System.out.println("Professor Knight:	Hey " + Game.player.name + "! Could you come by my lab?");
			System.out.println("Professor Knight:	There is something I want to discuss with you! See you soon!");
			System.out.println("			Call ended...");
			System.out.println("Mom:			So what did Professor Knight want?");
			System.out.println("Mom:			He wants to meet you? You should go then!");
			System.out.println("Mom:			The professors lab is on the other side of town");
			spokeWithMom++;
		} else if (spokeWithMom == 2) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Mom:			Hey honey, what did the professor have to say?");
			System.out.println("Mom:			So he gave you your first Pokemon?");
			System.out.println("Mom:			That means your going to be a trainer now!");
			System.out.println("Mom:			Have this!");
			Game.inventory.addKeyItem(new KeyItem(KeyItems.TownMap));
			System.out.println("Mom:			It's a Townmap. This way you will never get lost.");
			System.out.println("Mom:			Now be on your way. And don't forget to visit your mom every now en then!");
			spokeWithMom--;
		} else if (spokeWithMom == 1){
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Mom is busy!");
		}
	}
	
	@Override
	public Integer getInt(String integer) {
		switch (integer) {
		case "spokeWithMom":	return spokeWithMom;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "spokeWithMom":	spokeWithMom = i;
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
		case "1":	return null;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "1":	return;
		default:	return;
		}
	}
}
