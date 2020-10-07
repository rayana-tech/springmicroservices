package Day1Assignment;

import java.util.Scanner;

public class LargestNumber {
	static int length;
	public static int findLargestNum(int arr[], int l) {
		int temp;  
		for (int i = 0; i < l; i++)   
		        {  
		            for (int j = i + 1; j < l; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[l-1];  		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter no. of elements you want in array:");
		length = sc.nextInt();
	        int a[] = new int[length];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < length; i++)
	        {
	            a[i] = sc.nextInt();	    
	        } 
	        
	       int largestNum= findLargestNum(a, length); 
	       System.out.println(largestNum);
	        
	    }  
}
