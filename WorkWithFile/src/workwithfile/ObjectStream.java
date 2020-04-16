package workwithfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStream implements IReaderWriter{

    @Override
    public void WriteInFile() {
       try(ObjectOutputStream oos=new ObjectOutputStream
        (new FileOutputStream("notes6.dat")))
       {         
           ArrayList<Person>persons=new ArrayList();
           persons.add(new Person("Bob","Green",1990));
           persons.add(new Person("Tom","Brown",1990));
          oos.writeObject(persons);
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }

    @Override
    public String ReadFromFile() {
       try(ObjectInputStream ois=new ObjectInputStream(
       new FileInputStream("notes6.dat")))
       {
           ArrayList<Person>persons=new ArrayList();
           String str="";          
           persons=(ArrayList<Person>)ois.readObject();
           for(Person p:persons){
               str+=p.Display()+"\n";
           }
           return str;
       }
       catch(Exception ex){
           return ex.getMessage();
       }
    }
    
}
