package Day1Assignment;

import java.util.Scanner;

public class CheckArmstrongNum {
	static int temp;
	public static void checkIfArmstrongNum(int n) {
		int a=0;
		int c=0;
		 temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");  
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the 3 digit number:");
		 int num= sc.nextInt();
		 checkIfArmstrongNum(num);
		
}
}
