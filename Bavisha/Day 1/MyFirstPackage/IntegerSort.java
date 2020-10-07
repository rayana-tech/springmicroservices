package MyFirstPackage;

import java.util.Scanner;

public class IntegerSort {

	public static void main(String[] args) {
int temp;
        Scanner scan = new Scanner(System.in);
    
        int num[] = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < 10 - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[10 - 1]);
    }

}
