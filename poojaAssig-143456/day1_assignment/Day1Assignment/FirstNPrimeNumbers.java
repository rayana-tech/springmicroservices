package Day1Assignment;

import java.util.Scanner;

public class FirstNPrimeNumbers {
	public static void findNPrimeNumbers(int num) {
		int ct=0,n=0,i=1,j=1;  
		while(n<num)  
		{  
		j=1;  
		ct=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		ct++;  
		j++;   
		}  
		if(ct==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}  
		
	}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			 System.out.print("Enter the value of N:");
			 int num= sc.nextInt();
			 findNPrimeNumbers(num);
			
			
			
	}
}
