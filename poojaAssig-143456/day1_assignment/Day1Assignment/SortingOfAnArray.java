package Day1Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfAnArray {
	static int length;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		 
	        int a[] = new int[10];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < 10; i++)
	        {
	            a[i] = sc.nextInt();	    
	        } 
	        Arrays.sort(a); 
	        for(int i = 0; i < 10; i++)
	        {
	        	 System.out.print(a[i]+" ");	    
	        } 
	    }  
}
