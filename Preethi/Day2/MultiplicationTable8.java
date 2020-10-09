import java.util.Scanner;

public class MultiplicationTable8 {
	public static void main(String[] args) {
	       int num;
	       System.out.println("Enter number...");
	       Scanner scanner = new Scanner(System.in);
	       num = scanner.nextInt();
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	        }
	    }
}
