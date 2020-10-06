package com.FunctionalInterface.Assignment1;

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
		countriesList.add("Andhra Pradesh");
		countriesList.add("Bihar");
		countriesList.add("Chhattisgarh");
		countriesList.add("Goa");
		countriesList.add("Gujarat");
		countriesList.add("Haryana");

		Map<String, String> countriesCapitals = new HashMap<String, String>();
		countriesCapitals.put("Chhattisgarh", "Atal Nagar");
		countriesCapitals.put("Andhra Pradesh", "Amravati");
		countriesCapitals.put("Bihar", "Patna");
		countriesCapitals.put("Goa", "Panaji");
		countriesCapitals.put("Gujarat", "Gandhinagar");
		countriesCapitals.put("Haryana", "Chandigarh");

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

		//removeCountry
	
		/*
		 #Method 1
		 for(int i =0;i<countriesList.size();i++) {
			System.out.println(i+" "+countriesList.get(i));
			if(countriesList.get(i).length() > 6) {
				list.add(i);				
			}
		}
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i = list.size()-1 ;i >= 0; i-- ) {
			System.out.println(list.get(i)+" position "+i );
			newlist.add(list.get(i));
		}
		System.out.println(newlist);

		newlist.forEach(item -> countriesList.remove(Integer.parseInt(item.toString())));
		System.out.println(countriesList);*/
		
		List<String> filtered = countriesList.stream()
                .filter(countryName -> countryName.length() < 6)
                .collect(Collectors.toList());
		System.out.println(filtered);
		
	}

}
