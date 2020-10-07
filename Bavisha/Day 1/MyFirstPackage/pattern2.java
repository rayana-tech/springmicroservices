package MyFirstPackage;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 

        System.out.println("Enter the rows :");

 

        int Rows = sc.nextInt();

 

        int rowCount = Rows;

 

        System.out.println("Output :");

 

        for (int i = 0; i < Rows; i++) {

 

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

 

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

 

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

 

            System.out.println();

 

            rowCount--;
        }
	}

}
