
package workwithfile;

public class WorkWithFile {

    public static void main(String[] args) {
        Writer w=new Writer();
        Reader r=new Reader();
        Print print=new Print();
        DataStream ds=new DataStream();
        BufferedStream bs=new BufferedStream();
        String str="Hello orld!!!";   
        System.out.print("Use file input/output stream\n");
        w.WriteInFile(str);
        System.out.println("Text in file:\t"+r.ReadFromFile());      
        System.out.print("Use print stream\n");
        print.WriteInFile();
        print.PrintInFile();
        System.out.print("Use buffered unput/output stream\n");
        bs.BufferedOutput();
        System.out.println(bs.BufferedInput());
        System.out.println("Use data output/input stream");
        ds.WriteInFile();
        System.out.println(ds.ReadFromFile());
        
    }
    
}
