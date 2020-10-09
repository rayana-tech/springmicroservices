package Assignmentday2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalInterface {
public static void main(String[] args) {
		
		List<String> countriesList = new ArrayList<String>();
		countriesList.add("India");
		countriesList.add("America");
		countriesList.add("Australia");
		countriesList.add("malaysia");
		
        Map<String, String> countriesCapitals = new HashMap<String, String>();
        countriesCapitals.put("India", "Delhi");
		countriesCapitals.put("America", "Washington");
		countriesCapitals.put("Australia", "Canberra");
		countriesCapitals.put("malaysia", "Kuala Lumpur");
		

		//display Countries using FOREACH
		countriesList.forEach(System.out::println);
		
		//display countryCapitals using FOREACH
		countriesCapitals.forEach((key,value) -> System.out.println("Key is " +key+" and the value is "+value));
		
		//sortCountriesByName
		Comparator<String> compareByName = (String s1, String s2) -> s1.compareTo(s2);
		Collections.sort(countriesList, compareByName.reversed());
		countriesList.forEach(System.out::println);
		
		//sortCountriesBylength
		Comparator<String> compareByNameLength = (String s1, String s2) -> s1.length() == s2.length()?0 : (s1.length()>s2.length()?1:-1);
		Collections.sort(countriesList, compareByNameLength);
		countriesList.forEach(System.out::println);
		
		System.out.println(countriesList);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> newlist = new ArrayList<Integer>();

		
		List<String> filtered = countriesList.stream()
                .filter(countryName -> countryName.length() < 6)
                .collect(Collectors.toList());
		System.out.println(filtered);
		
	}


}



