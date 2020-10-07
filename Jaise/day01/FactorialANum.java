package DayOne2;

import java.util.Scanner;

public class FactorialANum {

	public static void main(String[] args) {
		int i,fact=1;
		System.out.println("Enter number : ");
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
		for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		  scanner.close();
	}

}
