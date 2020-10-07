package Day1Assignment;

import java.util.Scanner;

public class findNcR_A2Q14 {
	public static void findNcr(int n, int r) {
		int factn=1,factr=1,factd=1, factfin=0;
	for(int i=1;i<=n;i++) {
		factn=factn*i;		
				} 
	for(int i=1;i<=r;i++) {
		factr=factr*i;		
				} 
	for(int i=1;i<=(n-r);i++) {
		factd=factd*i;		
				} 
	factfin=factn/(factr*factd);
	System.out.println("ncr of number: "+n+", "+r+" is:"+factfin);
	  }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the number n :");
		 int n= sc.nextInt();
		 System.out.print("Enter the number r :");
		 int r= sc.nextInt();
		 findNcr(n,r);
		 
}

}
