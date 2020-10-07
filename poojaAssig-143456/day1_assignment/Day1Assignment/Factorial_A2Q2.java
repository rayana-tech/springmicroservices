package Day1Assignment;

import java.util.Scanner;

public class Factorial_A2Q2 {
	public static void findFact(int num) {
		int n=1;
	for(int i=1;i<=num;i++) {
		n=n*i;
				} 
	System.out.println("Factorial of a number is: "+n);
	
	int i,m=0,flag=0;      
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }//end of else  
	  }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the number:");
		 int num= sc.nextInt();
		 findFact(num);
		 
}
}