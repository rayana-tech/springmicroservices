package com.StreamOperations.Assignments;

public class Player {
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
				+ ", highestScore=" + highestScore + ", country=" + country + "]";
	}

	private String playerName;
	private int matchesPlayed;
	private double runs;
	private int highestScore;
	
	Country country;

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

	public double getRuns() {
		return runs;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setRuns(double runs) {
		this.runs = runs;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	
}
