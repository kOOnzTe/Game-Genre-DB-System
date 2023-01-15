
public class TabletopGame extends Game {
	
	
	private double time;
	private String learningCurve;
	private boolean isDeterministic;
	private static int tableTopCnt = 0;
	
	public TabletopGame(int id,String type, String name, String genre, String publisher, double price, int minAgeRestriction,
			String releaseDate, String[] supportedLanguages, int playerCount, double time,
			String learningCurve, boolean isDeterministic) {
		
		super(id,type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount);
		
		this.time = time;
		this.learningCurve = learningCurve;
		this.isDeterministic = isDeterministic;
		tableTopCnt++;
	}

	

	public void setTime(double time) {
		this.time = time;
	}


	public void setLearningCurve(String learningCurve) {
		this.learningCurve = learningCurve;
	}




	public void setDeterministic(boolean isDeterministic) {
		this.isDeterministic = isDeterministic;
	}




	public static void setTableTopCnt(int tableTopCnt) {
		TabletopGame.tableTopCnt = tableTopCnt;
	}



	public double getTime() {
		return time;
	}




	public String getLearningCurve() {
		return learningCurve;
	}




	public boolean isDeterministic() {
		return isDeterministic;
	}




	public static int getTableTopCnt() {
		return tableTopCnt;
	}


	public double calNewPrice(int i)
	{
		//This method will calculate price by it's Game Type
		
		int supportedLanguagesCount = supportedLanguages.length;
		
		if(this.genre.equalsIgnoreCase("Card"))
			return price + ((price * supportedLanguagesCount) * 0.3);
		else if(this.genre.equalsIgnoreCase("Dice"))
			return  price + ((price * supportedLanguagesCount) * 0.05);
		else if(this.genre.equalsIgnoreCase("Strategy"))
			return  price + ((price * supportedLanguagesCount) * 0.55);
		else 
			return price;
	}
	
	@Override
	public double calculatehardness() {
		// hardness between 0 - 100
		int hardness = 0;
		
		if(this.isDeterministic)
			hardness += 35;
		
		if(this.learningCurve.equalsIgnoreCase("Long"))
			hardness += 30;
		else if(this.learningCurve.equalsIgnoreCase("Medium"))
			hardness += 20;
		
		if(this.genre.equalsIgnoreCase("Card"))
			hardness += 15;
		else if(this.genre.equalsIgnoreCase("Dice"))
			hardness += 5;
		else if(this.genre.equalsIgnoreCase("Strategy"))
			hardness += 35;
		
		
		return hardness;
	}

	@Override
	public String toString() {
		return super.toString()+"\nTabletopGame "+ "\ntime=" + time + "\nlearningCurve=" + learningCurve+ "\nisDeterministic=" + isDeterministic + "\n";
	}
	
	
	

}
