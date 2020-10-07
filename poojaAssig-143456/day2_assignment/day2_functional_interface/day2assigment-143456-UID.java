package Day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda {
	static List<String> countries = new ArrayList<String>();
	static Map<String, String> countryCapitals = new HashMap<String, String>();
	
	static {
		countries.add("India");
		countries.add("China");
		countries.add("US");
		countryCapitals.put("India","Delhi");
		countryCapitals.put("China","Beijing");
		countryCapitals.put("US","Waashington DC");
	}
static void displayCountries() {
	Consumer<String> lambdaExpression= x -> System.out.println(x.toLowerCase());
	countries.forEach(lambdaExpression);
	}
static void displayCountryCapitals() {
	BiConsumer<String, String> display= new MyBiConsumer();
	countryCapitals.forEach(display);
		
	}
static void sortCountriesByName() {
	Comparator<String> compareByName = (String s1, String s2) -> s1.compareTo(s2);
	Collections.sort(countries, compareByName.reversed());
	System.out.println("Sorted by countries name:");
	countries.forEach(System.out::println);
}
static void sortCountriesBylength() {
	Comparator<String> compareByNameLength = (String s1, String s2) -> s1.length() == s2.length()?0 : (s1.length()>s2.length()?1:-1);
	Collections.sort(countries, compareByNameLength);
	System.out.println("Sorted by countries length:");
	countries.forEach(System.out::println);	
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
	displayCountries();
	displayCountryCapitals();
	sortCountriesByName();
	removeCountry(countries);
}
}
class MyBiConsumer implements BiConsumer<String, String>{

	@Override
	public void accept(String cr, String crP) {
		System.out.println(cr +" -----> "+crP);
		
	}
	
}
