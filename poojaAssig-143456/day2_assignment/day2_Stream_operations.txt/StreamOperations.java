package com.apps.day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamOperations {
	
	static void getPlayersByCountry(List<Player> players,String country) {
		List<Player> playernames= players.stream().filter(player->(player.getRuns()>100 && player.getCoutry().getCountryName().equals(country))).collect(Collectors.toList());
		playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	static void getPlayersNamesDesc(List<Player> players) {
		List<Player> playernames= players.stream().filter(c -> c.getRuns() > 5000).sorted(Comparator.comparing(Player::getPlayerName).reversed()).collect(Collectors.toList());
		playernames.forEach(player->System.out.println(player.getPlayerName()));
	}
	private static OptionalDouble getAverageRunsByCountry(List<Player> players) {
		
		return players.stream().mapToInt(Player::getRuns).average();
				}
	private static Player getMaxRunsPlayer(List<Player> players) {
		return players.stream().max(Comparator.comparingInt(Player::getRuns)).get();
		
	}
	private static boolean checkHighScoreOrnot(List<Player> players) {
		 Predicate<Player> p2 = p -> p.getRuns() > 10000;
		return players.stream().anyMatch(p2);
		
	}
	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		Player pl = new Player("sachin", 10000, 20500, 205, new Country("Ind1001", "India"));
		Player p2 = new Player("rohit", 8000, 3500, 77, new Country("Ind1001", "India"));
		Player p3 = new Player("Gilchrist", 6000, 17000, 175, new Country("Aus1002", "Australia"));
		Player p4 = new Player("Ponting", 2045, 21045, 98, new Country("Aus1002", "Australia"));
		players.add(pl);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		
		
		System.out.println("List of players are:::");
		players.forEach(player->System.out.println(player.getPlayerName()));
		System.out.println("Players who has height score is more than 100:::");
		getPlayersByCountry(players,"India");
		System.out.println("Players who has total score more than 5000  score:::");
		getPlayersNamesDesc(players);
		OptionalDouble opDouble=getAverageRunsByCountry(players);
		  System.out.println("Avg runs by players:::"
                  + opDouble.getAsDouble()); 
		 
		 List<String> players3 = players.stream().map(p -> p.getPlayerName()).sorted().collect(Collectors.toList());
		 List<Integer> players4 = players.stream().map(p -> p.getHighScore()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println("Player names in sorted order:::");
		 players3.forEach(System.out::println);
		 System.out.println("Player scores in reverse order:::");
		 players4.forEach(System.out::println);
		 
		 Player player5 = getMaxRunsPlayer(players);
		 String str = player5.getPlayerName();
		 System.out.println("Player who has max runs :::"+ str); 
		 
		 boolean player6 = checkHighScoreOrnot(players);
		 System.out.println("Player who has scored more than 10000 runs:::"+ player6); 
		
			}
	
	
	
	
}