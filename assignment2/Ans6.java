package assignment2;

//  6. WAP showing try, multi-catch and finally blocks.

import java.io.File;
import java.io.IOException;

public class Ans6 {

    public static void main(String[] args) throws IOException {
        File file;
        try {
            file = new File(System.getProperty("user.home") + File.separator + "abc.txt");
            if(!file.exists())
                throw new IOException("File not found exception");
            else
                System.out.println("File found. No exceptions!");
        }catch (Exception e){
            System.out.println( e.getMessage());
        }finally {
            System.out.println("Program runs perfectly whether file is found or not");
        }
    }

}
