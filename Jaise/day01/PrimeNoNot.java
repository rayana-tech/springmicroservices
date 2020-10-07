package DayOne2;

import java.util.Scanner;

public class PrimeNoNot {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        scanner.close();
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
