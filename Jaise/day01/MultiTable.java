package DayOne2;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
		
		for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
		scanner.close();
	}

}
