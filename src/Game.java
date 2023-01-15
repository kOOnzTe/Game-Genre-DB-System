import java.util.Arrays;

public abstract class Game implements Hardness 
{
	
	protected int id;
	protected String type;
	protected String name;
	protected String genre;
	protected String publisher;
	protected double price;
	protected String developer;
	protected int minAgeRestriction;
	protected String releaseDate;
	protected String[] supportedLanguages;
	protected int playerCount;

	public Game(int id,String type, String name, String genre, String publisher, double price, int minAgeRestriction,
			String releaseDate, String[] supportedLanguages, int playerCount) 
	{
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
		this.minAgeRestriction = minAgeRestriction;
		this.releaseDate = releaseDate;
		this.supportedLanguages = supportedLanguages;
		this.playerCount = playerCount;
	}


	public String getType() {
		return type;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getPrice() {
		return price;
	}

	public String getDeveloper() {
		return developer;
	}

	public int getMinAgeRestriction() {
		return minAgeRestriction;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String[] getSupportedLanguages() {
		return supportedLanguages;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public void setMinAgeRestriction(int minAgeRestriction) {
		this.minAgeRestriction = minAgeRestriction;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setSupportedLanguages(String[] supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public boolean equals()
	{
		return true;
	}
	
	public abstract double calNewPrice(int ia);
	
	public abstract double calculatehardness();
	
	
	@Override
	public String toString() {
		return "\nGame "
				+"\nId = " + id + 
				"\nName = " + name + 
				"\nGenre = " + genre + 
				"\nPublisher = " + publisher + 
				"\nPrice = "+ price + 
				"\nMin Age Restriction = " + minAgeRestriction + 
				"\nRelease Date = "+ releaseDate + 
				"\nSupported Languages = " + Arrays.toString(supportedLanguages) + 
				"\nPlayer Count = "+ playerCount + "\n";
	}


}
