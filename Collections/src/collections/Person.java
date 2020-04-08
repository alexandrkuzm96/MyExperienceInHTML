package collections;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    private static int count=1;
    public Person(String name, int age)throws Exception{
        if(age<0)throw new Exception("Такого возраста не бывает");
        else{
        this.age=age;
        this.name=name;
        this.id=count;
        count++;
        }
    }
    public int getID(){return id;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public void setName(String name){this.name=name;}
    public void setAge(int age)throws Exception{
        if(age<0)throw new Exception("Такого возраста не бывает");
        this.age=age;
    }
    public String display(){
        return "ID "+id+"\tName "+name+ "/tAge "+age;
    }
}
