import java.util.ArrayList;

public class ConsoleGame extends Game {
	
	private boolean inAppPurchases;
	private boolean diskReader;
	private int numOfController;
	private double size;
	private boolean isMultiplayer;
	private ArrayList<Region> region = new ArrayList<>();
	private static int ConsoleGameCnt=0;
	
	public ConsoleGame(int id,String type, String name, String genre, String publisher, double price, int minAgeRestriction,
			String releaseDate, String[] supportedLanguages, int playerCount, boolean inAppPurchases,
			boolean diskReader, int numOfController, double size, boolean isMultiplayer, ArrayList<Region> region) {
		
		super(id,type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount);
		this.inAppPurchases = inAppPurchases;
		this.diskReader = diskReader;
		this.numOfController = numOfController;
		this.size = size;
		this.isMultiplayer = isMultiplayer;
		this.region = region;
		ConsoleGameCnt++;
	}
	
	
	
	public void setInAppPurchases(boolean inAppPurchases) {
		this.inAppPurchases = inAppPurchases;
	}



	public void setDiskReader(boolean diskReader) {
		this.diskReader = diskReader;
	}



	public void setNumOfController(int numOfController) {
		this.numOfController = numOfController;
	}



	public void setSize(double size) {
		this.size = size;
	}



	public void setMultiplayer(boolean isMultiplayer) {
		this.isMultiplayer = isMultiplayer;
	}



	public void setRegion(ArrayList<Region> region) {
		this.region = region;
	}



	public static void setConsoleGameCnt(int consoleGameCnt) {
		ConsoleGameCnt = consoleGameCnt;
	}



	public boolean isInAppPurchases() {
		return inAppPurchases;
	}



	public boolean isDiskReader() {
		return diskReader;
	}



	public int getNumOfController() {
		return numOfController;
	}



	public double getSize() {
		return size;
	}



	public boolean isMultiplayer() {
		return isMultiplayer;
	}



	public ArrayList<Region> getRegion() {
		return region;
	}



	public static int getConsoleGameCnt() {
		return ConsoleGameCnt;
	}



	@Override
	public String toString() {
		return super.toString()+"\nConsoleGame \ninAppPurchases=" + inAppPurchases + "\ndiskReader=" + diskReader + "\nnumOfController="
				+ numOfController + "\nsize=" + size + " GB" + "\nisMultiplayer=" + isMultiplayer + "\nRegion=" + region + "\n";
	}
//Calculation of regional prices
		public double calNewPrice(int i)
		{
			//It will get an index from an ComboBox and it will calculate the price according to the selected region and currency used there
			
			String regions = region.get(i).getName();
			String currency = region.get(i).getCurrency();
			if(regions.equalsIgnoreCase("Asia") && currency.equalsIgnoreCase("tl"))
				return price * 0.40;
			else if(regions.equalsIgnoreCase("Europe") && currency.equalsIgnoreCase("euro"))
				return price * 1.10;
			else if(regions.equalsIgnoreCase("Europe") && currency.equalsIgnoreCase("Grivna"))
				return price * 0.80;
			else if(regions.equalsIgnoreCase("Asia") && currency.equalsIgnoreCase("Dinar"))
				return price * 1.05;
			else if(regions.equalsIgnoreCase("America") && currency.equalsIgnoreCase("USD"))
				return price * 1;
			else if(regions.equalsIgnoreCase("America") && currency.equalsIgnoreCase("Peso"))
				return price * 0.65;
			else
				return price;
		}
	//Calculation of difficulty of the games
	@Override
	public double calculatehardness() {
		//hardness between 0-100
		int hardness = 0;
		
		if(isMultiplayer && inAppPurchases)
			hardness += 45;
		else if (isMultiplayer && !inAppPurchases)
			hardness += 15;
		else if (!isMultiplayer && inAppPurchases)
			hardness += 30;
		
		if(minAgeRestriction > 18)
			hardness += 65;
		else if(minAgeRestriction > 14 && minAgeRestriction < 18 )
			hardness += 25;
		else if(minAgeRestriction > 8 && minAgeRestriction < 14)
			hardness += 5;

		
		return hardness;
	}
	

}
