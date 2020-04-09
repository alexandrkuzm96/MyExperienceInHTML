package collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.NavigableSet;
public class ClassThreeSet {
    
    public void ArrayoPERATION (){
        TreeSet<String> states=new TreeSet();
        states.add("Great Britan");
        states.add("Italy");
        states.add("Russia");
        states.add("Avstralia");
        states.add("Germany");
        for(String s:states){
            System.out.println(s);
        }
        String lower=states.lower("Russia");
        System.out.println("Element lower Russia "+lower);
        String highter=states.higher("Russia;");
        System.out.println("Element highter Russia "+highter);
        NavigableSet<String> newSet= states.descendingSet();
        System.out.println("Descending list");
        for(String s:newSet){
            System.out.println(s);
        }
        try{
            Object cc=new NameComparator().thenComparing(new AgeComparator());
            TreeSet<Client> cl=new TreeSet((Comparator) cc); 
            cl.add(new Client("Tom",34,1000));
            cl.add(new Client("Ada",25,1200));
            cl.add(new Client("Ada",24,1200));
            for(Client c:cl)
            {
                System.out.println(c.display());
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
