package day1;

import java.util.Scanner;
class CountChar { 
static void getChar(String str) 
    { 
        int len = str.length(); 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int count = 0; 
            for (int j = 0; j <= i; j++) { 
                if (str.charAt(i) == ch[j])  
                    count++;                 
            } 
            if (count == 1)  
                System.out.println(+ str.charAt(i) + " .............." + count);             
        } 
    } 
public static void main(String[] args) 
{ 
    Scanner sc = new Scanner(System.in); 
    String str = "hello world"; 
    getChar(str); 
} 
} 