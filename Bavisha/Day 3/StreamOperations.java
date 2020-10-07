package day3Assessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOperations {
	private static ArrayList<Player> playersList = new ArrayList<Player>();
	static void displayPlayers()
	{
		playersList.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void displayPlayersForCountry(String country)
	{
		List<Player> playernames=playersList.stream()
				.filter(player->(player.getRuns()>100 && player.getCountry()
						.getCountryName().equals(country))).collect(Collectors.toList());
	
		playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void getPlayerNames()
	{
		List<Player> playernames=playersList.stream().filter(Player->Player.getHighestScore()>5000).sorted(Comparator.comparing(Player::getPlayerName).reversed()).collect(Collectors.toList());
			
		playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void getAverageRuns(String country)
	{
		List<Player> playernames=playersList.stream().filter(player->(player.getCountry().getCountryName().equals(country))).collect(Collectors.toList());
	
		List<Integer> players=playernames.stream().map(player -> player.getRuns()).collect(Collectors.toList());		
		OptionalDouble average = players.stream().mapToInt(number -> number.intValue()).average();
		System.out.println("averageRuns="+average.getAsDouble());
	}
	static void getPlayerCountry()
	{
		HashMap<String,String> details=new HashMap<String,String>();
		playersList.stream().filter(Player->Player.getMatchesPlayed()>200).map(player->(details.put(player.getPlayerName(),player.getCountry().getCountryName()))).collect(Collectors.toList());
		details.forEach((i,j)->System.out.println(i+"   "+j));
	}
	static void getMaxRunsPlayer()
	{
		System.out.println(playersList.stream().max(Comparator.comparing(Player::getRuns)).get().getPlayerName());
	}
	static void findPlayer(String playername,String country)
	{
		List<Player> details=playersList.stream().filter(Player->Player.getPlayerName().equals(playername)&&Player.getCountry().getCountryName().equals(country)).collect(Collectors.toList());
		details.forEach(player->System.out.println(player));
	}
	static Boolean checkHighScorerByCountry(String country)
	{
		List<Player> details=playersList.stream().filter(Player->Player.getCountry().getCountryName().equals(country)&&Player.getHighestScore()>10000).collect(Collectors.toList());
		if(details.isEmpty())
			return false;
		else return true;
	}
	public static void main(String[] args) {
		
		playersList.add(new Player("ABCD", 170, 120, 3056, new Country(1001, "INDIA")));
		playersList.add(new Player("EFGH", 120, 157, 7246, new Country(1005, "PAKISTAN")));
		playersList.add(new Player("HIJK", 400, 200, 11000, new Country(1003, "INDIA")));
		displayPlayers();
		displayPlayersForCountry("INDIA");
		getPlayerNames();
		getAverageRuns("INDIA");
		getPlayerCountry();
		getMaxRunsPlayer();
		findPlayer("ABCD","INDIA");
		System.out.println(checkHighScorerByCountry("PAKISTAN"));
	}	
}
