package day4Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileDirectory {

	public static void main(String[] args) throws IOException {
		System.out.println("all files");
		List<String> fileList=getAllFiles();
		listAllFilesEndWithJava(fileList);
		Scanner sc= new Scanner(System.in);
        System.out.println("enter file name");
        String filetName = sc.nextLine();
        System.out.println("enter file path");
        String filepath = sc.nextLine();
		SearchFile(filetName,filepath);
	}

	//create a method which takes two String parameters. The first parameter is the filename to be searched and the second parameter is the	absolute path of the directory to be searched.
	private static void SearchFile(String filetName, String filepath) throws IOException {
		Path start = Paths.get(filepath);
		try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
		    List<String> collect = stream
		        .map(String::valueOf)
		        .sorted()
		        .collect(Collectors.toList());
		    List<String> searchedFiles = collect.stream().filter(s->s.contains(filetName)).collect(Collectors.toList());
		    searchedFiles.forEach(System.out::println);
		}catch(Exception e) {
			System.out.println("some error occured");
		}
		
	}
	
//create a method to list all the files ending with .java in the current project's src folder and its subfolders
	private static void listAllFilesEndWithJava(List<String> fileList) {
		List<String> files = fileList.stream().filter(s->s.contains(".java")).collect(Collectors.toList());
	    System.out.println("java file");
	    files.forEach(System.out::println);
		
	}

	private static List<String> getAllFiles() throws IOException {
		List<String> collect=new ArrayList<String>();
		Path start = Paths.get("C:\\Users\\u62723\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\MyJavaProject\\src");
		try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
		     collect = stream
		        .map(String::valueOf)
		        .sorted()
		        .collect(Collectors.toList());
		    collect.forEach(System.out::println);
		    
		}
		return collect;
	}

}
