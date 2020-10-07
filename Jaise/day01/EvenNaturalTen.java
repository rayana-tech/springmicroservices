package DayOne2;

import java.util.Scanner;

public class EvenNaturalTen {

	public static void main(String[] args) {
		int num,i;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        num = scanner.nextInt();
		for(i = 1; i <= num; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i +"\t"); 
			}
		}
		scanner.close();
	}
}
