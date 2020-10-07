package DayOne;
import java.util.Scanner;

public class SeriesNTerms {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in); 
	     int n,i=1;
	     System.out.println("Enter the range to generate the first n terms in the series : ");
	     n=cs.nextInt();
	     while(i<=n)
	     {
	      System.out.print(i*i*i+" ");
	      i++;
	      }
	      cs.close();
	 }

}
