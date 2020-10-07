package day1;

import java.util.Arrays;
import java.util.Scanner;  
public class LargestElement{  
	
public static int getLargest(int[] arr, int larg){  
Arrays.sort(arr);
      int largnum = arr.length-1;
return largnum;	  
}  
public static void main(String args[]){  
   Scanner sc = new Scanner(System.in); 
   System.out.print("Enter array size: ");
		int arr_size = sc.nextInt();
		int arr[]=new int [arr_size];
      System.out.println("largest element is ::"+getLargest(arr, arr_size));;  
}}  
