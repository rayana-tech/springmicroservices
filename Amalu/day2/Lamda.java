package Assignemnet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lamda {
	
	public static List<String> countries;
    public static Map<String, String> countryCapitals;
    static{
    	countries = new ArrayList<String>();
        countries.add("Australia");
        countries.add("Saudi Arabia");
        countries.add("Italy");
        countries.add("Austria");
        
        countryCapitals=new HashMap<String, String>();
        countryCapitals.put("Australia", "Canberra");
        countryCapitals.put("Saudi Arabia", "Riyad");
        countryCapitals.put("Italy", "Rome");
        countryCapitals.put("Austria", "Vienna");
}
    public static void displayCountries(){
        countries.forEach(cont-> System.out.println(cont));
                        }
    public static void displayCountryCapitals() {
        countryCapitals.forEach((cont,capt) -> System.out.println(cont+ " "+capt));}
    
    public static void sortCountriesByName() {
        Collections.sort(countries);
        Collections.reverse(countries);
        countries.forEach(cont-> System.out.println("Countries "+cont));
        
}
    public static void removeCountry( List<String> counttemp) {
        
       /* countries.forEach(s ->{ 
                        
                        if(s.length() > 6) {
                                        
                                        countries.remove(s);
                        }
        });*/
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
        countries.forEach(cont-> System.out.println("Countries "+cont));
    }




	public static void main(String[] args) {
		displayCountries();
		displayCountryCapitals();
		sortCountriesByName();
		System.out.println("removed");
		removeCountry(countries);
		

	}

}
