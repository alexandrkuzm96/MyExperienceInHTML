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
    public StringBuilder ReadFromFile(){
        StringBuilder text=new StringBuilder("");
        try(FileInputStream fis=new FileInputStream("c://games//test2.txt"))
        {            
            int ch;
            while((ch=fis.read())!=-1){
                text.append((char)ch);
            }
            return text;
        }
        catch (Exception ex){
            return text.append(ex.getMessage());
        }
}
}

