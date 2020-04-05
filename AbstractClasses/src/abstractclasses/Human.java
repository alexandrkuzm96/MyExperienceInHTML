
package abstractclasses;

public abstract class Human {
    private String Name;
    
    public Human(String name){
        this.Name=name;
    }
    public String GetName(){return this.Name;}
    public void SetNme(String name){this.Name=name;}
    abstract void Display();
    @Override
    public String toString(){return this.Name;}
}
