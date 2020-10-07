package day1;

import java.util.Scanner;
class Factorial{  
public static void main(String args[]){  
int i,f=1,j=2;  
  Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int n = sc.nextInt();
for(i=1;i<=n;i++){    
   f=f*i;    
}    
System.out.println("Factorial of "+n+" is: "+f);    
int num=f;
boolean flag = false;
while(j <= num/2)
     {
         if(num % j == 0)
         {
             flag = true;
             break;
         }

         ++j;
     }

     if (!flag)
         System.out.println(num + " is a prime number.");
     else
         System.out.println(num + " is not a prime number.");
 }
}