package workwithfile;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReader implements IReaderWriter {
    
    public void WriteInFile(){
        try(FileWriter fw=new FileWriter("notes4.txt"))
        {
            fw.write("Lrem Lorem\n");
            fw.write("1000");
            fw.append("\n");
            fw.write("2000");
            fw.flush();
            System.out.println("Файл записан. notes4.txt");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public String ReadFromFile() {
       try(FileReader fr=new FileReader("notes4.txt")){
           String str="";
           int ch;
           while((ch=fr.read())!=-1){
               str+=(char)ch;
           }
           return str;
       }
       catch(Exception ex)
       {
           return ex.getMessage();
       }
    }
}
