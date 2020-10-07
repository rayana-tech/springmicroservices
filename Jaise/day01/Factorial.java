package DayOne2;

import java.util.Scanner;

public class Factorial {
	
	static void printFactorialNums(int n) 
    { 
        int fact = 1; 
        int x = 2; 
        while (fact <= n) 
        {             
            if (isPrime(fact)) {  
                System.out.println(fact + " is a prime number");  
            } else {  
                System.out.println(fact + " is not a prime number");  
            } 
            
            fact = fact * x; 
            x++; 
        } 
    } 
	
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        printFactorialNums(number); 

	}

}
