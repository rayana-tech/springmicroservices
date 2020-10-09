package day4Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NIO2 {

	/*
	 * private static Map<String, String> Noi23; static { Noi23 = new HashMap<>();
	 * Noi23.put("file1", "manu 1"); Noi23.put("fale2", "manu 2");
	 * Noi23.put("fale3", "manu 3"); }
	 */ 
	 static Map<String, Date> getExpiredTablets(String filename, String manufacturer) throws IOException, ParseException {
		 Scanner sc= new Scanner(System.in);
		 //System.out.println("enter date ");
		// String date = sc.next();

		 String sDate1="31/12/1998";  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);  
		 List<Tablet> tablets = new ArrayList<Tablet>();
		
		 List<String> list = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
			list = br.lines().collect(Collectors.toList());
			// Tablet tabletvalue=new Tablet("Bcomplex", date2);
			 
			for(int i=0;i<list.size();i++) {
				String listdata =list.get(i);
				String[] datas=listdata.split(",");
				tablets.add(new Tablet(datas));
				System.out.println("tablet"+tablets);
			}
			list.forEach(System.out::println);
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		 
	 }

	public static void main(String[] args) throws IOException, ParseException {
			// TODO Auto-generated method stub
			
	        
	        Scanner sc= new Scanner(System.in);
	        String fileName = "D:\\Medicine2.txt";
	        System.out.println("enter manufacture name");
	        String manufacture = sc.nextLine();
	        Map<String, Date> map=getExpiredTablets(fileName,manufacture);
	        
		}
}
