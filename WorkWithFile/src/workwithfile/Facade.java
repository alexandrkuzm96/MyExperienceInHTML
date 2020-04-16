
package workwithfile;

public class Facade {
    
    public void RunProgram(){
        FileOuutputInput writerReader=new FileOuutputInput();
        Print print=new Print();
        FileWriterReader fwr=new FileWriterReader();
        DataStream ds=new DataStream();
        BufferedStream bs=new BufferedStream();        
        ObjectStream os=new ObjectStream();
        System.out.print("Use file input/output stream\n");
        writerReader.WriteInFile();
        System.out.println("Text in file:\t"+writerReader.ReadFromFile());      
        System.out.print("Use print stream\n");
        print.WriteInFile();
        print.PrintInFile();
        System.out.print("Use buffered unput/output stream\n");
        bs.WriteInFile();
        System.out.println(bs.ReadFromFile());
        System.out.println("Use data output/input stream");
        ds.WriteInFile();
        System.out.println(ds.ReadFromFile());
        
        fwr.WriteInFile();
        System.out.println(fwr.ReadFromFile());
        
        os.WriteInFile();
            System.out.println(os.ReadFromFile());
    }
}
