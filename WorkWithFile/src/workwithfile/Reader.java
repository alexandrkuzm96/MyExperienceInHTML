
package workwithfile;

import java.io.FileInputStream;

public class Reader {
    public String ReadFromFile(){
        String text="";
        try(FileInputStream fis=new FileInputStream("c://games//test2.txt"))
        {            
            int i=-1;
            while((i=fis.read())!=-1){
                text+=(char)i;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return text;
    }
}
