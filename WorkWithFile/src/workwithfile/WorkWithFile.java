
package workwithfile;

public class WorkWithFile {

    public static void main(String[] args) {
        Writer w=new Writer();
        Reader r=new Reader();
        String str="Hello orld!!!";        
        w.WriteInFile(str);
        System.out.println("Text in file:\t"+r.ReadFromFile());
        Print print=new Print();
        print.WriteInFile();
        print.PrintInFile();
        
    }
    
}
