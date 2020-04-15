
package workwithfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream implements IReaderWriter{
    
    public void WriteInFile(){
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("notes3.txt"))){
            dos.writeUTF("message\n lorem\n");
            dos.writeUTF("1000");
            System.out.println("Файл запмсан. notes3.txt");
        }
        catch(Exception ex){
            System.out.printf(ex.getMessage());
        }
    }
    public String ReadFromFile(){
        try(DataInputStream dis=new DataInputStream(new FileInputStream("notes3.txt"))){
            int ch;
            String str="";
            while((ch=dis.read())!=-1){
                str+=(char)ch;
            }
            return str;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
}
