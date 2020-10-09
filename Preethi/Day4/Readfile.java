package FileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
 
public class Readfile {
 
    public static void main(String[] args) throws IOException {
         String[] iF = new String[] { "C:\\Users\\smile\\Download\\Date_Time.txt" };
            String oF = "C:\\Users\\smile\\Download\\NIO2.txt";
            FileOutputStream output = new FileOutputStream(new File(oF));
            WritableByteChannel outputChannel = output.getChannel();
            for (int j = 0; j < iF.length; j++) {
 
                FileInputStream input = new FileInputStream(iF[j]);
                FileChannel inputChannel = input.getChannel();
                inputChannel.transferTo(0, inputChannel.size(), outputChannel);
                inputChannel.close();
                input.close();
            }
            outputChannel.close();
            output.close();

    }
}

