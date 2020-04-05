package collections;

import java.util.ArrayDeque;

public class ClassArrayDeque {
    
    public void ArrayOperation(){
        ArrayDeque<String> array1=new ArrayDeque<String>();
        ArrayDeque<String> array2=new ArrayDeque<String>();
        ArrayDeque<Person> persons=new ArrayDeque<Person>();
        try{
            array1.add("Orange");
            array1.addFirst("Red");
            array1.add("Blue");
            array2.addFirst("Yellow");
            array2.add("Green");
            array1.addAll(array2);
            array1.push("grey");
            for(String s : array1){
                System.out.println(s);
            }
            while(array1.peek()!=null){
                System.out.println(array1.pop());
            }
            persons.addFirst(new Person("Tom",34));
            Person p=new Person("Bob",22);
            persons.push(p);
            for(Person per:persons){
                System.out.println(per.Display());
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
