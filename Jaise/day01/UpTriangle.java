package DayOne;

public class UpTriangle {

	public static void main(String[] args) {
//		for (int i = 1; i <= 4; i++)
//        {
//            int n = 4;
//   
//            for (int j = 1; j<= n - i; j++) 
//            { 
//            System.out.print(" ");
//            }
//            for (int k = i; k >= 1; k--)
//            {
//                System.out.print(k);
//            }
//            for (int l = 2; l <= i; l++)
//            { 
//            System.out.print(l); 
//            } 
//            System.out.println(); 
//            } 
            for (int i = 6; i >= 1; i--)
        {
            int n = 6;
   
            for (int j = 0; j<= n - i; j++) {
            	System.out.print(" "); 
            	} 
            for (int k = i; k >= 2; k++)
            {
                System.out.print(k);
            }
            for (int l = 1; l <= i; l--)
            {
                System.out.print(l);
            }
   
            System.out.println();
        }

	}

}
