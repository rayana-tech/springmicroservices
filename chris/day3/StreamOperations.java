package day3;
import day3.Country;
import day3.Player;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void displayPlayers(ArrayList<Player>playersList){
		playersList.stream()
		 .forEach(players -> System.out.println(players.getPlayerName()));
		}


		public static ArrayList<String> displayPlayersForCountry(ArrayList<Player>playersList){
		ArrayList<String> displayPlayerList=(ArrayList<String>) playersList.stream()  
		                             .filter(player-> player.getHighestScore() >100 )
									 .map(player-> player.getCountry())
									 .collect(Collectors.toList());
									 return(displayPlayerList);
									 
		                    
		}

		public static  List<Player> PlayerNames(ArrayList<Player>playersList){
		 
		List<Player>revLis=
				playersList.stream()
				.filter(Player->Player
						.getHighestScore()>5000)
				.sorted(Comparator.comparing(Player::getPlayerName).reversed())
				.collect(Collectors.toList());
		
											 

		        return (revLis);


		}

		public static void averageRunsByCountry (ArrayList<Player>playersList) {
			List<Integer> avg=playersList.stream().map(player -> player.getRuns()).collect(Collectors.toList());
		
			OptionalDouble averageRuns = avg.stream().mapToInt(number -> number.intValue()).average();
		System.out.print(averageRuns);
		}
		  


		public static ArrayList<String>  playerNamesSorted(ArrayList<Player>playersList){
		ArrayList<String> nameSorted =           
		                              (ArrayList<String>) playersList.stream()  
		 .sorted(Comparator.comparing(Player::getCountry)
				 .reversed()
		 .thenComparing(Comparator.comparing(Player::getMatchesPlayed).reversed()));
									  
		            
		return(nameSorted);

		}

		 public static  void getPlayerCountry(ArrayList<Player>playersList){

		                                
		 playersList.stream()
		 .filter(players->players.matchesPlayed>200)
		 .parallel()
		      .map(player-> player.getCountry())
			  .forEach(System.out::println);
			
		 
		 }
		 
		 
		 public static void getMaxRunsPlayer(ArrayList<Player>playersList){
		 
		  System.out.println(playersList.stream().max(Comparator.comparing(Player::getRuns)).get().getPlayerName());
		 
		 }
		 

		public static void main(String args[]){

		ArrayList<Player>playersList=  new ArrayList<Player>();

		Player p1 = new Player("andrew",112,1000,1120,"Rajasthan");
		Player p2 = new Player("sachin",105,1510,100,"India");
		Player p3 = new Player("dhoni",206,2000,15000,"India");
		Player p4 = new Player("viratkohli",208,5060,100,"canada");
		Player p5 = new Player("rohith",19,2590,10060,"Australia");
		
		playersList.add(p1);
		playersList.add(p2);
		playersList.add(p3);
		playersList.add(p4);
		playersList.add(p5);
		
		ArrayList<Country>countryList=  new ArrayList<Country>();
		
		Country c1=new Country("1","India");
		Country c2=new Country("2","Rajasthan");
		Country c3=new Country("3","canada");
		Country c4=new Country("4","Australia");
		
		
		countryList.add(c1);
		countryList.add(c2);
		countryList.add(c3);
		countryList.add(c4);

		

		StreamOperations s=new StreamOperations();
		s.displayPlayers(playersList);
		s.PlayerNames(playersList);
		s.displayPlayersForCountry(playersList);
		s.averageRunsByCountry(playersList);
		s.playerNamesSorted(playersList);
		s.getPlayerCountry(playersList);
		s.getMaxRunsPlayer(playersList);
		
		 Predicate<Player> p11 = player->player.getHighestScore()>10000;

	
		boolean highScoredPlayer = playersList.stream().anyMatch(p11);
		      System.out.println(highScoredPlayer);
}


		

}














