package Day1Assignment;

import java.util.Scanner;

public class CountCharacters {
	static final int MAX_CHAR = 256; 
	public static void countChar(String str) {
		int count[] = new int[MAX_CHAR]; 
		  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int matchCount = 0; 
            for (int j = 0; j <= i; j++) { 
                if (str.charAt(i) == ch[j])  
                	matchCount++;                 
            } 
  
            if (matchCount == 1)  
                System.out.println(str.charAt(i) + " is:" + count[str.charAt(i)]);  
        }
        } 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the String:");
		 String str= sc.nextLine();
		 System.out.println(str);
		 String noSpaceStr = str.replaceAll("\\s", "");
		 System.out.println(noSpaceStr);
		 countChar(noSpaceStr);
		
}
}
