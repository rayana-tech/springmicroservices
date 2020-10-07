package day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
public class LambdaFunction1 {
	private static List<String> contries;
	private static Map<String, String> map;
	static {
		contries = new ArrayList<>();
		contries.add("India");
		contries.add("Nepal");
		contries.add("Pakistan");
		contries.add("Japan");
		map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("Nepal", "Butan");
		map.put("Pakistan", "pakistan");
		map.put("Japan", "Tokyo");
	}
	public static void main(String[] args) {
		System.out.println("List of Country names are:::");
		contries.forEach(System.out::println);
		map.forEach(new MyBiConsumer());
		System.out.println("Conties and their capitals:::" + map);
		List<String> sortedCountries = contries.stream().sorted().collect(Collectors.toList());
		System.out.println("Country names in sorting order:::");
		sortedCountries.forEach(System.out::println);
		List<String> revsortedCountries = contries.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Country names in reverse sorting order:::");
		revsortedCountries.forEach(System.out::println);
		System.out.println("Remove the coutry name greater than length of 6 :::");
		List<String> removeCountry = contries.stream().filter(e -> e.length() < 6).collect(Collectors.toList());
		removeCountry.forEach(System.out::println);
	}
}
