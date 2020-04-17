package workwithfile;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectStream implements IReaderWriter{

    @Override
    public void WriteInFile() {
       try(ObjectOutputStream oos=new ObjectOutputStream
        (new FileOutputStream("notes6.dat")))
       {         
           Console con= System.console();
           Scanner sc=new Scanner(System.in);
           System.out.print("Сколько человек вы хотите доьавить?\n Введите число ");
           int n=sc.nextInt();
           ArrayList<Person>persons=new ArrayList();
           for(int i=0;i<n;i++){
               String name=con.readLine("Введите имч: ");
               con.printf("Введите фамилию ");
               String lastName=con.readLine();
               con.printf("Введите год рождения ");
               int year=sc.nextInt();
               persons.add(new Person(name,lastName,year));
           }            
           
          oos.writeObject(persons);
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }

    @Override
    public StringBuilder ReadFromFile() {
        StringBuilder str=new StringBuilder("");
       try(ObjectInputStream ois=new ObjectInputStream(
       new FileInputStream("notes6.dat")))
       {
           ArrayList<Person>persons=new ArrayList();                    
           persons=(ArrayList<Person>)ois.readObject();
           for(Person p:persons){
               str.append(p.Display()+"\n");
           }
           return str;
       }
       catch(Exception ex){
           return str.append(ex.getMessage());
       }
    }
    
}
