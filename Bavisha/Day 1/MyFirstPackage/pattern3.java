package MyFirstPackage;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 

        System.out.println("Enter the rows:");

 

        int Rows = sc.nextInt();

 

        int rowCount = 1;

 

        System.out.println("Output :");

 

        for (int i = Rows; i >= 1; i--) {

 

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

 

            for (int j = i; j <= Rows; j++) {
                System.out.print(j + " ");
            }

 

            for (int j = Rows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

 

            System.out.println();

 

            rowCount++;
        }
	}

}
