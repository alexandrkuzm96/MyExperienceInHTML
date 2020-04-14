package workwithfile;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Print {
    
    public void WriteInFile(){
        try(FileOutputStream fos=new FileOutputStream("test.txt");
                PrintStream p=new PrintStream(fos);)
        {
            String text="Name:\tTom\nAge\t29";
            p.println(text);
            System.out.println("Файл записан. te1st.txt");
        }
        catch(Exception ex)
        {System.out.println(ex.getMessage());}
    }
    public void PrintInFile(){
       try(PrintStream print =new PrintStream("notes.txt"))
       {
           print.print("Hello");
           print.print(" welcome to programm\n");
           print.printf("Name:\t%s\nAge:\t%d \n","Bob",34);
           System.out.println("Файл записан. notex.txt");
       }
       catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
       
    }
}
