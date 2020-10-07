package day4Files;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("D:\\Medicine2.txt");
		int i=0;    
        while((i=fileInputStream.read())!=-1){    
         System.out.print((char)i);    
        }    
        fileInputStream.close();    
	}

}
