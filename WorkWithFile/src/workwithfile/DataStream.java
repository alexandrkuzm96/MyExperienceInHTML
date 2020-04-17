
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
    public StringBuilder ReadFromFile(){
        StringBuilder str=new StringBuilder("");
        try(DataInputStream dis=new DataInputStream(new FileInputStream("notes3.txt"))){
            int ch;            
            while((ch=dis.read())!=-1){
                str.append((char)ch);
            }
            return str;
        }
        catch(Exception ex){
            return str.append(ex.getMessage());
        }
    }
}
