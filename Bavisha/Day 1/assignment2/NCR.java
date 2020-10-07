package assignment2;

import java.util.Scanner;

public class NCR {

	public static void main(String[] args) {
		int n,r;  
		System.out.println("Enter the value of n and r?");  
		Scanner sc = new Scanner(System.in);  
		n = sc.nextInt();  
		r = sc.nextInt();  
		System.out.println("nCr = "+nCr(n, r));  
		}

	private static int nCr(int n, int r) {
		 return fact(n) / (fact(r) *   
				    fact(n - r)); 
	}

	private static int fact(int n) {
		int res = 1;   
        for (int i = 2; i <= n; i++)   
        res = res * i;   
       return res;  
	}   

}
