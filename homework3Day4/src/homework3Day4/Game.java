package homework3Day4;

public class Game {
	private int id;
	private String gameCode;
	private String gameName;
	private String softwareCompany;
	private int gamePrice;

	public Game() {
		
	}
	
	public Game(int id, String gameCode, String gameName, String softwareCompany, int gamePrice) {
		this.id = id;
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.softwareCompany = softwareCompany;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getSoftwareCompany() {
		return softwareCompany;
	}

	public void setSoftwareCompany(String softwareCompany) {
		this.softwareCompany = softwareCompany;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
}
