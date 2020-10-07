import java.util.Scanner;
 
public class NewPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int rows = sc.nextInt();
        int rowCount = 1;
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++)          
            {
                System.out.print(j+" ");
            }
            for (int j = rows-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
             
            System.out.println();
            rowCount++;
        }
    }
}