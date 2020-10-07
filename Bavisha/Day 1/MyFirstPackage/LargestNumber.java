package MyFirstPackage;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int i,number;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter Number of elements in an array : ");
		number = sc.nextInt();
		int [] Array = new int[number];
		System.out.print(" Please Enter " + number + " elements of an Array  : ");
		for (i = 0; i < number; i++) {
			Array[i] = sc.nextInt(); 
			} 
		int large = findLargestNumber(Array);
		System.out.println("number :"+large);
	}

	private static int findLargestNumber(int[] array) {
		int l = array.length;
		int max=array[0];
		 for (int i = 1; i < l; i++) 
             if (array[i] > max) 
                 max = array[i]; 
		return max;  
	
	}

}
