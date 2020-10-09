package assignment2;

import java.util.Scanner;

public class NumToDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		String num = sc.nextLine();
		System.out.println();
		printWord(num);
	}

	private static void printWord(String num) {
		{ 
	        int i, length =num.length(); 
	      
	        
	        for (i = 0; i < length; i++) 
	        { 
	            printValue(num.charAt(i)); 
	        } 
		
	}
			

}

	private static void printValue(char digit) {
		   switch (digit) 
	        { 
	      
	        // For digit 0 
	        case '0': 
	            System.out.print("Zero "); 
	            break; 
	      
	        // For digit 1 
	        case '1': 
	            System.out.print("One "); 
	            break; 
	      
	        // For digit 2 
	        case '2': 
	            System.out.print("Two "); 
	            break; 
	      
	        // For digit 3 
	        case '3': 
	            System.out.print("Three "); 
	            break; 
	      
	        // For digit 4 
	        case '4': 
	            System.out.print("Four "); 
	            break; 
	      
	        // For digit 5 
	        case '5': 
	            System.out.print("Five "); 
	            break; 
	      
	        // For digit 6 
	        case '6': 
	            System.out.print("Six "); 
	            break; 
	      
	        // For digit 7 
	        case '7': 
	            System.out.print("Seven "); 
	            break; 
	      
	        // For digit 8 
	        case '8': 
	            System.out.print("Eight "); 
	            break; 
	      
	        // For digit 9 
	        case '9': 
	            System.out.print("Nine "); 
	            break; 
	        } 
		
	}
}