package day2;
import java.util.Map;

import day3.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
class Lambda{
	  
	public static List<String> countries;
    public static Map<String, String> countryCapitals;
    static{
    countries = new ArrayList<String>();
        countries.add("Australia");
        countries.add("Canada");
        countries.add("New Zealand");
       
        countryCapitals=new HashMap<String, String>();
        
 countryCapitals.put("Australia","Canberra");
 countryCapitals.put("Canada","Ottawa");
 countryCapitals.put("Newzealand","Wellington");
 }
 public  static void displayCountries(){
	 countries.forEach(country-> System.out.println(countries));
 
 }
 public static void CountryCapitals(){
 
	 countryCapitals.forEach((k,v) -> System.out.println("Country: "+ k + ", Capital: " + v)); 
	 
 }
 public static void sortCountryByName(){
 Comparator<String> compareByName = (String s1, String s2) -> s1.compareTo(s2);
	Collections.sort(countries, compareByName.reversed());
	countries.forEach(System.out::println);
 }
 public static void sortCountryByLength(){
System.out.println("-- sorting list of string --");
        Collections.sort(countries, Comparator.comparing(String::length));
        countries.forEach(System.out::println);
 }
public static void removeByLength(){
 for(String c: countries){
        if(c.length() >6){ 
        	countries.remove(c);
        }
    
    	}
System.out.print(countries);
}
 
 public static void main(String args[]) {
Lambda l=new Lambda();
l.displayCountries();
l.CountryCapitals();
l.sortCountryByName();
l.sortCountryByLength();
l.removeByLength();
 }

 }