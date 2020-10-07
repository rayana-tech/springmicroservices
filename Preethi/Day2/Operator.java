
import java.util.Scanner;

public class Operator {
	public static void sumOfDigits(int n) {
		int a=0;
		int sum=0;
		
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    sum=sum+a;  
		    }  	
		   
		        System.out.println(sum); 
		        if((sum/10)!=0) {
		    	while(sum/10 >0) {
		    		a=sum%10;  
				    sum=sum/10;  
				    sum=sum+a; 
		    	}
		    	System.out.println(sum); 
		    }
		    	
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the number:");
		 int num= sc.nextInt();
		 sumOfDigits(num);
		
}

}