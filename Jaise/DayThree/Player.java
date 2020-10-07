package DayThree;

public class Player {

	private String playerName;
	private int matchesPlayed;
	private int runs;
	private int highScore;
	private Country coutry;
	public Player(String playerName, int matchesPlayed, int runs, int highScore, Country coutry) {
		super();
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runs = runs;
		this.highScore = highScore;
		this.coutry = coutry;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getHighScore() {
		return highScore;
	}
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public Country getCoutry() {
		return coutry;
	}
	public void setCoutry(Country coutry) {
		this.coutry = coutry;
	}


}
