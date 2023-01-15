import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class GameSys {

	private static TreeSet<Game> gameSet = new TreeSet<>();
	private static ArrayList<Game> gameList = new ArrayList<>();
	private static int readcount = 0;

	public static boolean readFromFile() {

		try {
			File file = new File("gamesDB.txt"); //221Project/gamesDB.txt

			if (!file.exists()) {
				System.out.println("ERROR: File does not exists!");
				System.exit(0);
			}

			Scanner input = new Scanner(file);

			Game newGame = null;

			while (input.hasNext()) {

				int id = input.nextInt();

				String type = input.next();
				String name = input.next();
				String genre = input.next();
				String publisher = input.next();
				double price = input.nextDouble();

				int minAgeRestriction = input.nextInt();
				String releaseDate = input.next();
				
				String support = input.next();
				String[] supportedLanguages = support.split(",");
				
				int playerCount = input.nextInt();

				if (type.equalsIgnoreCase("ConsoleGame")) {
					boolean inAppPurchases = input.nextBoolean();
					boolean diskReader = input.nextBoolean();
					int numOfController = input.nextInt();
					double size = input.nextDouble();
					boolean isMultiplayer = input.nextBoolean();
					
					ArrayList<Region> region = new ArrayList<>();
					String names, language, currency;
					names = input.next();
					language = input.next();
					currency = input.next();
					Region reg = new Region(names, language, currency);
					region.add(reg);
					newGame = new ConsoleGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate,
							supportedLanguages, playerCount, inAppPurchases, diskReader, numOfController, size,
							isMultiplayer, region);
				} 
				else if (type.equalsIgnoreCase("VrGame")) {
					boolean extraHardware = input.nextBoolean();
					String hardwareRequirement = input.next();
					double environmentSize = input.nextDouble();
					String environmentType = input.next();
					boolean isMultiplayer = input.nextBoolean();

					newGame = new VrGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate,
							supportedLanguages, playerCount, extraHardware, hardwareRequirement, environmentSize,
							environmentType, isMultiplayer);
				} 
				else if (type.equalsIgnoreCase("TableTopGame")) {

					double time = input.nextDouble();
					String learningCurve = input.next();
					boolean isDeterministic = input.nextBoolean();

					newGame = new TabletopGame(id, type, name, genre, publisher, price, minAgeRestriction, releaseDate,
							supportedLanguages, playerCount, time, learningCurve, isDeterministic);
				}

				gameList.add(newGame);

			}

			input.close();
			setReadcount(getReadcount() + 1);
			return true;
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("ERROR: File does not exists!");
			return false;
		}

	}

	// GUI de if check yapılıcak ikili seçme sistemi console game vr game vs
	public static boolean addGame(int id, String objType, String name, String genre, String publisher, double price,
			int minAgeRestriction, String releaseDate, String[] supportedLanguages, int playerCount,
			boolean inAppPurchases, boolean diskReader, int numOfController, double size, boolean isMultiplayer,
			ArrayList<Region> region, boolean extraHardware, String hardwareRequirement, double environmentSize,
			String environmentType, double time, String learningCurve, boolean isDeterministic) {// not sorted

		for (Game g : gameList)
			if (g.getId() == id)
				return false;

		if (objType.equalsIgnoreCase("ConsoleGame")) {

			ConsoleGame cg = new ConsoleGame(id, objType, name, genre, publisher, price, minAgeRestriction, releaseDate,
					supportedLanguages, playerCount, inAppPurchases, diskReader, numOfController, size, isMultiplayer,
					region);
			gameList.add(cg);
		} else if (objType.equalsIgnoreCase("VrGame")) {
			VrGame newGame = new VrGame(id, objType, name, genre, publisher, price, minAgeRestriction, releaseDate,
					supportedLanguages, playerCount, extraHardware, hardwareRequirement, environmentSize,
					environmentType, isMultiplayer);
			gameList.add(newGame);
		} else if (objType.equalsIgnoreCase("TableTop")) {

			TabletopGame ttg = new TabletopGame(id, objType, name, genre, publisher, price, minAgeRestriction,
					releaseDate, supportedLanguages, playerCount, time, learningCurve, isDeterministic);

			gameList.add(ttg);
		}

		return true;

	}

	public static void calcAllNewPrice() {

		for (int i = 0; i < gameList.size(); i++) {

			gameList.get(i).setPrice(gameList.get(i).calNewPrice(0));

		}

	}

	public static double dispSelectedHardness(int id) {

		for (int i = 0; i < gameList.size(); i++) {
			if (gameList.get(i).getId() == id) {
				return gameList.get(i).calculatehardness();
			}

		}
		return 0.;

	}

	// The related method checks if the gameId is in the arraylist or not.
	public static boolean checkGameId(int gameId) {
		for (int i = 0; i < gameList.size(); i++) {
			if (gameList.get(i).getId() == gameId)
				return true;
		}
		return false;
	}

	// The method returns the arraylist.
	public static ArrayList<Game> getGameList() {
		return gameList;
	}

	// The method searches the object in the arraylist accordingn to the given id.
	// If it finds, returns related object. Otherwise, returns null.
	public static Game searchGame(int gameId) {
		for (int i = 0; i < gameList.size(); i++) {
			if (gameList.get(i).getId() == gameId) {
				return gameList.get(i);
			}

		}
		return null;
	}

	// The game finds and removes the object according to the given game id.
	public static boolean removeGame(int gameId) {
		for (int i = 0; i < gameList.size(); i++) {
			if (gameList.get(i).getId() == gameId) {
				gameList.remove(i);
				return true;
			}
		}

		return false;
	}

	// The method returns all games string.
	public static String displayAllGames() {
		String str = "";

		for (int i = 0; i < gameList.size(); i++) {
			str += gameList.get(i).toString() + "\n";
		}

		return str;
	}

	public static TreeSet<Game> getGameSet() {
		return gameSet;
	}

	// The method searches and returns the info of game if it finds.
	public static String displayTheGame(String gameName) {
		for (int i = 0; i < gameList.size(); i++) {
			if (gameList.get(i).getName().equalsIgnoreCase(gameName))
				return gameList.get(i).toString();
		}

		return null;
	}

	public static String displayTheGameByPrice(double MaxPrice, double MinPrice) {
		for (int i = 0; i < gameList.size(); i++) {
			if (MaxPrice >= gameList.get(i).getPrice() && gameList.get(i).getPrice() >= MinPrice)
				return gameList.get(i).toString();
		}
		return null;
	}



	public static int getReadcount() {
		return readcount;
	}
	
	public static void setReadcount(int readcount) {
		GameSys.readcount = readcount;
	}
}