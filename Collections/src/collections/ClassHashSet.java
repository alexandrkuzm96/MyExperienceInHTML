package collections;

import java.util.HashSet;

public class ClassHashSet {
    
    public void ArrayOperation(){
        HashSet<String> states=new HashSet<String> ();
        states.add("Russia");
        states.add("Germany");
        boolean b=states.add("England");
        System.out.println("States is aded England "+b);
        for(String s:states){
            System.out.println(s);
        }
    }
}
