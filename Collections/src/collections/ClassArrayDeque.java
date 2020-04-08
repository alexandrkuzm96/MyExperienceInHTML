package collections;

import java.util.ArrayDeque;

public class ClassArrayDeque {
    
    public void ArrayOperation(){
        ArrayDeque<String> array1=new ArrayDeque();
        ArrayDeque<String> array2=new ArrayDeque();
        ArrayDeque<Client> persons=new ArrayDeque();
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
            persons.addFirst(new Client("Tom",34,10000));
            Client p=new Client("Bob",22,1000);
            persons.add(p);
            for(Client cl:persons){
                System.out.println(cl.display());
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
