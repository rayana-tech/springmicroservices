package Day1Assignment;
import java.util.Scanner;


public class findFact_A2Q13 {	
		public static void findFact(int num) {
			int n=1;
		for(int i=1;i<=num;i++) {
			n=n*i;
					} 
		System.out.println("Factorial of a number is: "+n);
		
		  
		  }
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			 System.out.print("Enter the number:");
			 int num= sc.nextInt();
			 findFact(num);
			 
	}
	}

