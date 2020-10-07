package day1;

import java.util.Scanner;
public class PrimeRange {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();	
 boolean flag = false;
 int j=2;
 for(j=2;j<100;j++){

        if (j%num==0)
		 System.out.println(num + " is not a prime number.");
          
        else
            System.out.println(num + " is a prime number."); ;
    }
}
}