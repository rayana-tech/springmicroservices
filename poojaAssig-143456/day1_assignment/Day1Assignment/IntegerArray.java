package Day1Assignment;

import java.util.Arrays;
import java.util.Scanner;

//1. Write a program to remove duplicate elements from the array of integers.
public class IntegerArray {
	static int length;
	public static int removeDupication(int arr[], int length) {
		if (length==0 || length==1) {
			return length;
		}
		int[] temp = new int[length];  
        int finalLength = 0;  
        for (int i=0; i<length-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[finalLength++] = arr[i];  
            }  
         }  
        temp[finalLength++] = arr[length-1];     
         
        for (int i=0; i<finalLength; i++){  
            arr[i] = temp[i];  
        }  
        return finalLength;  
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter no. of elements you want in array:");
		length = sc.nextInt();
	        int a[] = new int[length];
	        System.out.println("Enter all the elements in a sorted order:");
	        for(int i = 0; i < length; i++)
	        {
	            a[i] = sc.nextInt();	    
	        } 
	        int length = a.length; 
	        
	        length = removeDupication(a, length);  
	        //printing array elements after removing duplication 
	        for (int i=0; i<length; i++)  
	           System.out.print(a[i]+" ");  
	    }  
	}


