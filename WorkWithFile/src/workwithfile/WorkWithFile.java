
package workwithfile;

public class WorkWithFile {

    public static void main(String[] args) {
        Writer w=new Writer();
        Reader o=new Reader();
        String s=o.ReadFromFile();
        System.out.println(s);
        w.WriteInFile(s);
        
    }
    
}
