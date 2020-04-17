
package workwithfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedStream implements IReaderWriter {
    
    public void WriteInFile(){
        try(FileOutputStream fos=new FileOutputStream("notes2.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos)){
            String text="Lorem Lorem Lorem Lorem";
            bos.write(text.getBytes());
            System.out.println("Файл запсан. notes2.txt");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public StringBuilder ReadFromFile(){
        StringBuilder str=new StringBuilder("");
        try(FileInputStream fis=new FileInputStream("notes2.txt");
            BufferedInputStream bis=new BufferedInputStream(fis)){
            int ch;
            while((ch=bis.read())!=-1){
                str.append((char)ch);
            }
            return str;
        }
        catch(IOException ex){
            return str.append(ex.getMessage());
        }
    }
}