package collections;

public class Collections {

    public static void main(String[] args) {
        System.out.println("Array list operations");        
        ClassArrayList  arrayList=new ClassArrayList ();
        arrayList.ListOperation();
        System.out.println("Array deque operations");
        ClassArrayDeque arrayDeque=new ClassArrayDeque();
        arrayDeque.ArrayOperation();
        System.out.println("LinkeList operations");
        ClassLinkedList linkedList=new ClassLinkedList();
        linkedList.ArrayOperation();
        System.out.println("HashSet operations");
        ClassHashSet hashSet=new ClassHashSet();
        hashSet.ArrayOperation();
    }
    
}
