package DayOne2;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int n, reverse = 0;

	    System.out.println("Enter number to reverse : ");
	    Scanner scanner = new Scanner(System.in);
	    n = scanner.nextInt();

	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }
	    scanner.close();
	    System.out.println("Reversed number : " + reverse);
	  }

}
