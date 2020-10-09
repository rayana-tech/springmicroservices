import java.util.Scanner;

public class Ncr {
	double fact(double n)
		{
		   int i=1;
	             	    double fact=1;
		    while(i<=n)
		    {
		   	   fact=fact*i;
			   i++;
	 	    }
	  	      return fact;
		}
		double combination(int n,int r)
		{
			double com=fact(n)/(fact(n-r)*fact(r));
			return com;
		}
		public static void main(String arg[])	
		{
			Ncr p=new Ncr( );
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of n");
	               	int n=sc.nextInt();
			System.out.println("enter value of r");
	              		int r=sc.nextInt();
			if(n>=r)
			{
			
			System.out.println("The value of "+n+"c"+r+" is : "+p.combination(n,r));
			}
			else
			System.out.println("n value should be greater than or equals to r value");
			
		}	
	}