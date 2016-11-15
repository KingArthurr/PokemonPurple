


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

@SuppressWarnings("unused")
public class Load {

	public static void loadGame() {
		try {
			FileInputStream saveFile = new FileInputStream("SaveObj.sav");
			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			save.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while loading!");
		}
	}
	
	
	
	
	/*private static String bed;
	private static String computer;
	private static String tv;
	private static String knightstable;
	
	private static String playershouse;
	private static String pircaltown;
	private static String knightslab;
	private static String rivalshouse;
	
	private static String rival;
	private static String professorknight;
	private static String player;
	private static String mom;

	public static void readGame() {
		readCharacters();
		readLocations();
		readObjects();
		readMisc();
	}
	
	public static String readSaveTxt() {
		String filepath = "SAVE.txt";
		return readFile(filepath);
	}
	
	private static void readCharacters() {
		mom = readSaveTxt().substring(readSaveTxt().indexOf("mom[") + 4, readSaveTxt().indexOf("]", readSaveTxt().indexOf("mom[")));
		player = readSaveTxt().substring(readSaveTxt().indexOf("player[") + 7, readSaveTxt().indexOf("]", readSaveTxt().indexOf("player[")));
		professorknight = readSaveTxt().substring(readSaveTxt().indexOf("professorknight[") + 16, readSaveTxt().indexOf("]", readSaveTxt().indexOf("professorknight[")));
		rival = readSaveTxt().substring(readSaveTxt().indexOf("rival[") + 6, readSaveTxt().indexOf("]", readSaveTxt().indexOf("rival[")));		
	}

	private static void readLocations() {
		knightslab = readSaveTxt().substring(readSaveTxt().indexOf("knightslab[") +11, readSaveTxt().indexOf("]", readSaveTxt().indexOf("knightslab[")));
		pircaltown = readSaveTxt().substring(readSaveTxt().indexOf("pircaltown[") +11, readSaveTxt().indexOf("]", readSaveTxt().indexOf("pircaltown[")));
		playershouse = readSaveTxt().substring(readSaveTxt().indexOf("playershouse[") + 13, readSaveTxt().indexOf("]", readSaveTxt().indexOf("playershouse[")));
		rivalshouse = readSaveTxt().substring(readSaveTxt().indexOf("rivalshouse[") + 12, readSaveTxt().indexOf("]", readSaveTxt().indexOf("rivalshouse[")));
	}

	private static void readObjects() {
		bed = readSaveTxt().substring(readSaveTxt().indexOf("bed[") + 4, readSaveTxt().indexOf("]", readSaveTxt().indexOf("bed[")));
		computer = readSaveTxt().substring(readSaveTxt().indexOf("computer[") + 9, readSaveTxt().indexOf("]", readSaveTxt().indexOf("computer[")));
		tv = readSaveTxt().substring(readSaveTxt().indexOf("tv[") + 3, readSaveTxt().indexOf("]", readSaveTxt().indexOf("tv[")));
		knightstable = readSaveTxt().substring(readSaveTxt().indexOf("knightstable[") + 3, readSaveTxt().indexOf("]", readSaveTxt().indexOf("knightstable[")));
	}

	private static void readMisc() {
		
	}

	public static void loadGame() {
		readGame();
		loadCharacters();
		loadLocations();
		loadObjects();
		loadMisc();
		Game.setStartInGame(true);
	}

	private static void loadMisc() {
		//System.out.println(misc);
	}

	private static void loadObjects() {
		Game.getObject("bed").loadGame(bed);
		Game.getObject("computer").loadGame(computer);
		Game.getObject("knightstable").loadGame(knightstable);
		Game.getObject("tv").loadGame(tv);
	}

	private static void loadLocations() {
		Game.getLocation("knightslab").loadGame(knightslab);
		Game.getLocation("pircaltown").loadGame(pircaltown);
		Game.getLocation("playershouse").loadGame(playershouse);
		Game.getLocation("rivalshouse").loadGame(rivalshouse);
	}
	
	private static void loadCharacters() {
		Game.getPlayer().loadGame(player);
		Game.getCharacter("mom").loadGame(mom);
		Game.getCharacter("professorknight").loadGame(professorknight);
		Game.getCharacter("rival").loadGame(rival);;
	}	
	
	public static String readFile(String filepath) {
		File inputFile;
		BufferedReader inputReader;
		String filetext = "";
		int filelenght = countLines(filepath);

		try {
			inputFile = new File(filepath);
			inputReader = new BufferedReader(new FileReader(inputFile));
			for (int i = 0; i < filelenght; i++) {
				filetext = filetext + inputReader.readLine();
			}
			inputReader.close();
			return filetext;
		} catch (Exception e) {
			return ("Something went wrong while loading");
		}
	}

	public static int countLines(String filename) {
		LineNumberReader reader;
		try {
			reader = new LineNumberReader(new FileReader(filename));
			int cnt = 0;
			while ((reader.readLine()) != null) {
			}

			cnt = reader.getLineNumber();
			reader.close();
			return cnt;
		} catch (IOException e) {
			return -1;
		}
	}*/
}
