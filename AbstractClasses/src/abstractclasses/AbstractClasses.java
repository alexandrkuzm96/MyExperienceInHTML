
package abstractclasses;

public class AbstractClasses {

    public static void main(String[] args) {
        Employee e=new Employee("Tom","VTB");
        Client c=new Client("BBob",1000);
        e.Display();
        c.Display();
        c.Add(100);
        c.Remove(200);
    }
    
}
