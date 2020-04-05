package collections;

import java.util.ArrayList;
public class ClassArrayList {
    
    public void ListOperation(){
        ArrayList<String> persons=new ArrayList<String> ();
        ArrayList<String> test=new ArrayList<String> ();
        persons.add("Tom");
        persons.add("Alex");
        test.add("Nick");
        test.add("Lara");
        persons.addAll(1, test);
        for(String s:persons){
            System.out.println(s);
        }
    }
}
