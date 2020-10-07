package day4Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
        System.out.println("enter file name");
        String filetName = sc.nextLine();
        System.out.println("enter file path");
        String filepath = sc.nextLine();
        findFileWithNameAndPath(filetName,filepath);

	}

	private static void findFileWithNameAndPath(String filetName, String filepath) throws IOException {
		Path start = Paths.get(filepath);
		try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
		    List<String> collect = stream
		        .map(String::valueOf)
		        .sorted()
		        .collect(Collectors.toList());
		    List<String> filename = collect.stream().filter(s->s.contains(filetName)).collect(Collectors.toList());
		    filename.forEach(System.out::println);
		}
		
	}

}
