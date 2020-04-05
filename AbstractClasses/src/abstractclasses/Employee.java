package abstractclasses;

public class Employee extends Human{
    private String company;
    public Employee(String name, String company) {
        super(name);
        this.company=company;
    }

    @Override
    void Display() {
       System.out.println("Name "+GetName()+"\tWork in "+this.company);
    }
    
}
