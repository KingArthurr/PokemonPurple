

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import TextBasedGame.Game;

@SuppressWarnings("unused")
public class Save implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4029345566226129580L;

	public void saveGame() {
		Game.saveGame();
	}
	/*public void saveGame() {
		try {
			FileOutputStream saveFile= new FileOutputStream("SaveObj.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			save.writeObject(Game.class);
			save.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while saving!");
		}

		
	}
	
	
	
	
	
	
	
	
	public void saveGame() {
		String filepath = "SAVE.txt";
		String outputMessage = makeSaveTxt();
		writeFile(filepath, outputMessage);
	}

	private static void writeFile(String filepath, String outputMessage) {

		File outputFile;
		BufferedWriter outputWriter;

		outputFile = new File(filepath);

		try {
			outputWriter = new BufferedWriter(new FileWriter(outputFile));
			outputWriter.write(outputMessage);
			outputWriter.close();
			System.out.println("Saving complete");
		} catch (IOException e) {
			System.out.println("Something went wrong while saving");
			;
		}
	}

	public static String makeSaveTxt() {
		return saveCharacters() + saveLocations() + saveObjects() + saveMisc();
	}

	private static String saveCharacters() {
		return "Characters:" + Game.mom.saveGame() + Game.player.saveGame() + Game.professorknight.saveGame()
				+ Game.rival.saveGame();
	}

	private static String saveLocations() {
		return "Locations:" + Game.knightslab.saveGame() + Game.pircaltown.saveGame() + Game.playershouse.saveGame()
				+ Game.rivalshouse.saveGame();
	}

	private static String saveObjects() {
		return "Objects:" + Game.bed.saveGame() + Game.computer.saveGame() + Game.tv.saveGame()
				+ Game.knightstable.saveGame();
	}

	private static String saveMisc() {
		// TODO
		return "Misc:";
	} */
}
