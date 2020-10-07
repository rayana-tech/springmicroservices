package Day1Assignment;

import java.util.Scanner;

public class CheckPalindrome {

		static int length;
		public static void checkPalindrome(int num) {
			int reversedInteger = 0, remainder, originalInteger;

	        originalInteger = num;

	        // reversed integer is stored in variable 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
	    }
				
		
		
		
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			 System.out.print("Enter the number");
			int num = sc.nextInt();
		         checkPalindrome( num); 		        
		    }  
	}


