package DayOne2;

import java.util.Scanner;

public class NCR {
	
	static int nCr(int n, int r)   
	{   
	    return fact(n) / (fact(r) *fact(n - r));   
	}   
	static int fact(int n)   
	{   
	    int res = 1;   
	    for (int i = 2; i <= n; i++)   
	       res = res * i;   
	    return res;   
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;  
		System.out.println("Enter the value of n and r?");  
		Scanner scanner = new Scanner(System.in);  
		n = scanner.nextInt();  
		r = scanner.nextInt();  
		System.out.println("nCr = "+nCr(n, r));  
		scanner.close();
	}

}
