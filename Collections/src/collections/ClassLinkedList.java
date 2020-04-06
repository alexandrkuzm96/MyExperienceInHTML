package collections;

import java.util.LinkedList;

public class ClassLinkedList {
    public void ArrayOperation(){
        LinkedList<String> array1=new LinkedList<String>();
        LinkedList<String> array2=new LinkedList<String>();
        array1.add("Moscov");
        array1.addFirst("Vladimir");
        array1.add(1, "Rostov");
        System.out.println("Array 1 is empty "+array1.isEmpty());
        System.out.println("Indexs of Rostov "+array1.indexOf("Rostov"));
        
        array2.offer("Gus");
        array2.offerFirst("Ekarelinburg");
        array1.addAll(1, array2);
        System.out.println("array1 contains array2 "+array1.containsAll(array2));
                
        for(String s: array1){
            System.out.println(s);
        }
    }
    
}
