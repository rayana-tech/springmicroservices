package com.training.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambda {
	
	public static List<String> countries;
    public static Map<String, String> countryCapitals;
    static{
    countries = new ArrayList<String>();
        countries.add("Australia");
        countries.add("Canada");
        countries.add("India");
        countries.add("Japan");
        countries.add("New Zealand");
       
        countryCapitals=new HashMap<String, String>();
        countryCapitals.put("Australia", "Canberra");
        countryCapitals.put("Canada", "Ottowa");
        countryCapitals.put("India", "Delhi");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("New Zealand", "Auckland");
}
    public static void displayCountries(){
        countries.forEach(cont-> System.out.println(cont));
                        }
    public static void displayCountryCapitals() {
        countryCapitals.forEach((cont,capt) -> System.out.println(cont+ " -- "+capt));}
   
    public static void sortCountriesByName() {
        Collections.sort(countries);
        Collections.reverse(countries);
        countries.forEach(cont-> System.out.println(cont));
       
}
    public static void removeCountry( List<String> counttemp) {
    ArrayList<String> mylist = new ArrayList<String>();
   
    for(String con:counttemp)
    {
    if(con.length()>6)
    mylist.add(con);
   
   
    }
    for(String con:mylist)
    {
    countries.remove(con);
    }
        countries.forEach(cont-> System.out.println(cont));
    }

public static void main(String[] args) {
System.out.println("List Of countries : ");
displayCountries();
System.out.println("List Of countries with Capital : ");
displayCountryCapitals();
System.out.println("Reverse sorting by Name : ");
sortCountriesByName();
System.out.println("Removed Country");
removeCountry(countries);

}

}


