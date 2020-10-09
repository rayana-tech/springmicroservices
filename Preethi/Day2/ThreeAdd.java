import java.util.Scanner;

public class ThreeAdd {
	public static boolean findFact(int num) {
		int a=1;
	for(int i=1;i<=num;i++) {
		a=a*i;
				} 
	System.out.println("Factorial of a number is: "+a);
	
	if(a%2==0)
return false;    
    for(int i=3;i<=Math.sqrt(a);i+=2) { 
        if(a%i==0) 
return false;    } 
return true;	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the number:");
		 int num= sc.nextInt();
		 boolean flag=findFact(num);
		 if(flag)
			 System.out.println("prime number");
		 else
			 System.out.println("not a prime number");


}
}
