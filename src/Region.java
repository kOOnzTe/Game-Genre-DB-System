
public class Region {
	
	private String name;
	private String Language;
	private String currency;
	
	public Region(String name, String language, String currency) {
		this.name = name;
		this.Language = language;
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "\n          Region Name=" + name + "\n          Language=" + Language + "\n          Currency=" + currency + "\n";
	}
	
	

}
