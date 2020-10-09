import java.util.Scanner;

public class Numbers7 {
	public static void main(String[] args)
    {
        int startNum;
        int endNum;
       System.out.println("Enter starting number...");
       Scanner scanner = new Scanner(System.in);
       startNum = scanner.nextInt();
        System.out.println("Enter Ending number...");
        endNum =  scanner.nextInt();
        for(int i = startNum; i <endNum; i++)
        {
                 System.out.println(i);
        }
    }
}
