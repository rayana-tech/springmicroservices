package MyFirstPackage;

import java.util.Scanner;

public class CharacterCout {
	 static final int maxchar = 256;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		 charCount(str);
	}

	private static void charCount(String str) {
		int count[] = new int[maxchar]; 
		  
        int len = str.length(); 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int countval = 0; 
            for (int j = 0; j <= i; j++) { 
                if (str.charAt(i) == ch[j])  
                	countval++;                 
            } 
            if (countval == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
	}

}
