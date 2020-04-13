
package workwithfile;

import java.io.FileInputStream;

public class Reader {
    public String ReadFromFile(){
        String s="";
        try{
            FileInputStream fis=new FileInputStream("c://games//test.txt");
            int i=-1;
            while((i=fis.read())!=-1){
                s+=(char)i;
            }
            fis.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return s;
    }
}
