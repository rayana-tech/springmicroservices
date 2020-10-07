package DayOne;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		  int limit;
	      int status = 1;
	      int num = 3;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the limit:");
	      limit = scanner.nextInt();
	      if (limit >= 1)
	      {
	         System.out.println("First "+limit+" prime numbers are:");
	         //2 is a known prime number
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=limit ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }
	      scanner.close();
	}

}
