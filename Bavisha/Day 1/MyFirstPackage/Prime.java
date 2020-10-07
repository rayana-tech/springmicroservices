package MyFirstPackage;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter Number : ");
		number = sc.nextInt();
		checkPrimeOrNot(number);
		

	}

	private static void checkPrimeOrNot(int number) {
		int arr[] = new int[number];
		int i, j, flag;  
	    System.out.println("Prime numbers between 1 and " 
	                                      + number + " are:");  
	  
	    for (i = 1; i <= number; i++)  
	    {  
	        if (i == 1 || i == 0)  
	            continue;  
	        flag = 1;  
	  
	        for (j = 2; j <= i / 2; ++j)  
	        {  
	            if (i % j == 0) 
	            {  
	                flag = 0;  
	                break;  
	            }  
	        }  
	        if (flag == 1)  
	            System.out.print(i + " ");  
	    }  
	}

}
