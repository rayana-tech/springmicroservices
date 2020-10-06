package Assignemnet1;

public class Program4 {

	public static void main(String[] args) {
		 int sum=0,temp,reminder;  
		    int number=153;//It is the number to check armstrong  
		    temp=number;  
		    while(number>0)  
		    {  
		    reminder=number%10;  
		    number=number/10;  
		    sum=sum+(reminder*reminder*reminder);  
		    }  
		    if(temp==sum)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }	}


