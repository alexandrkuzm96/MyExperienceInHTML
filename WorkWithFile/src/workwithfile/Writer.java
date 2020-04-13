package workwithfile;

import java.io.*;

public class Writer {
    
    public void WriteInFile(String text){
        try (FileOutputStream fos=new FileOutputStream("C://games//test2.txt"))
        {                                
           fos.write(text.getBytes());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        }
    }
