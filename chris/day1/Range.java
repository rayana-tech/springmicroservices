package day1;

import java.util.Scanner;

public class Range {
    
	  public static void main(String[] args)
	    {     
	    int i,n;
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			 n = sc.nextInt();
			System.out.print("Enter the range: ");
			int range = sc.nextInt();
		System.out.println ("The  numbers between 10 to 100 are:\n");
		for (i=n+1;i<range;i++)
		{      
			System.out.println (i);
		}
	}
	}
