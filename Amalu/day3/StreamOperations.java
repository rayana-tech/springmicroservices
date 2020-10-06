package Assignemnet1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
//import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Country{
	private Integer countryID;
	private String countryName;
	public Country(Integer countryID, String countryName) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		
	}
	public Integer getCountryID() {
		return countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	@Override
	public String toString() {
		return "Country [countryID=" + countryID + ", countryName=" + countryName + "]";
	}
	
	
}

class Player {
	private String playerName;
	private Integer matchesPlayed;
	private Integer runs;
	private Integer highestscore;
	private Country country;
	
	public Player(String playerName, Integer matchesPlayed, Integer runs, Integer highestscore, Country country) {
		super();
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runs = runs;
		this.highestscore = highestscore;
		this.country = country;
	}
	public String getPlayerName() {
		return playerName;
	}
	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}
	public Integer getRuns() {
		return runs;
	}
	public Integer getHighestscore() {
		return highestscore;
	}
	public Country getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
				+ ", highestscore=" + highestscore + ", country=" + country + "]";
	}
	
	
	
	
}

public class StreamOperations {

	private static ArrayList<Player> playerList = new ArrayList<Player>();
	static void displayPlayers()
	{
	playerList.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void displayPlayersForCountry(String country)
	{
	List<Player> playernames=playerList.stream().filter(player->(player.getRuns()>100 && player.getCountry().getCountryName().equals(country))).collect(Collectors.toList());
	
	playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	
	static void getPlayerNames()
	{
	List<Player> playernames=playerList.stream().filter(Player->Player.getHighestscore()>5000).sorted(Comparator.comparing(Player::getPlayerName).reversed()).collect(Collectors.toList());
			
	playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void getAverageRuns(String country)
	{
	List<Player> playernames=playerList.stream().filter(player->(player.getCountry().getCountryName().equals(country))).collect(Collectors.toList());
	
	List<Integer> playernames1=playernames.stream().map(player -> player.getRuns()).collect(Collectors.toList());		
	
	//playernames1.forEach(p->System.out.println(p));
	OptionalDouble average = playernames1.stream().mapToInt(number -> number.intValue()).average();
	System.out.println("average="+average.getAsDouble());
	}
	/*static void getPlayerNameSorted()
	{
		List<Player> playernames=playerList.stream().sorted(Comparator.comparing(Country::getCountryName).collect(Collectors.toList());

	}*/
	static void getPlayerCountry()
	{
		HashMap<String,String> details=new HashMap<String,String>();
	playerList.stream().filter(Player->Player.getMatchesPlayed()>200).map(player->(details.put(player.getPlayerName(),player.getCountry().getCountryName()))).collect(Collectors.toList());
	details.forEach((i,j)->System.out.println(i+"   "+j));
	}
	static void getMaxRunsPlayer()
	{
		System.out.println(playerList.stream().max(Comparator.comparing(Player::getRuns)).get().getPlayerName());
	}
	static void findPlayer(String playername,String country)
	{
		List<Player> details=playerList.stream().filter(Player->Player.getPlayerName().equals(playername)&&Player.getCountry().getCountryName().equals(country)).collect(Collectors.toList());
		details.forEach(player->System.out.println(player));
	}
	static Boolean checkHighScorerByCountry(String country)
	{
		List<Player> details=playerList.stream().filter(Player->Player.getCountry().getCountryName().equals(country)&&Player.getHighestscore()>10000).collect(Collectors.toList());
		if(details.isEmpty())
			return false;
		else return true;
	}
	public static void main(String[] args) {
		
		
		playerList.add(new Player("kohli", 240, 100, 5000, new Country(1001, "INDIA")));
		playerList.add(new Player("xyz", 100, 150, 6000, new Country(1005, "AUSTRALIA")));
		playerList.add(new Player("cde", 400, 200, 15000, new Country(1003, "INDIA")));
		
		displayPlayers();
		displayPlayersForCountry("INDIA");
		
		getPlayerNames();
		getAverageRuns("INDIA");
		getPlayerCountry();
		getMaxRunsPlayer();
		findPlayer("kohli","INDIA");
		System.out.println(checkHighScorerByCountry("Australia"));
	}

}
