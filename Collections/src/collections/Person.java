package collections;

public class Person {
    private String Name;
    private int Age;
    
    public Person(String name, int age) throws Exception{
        if(age<0) throw new Exception("Age is not valid "+age);
        this.Age=age;
        this.Name=name;
    }
    public String getName(){return this.Name;}
    public void setName(String name){this.Name=name;}
    public int getAge(){return this.Age;}
    public void setAge(int age)throws Exception{
        if(age<0) throw new Exception("Age is not valid "+age);
    }
    public String Display(){
        return "Name "+this.Name+"\tAge "+this.Age;
    }
}
