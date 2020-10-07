package DayOne2;

import java.util.Scanner;

public class SumOfIndividualDigits {

	public static void main(String[] args) {
		int m, n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = scan.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
        scan.close();
	}

}
