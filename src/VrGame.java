
public class VrGame extends Game {
	
	private boolean extraHardware;
	private String hardwareRequirement;
	private double environmentSize;
	private String environmentType;
	private boolean isMultiplayer;
	private static int VrGameCnt= 0 ;
	
	

	public VrGame(int id,String type, String name, String genre, String publisher, double price, int minAgeRestriction,
			String releaseDate, String[] supportedLanguages, int playerCount, boolean extraHardware,
			String hardwareRequirement, double environmentSize, String environmentType, boolean isMultiplayer) {
		
		super(id,type, name, genre, publisher, price, minAgeRestriction, releaseDate, supportedLanguages, playerCount);
		this.extraHardware = extraHardware;
		this.hardwareRequirement = hardwareRequirement;
		this.environmentSize = environmentSize;
		this.environmentType = environmentType;
		this.isMultiplayer = isMultiplayer;
		VrGameCnt++;
	}

	

	public void setExtraHardware(boolean extraHardware) {
		this.extraHardware = extraHardware;
	}



	public void setHardwareRequirement(String hardwareRequirement) {
		this.hardwareRequirement = hardwareRequirement;
	}



	public void setEnvironmentSize(double environmentSize) {
		this.environmentSize = environmentSize;
	}



	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
	}



	public void setMultiplayer(boolean isMultiplayer) {
		this.isMultiplayer = isMultiplayer;
	}



	public static void setVrGameCnt(int vrGameCnt) {
		VrGameCnt = vrGameCnt;
	}



	public boolean isExtraHardware() {
		return extraHardware;
	}



	public String getHardwareRequirement() {
		return hardwareRequirement;
	}



	public double getEnvironmentSize() {
		return environmentSize;
	}



	public String getEnvironmentType() {
		return environmentType;
	}



	public boolean isMultiplayer() {
		return isMultiplayer;
	}



	public static int getVrGameCnt() {
		return VrGameCnt;
	}



	@Override
	public String toString() {
		return super.toString()+"\nVrGame \nextraHardware=" + extraHardware + "\n hardwareRequirement=" + hardwareRequirement
				+ "\n environmentSize=" + environmentSize + "\n environmentType=" + environmentType + "\n isMultiplayer="
				+ isMultiplayer + "\n";
	}
	
	public double calNewPrice(int i)
	{
		//This method will calculate price by weather the game using extra hardware and after it'll add on by using enviroment Type 
		//and need Environment Size (m2)
		
	 double newPrice = price;
		if(extraHardware)
			newPrice *= 1.5;
		if(environmentType.equalsIgnoreCase("Open World"))
			newPrice += environmentSize * 3;
		else if (environmentType.equalsIgnoreCase("One Room"))
			newPrice += environmentSize * 1.2;
		else 
			newPrice += environmentSize * 2;
		
		if(isMultiplayer)
			newPrice *=  1.25;
		
		return newPrice;
	}
	
	@Override
	public double calculatehardness() {
		//Hardness between 0-100
		int hardness = 0;
		
		if(isMultiplayer)
			hardness += 15;
		
		if(hardwareRequirement.equalsIgnoreCase("Joy Stick"))
			hardness +=5;
		else if(hardwareRequirement.equalsIgnoreCase("Treadmill"))
			hardness += 25;
		
		if(environmentType.equalsIgnoreCase("Open World"))
			hardness += 25;
		else if (environmentType.equalsIgnoreCase("One Room"))
			hardness += 10;
		
		if(minAgeRestriction > 18)
			hardness += 35;
		else if(minAgeRestriction > 14 && minAgeRestriction < 18 )
			hardness += 15;
		else if(minAgeRestriction > 8 && minAgeRestriction < 14)
			hardness += 5;
		
		
		return hardness ;
	}
	
	

}
