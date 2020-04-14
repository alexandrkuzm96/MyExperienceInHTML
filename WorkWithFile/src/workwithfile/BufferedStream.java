
package workwithfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedStream {
    
    public void BufferedOutput(){
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
    public String BufferedInput(){
        String str="";
        try(FileInputStream fis=new FileInputStream("notes2.txt");
            BufferedInputStream bis=new BufferedInputStream(fis)){
            int ch;
            while((ch=bis.read())!=-1){
                str+=(char)ch;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return str;
    }
}