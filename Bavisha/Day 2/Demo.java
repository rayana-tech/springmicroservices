package day2Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	
	 
	private static final List<String> Countries = new ArrayList<>();
	private static final Map<String, String> countryCapitals = new HashMap<>();
	
	static void displayCountries() {
		Countries.forEach(System.out::println);
	}
	static void displayCountryCapitals() {
		System.out.println("Countries and Capitals");
		 System.out.println(""); 
		 
		countryCapitals.forEach((k,v) -> System.out.println(k + " ," + v));
        
	}
	static void sortCountriesByName() {
			Comparator c = Collections.reverseOrder();
	      Collections.sort(Countries,c);
		 //Collections.sort(Countries, Collections.reverseOrder());
		 System.out.println("sorted Country names");
		 System.out.println("");
		 
		 Countries.forEach(System.out::println);
	}
	static void sortCountriesBylength() {
		 System.out.println("sorted Country legth");
		 System.out.println("");
		Countries.sort(Comparator.comparingInt(String::length).reversed());
		Countries.forEach(System.out::println);
	}
	static void removeCountry() {
		int l=Countries.size();
	     System.out.println( "The size of the ArrayList is: " + l);
	     System.out.println("");
	       
	     for (int i = 0; i <Countries.size(); i++)
	         {
	         if (Countries.get(i).length() > 6)
	                 {
	        	 		Countries.remove(i);
	                 }
	       
	         }
	     System.out.println("removed countries nmae greater than 6 character "+Countries);
	}
	static {
		Countries.add("INDIA");
		Countries.add("AUSTRALIA");
		Countries.add("BAHRIN");
		countryCapitals.put("INDIA", "NEW DELHI");
		countryCapitals.put("AUSTRALIA", "CANBERRA");
		countryCapitals.put("BAHRIN", "MANAMA");
	}
	
	public static void main(String[] args) 
	{
			 displayCountries();
			 displayCountryCapitals();
			 sortCountriesByName();
			 sortCountriesBylength();
			 removeCountry();
			}
}
