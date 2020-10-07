package DayOne2;

import java.util.Scanner;

public class NumBtwRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int high,low;
        System.out.println("Enter the lowest number: ");
        low = scanner.nextInt();
        System.out.println("Enter the highest number: ");
        high = scanner.nextInt();
        while( high >= low )
        {
            System.out.println(low );
            low++;
            if(low==high)
            	break;
        }
        scanner.close();
	}
}
