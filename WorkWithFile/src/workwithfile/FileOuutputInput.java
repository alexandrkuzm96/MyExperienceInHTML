package workwithfile;

import java.io.*;

public class FileOuutputInput implements IReaderWriter{
    
    public void WriteInFile(){
        try (FileOutputStream fos=new FileOutputStream("C://games//test2.txt"))
        {              
            String text="Hello World";
           fos.write(text.getBytes());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
    }
    public String ReadFromFile(){
        String text="";
        try(FileInputStream fis=new FileInputStream("c://games//test2.txt"))
        {            
            int i=-1;
            while((i=fis.read())!=-1){
                text+=(char)i;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return text;
}
}

