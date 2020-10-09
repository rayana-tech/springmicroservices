package MyFirstPackage;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

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
	        Arrays.sort(Array);//sorting array  
	        int length = Array.length;  
	        length = removeDuplicateElements(Array, length);  
	        //printing array elements  
	        for (int j=0; j<length; j++)  
	           System.out.print(Array[j]+" ");    
	}
	private static int removeDuplicateElements(int arr[], int n) {
		 if (n==0 || n==1) 
	            return n; 
	       
	        int[] temp = new int[n]; 
	        int j = 0; 
	        for (int i=0; i<n-1; i++) 
	            if (arr[i] != arr[i+1])    
	               
					temp[j++] = arr[i]; 
	        temp[j++] = arr[n-1];    
	        for (int i=0; i<j; i++) 
	            arr[i] = temp[i]; 
	       
	        return j; 
		
	}

}
