
package classexception;

public class Person {
    private String Name;
    private char Sex;
    private int Age;
    
    Person(String name, char sex,int age)throws AgeException{
        if(age<0)throw new AgeException("Error, not valid age/",age);
        else{
            this.Name=name;
            this.Sex=sex;
            this.Age=age;
        }
    }
    public String getName(){return this.Name;}
    public char getSex(){return this.Sex;}
    public int getAge(){return this.Age;}
    public void setName(String name){this.Name=name;}
    public void setSex(char sex){this.Sex=sex;}
    public void setAge(int age)throws AgeException{
        if(age<0)throw new AgeException("Error, not valid age",age);
        else this.Age=age;
    }
    
    public String Display(){
        return "Name "+this.Name+"\tSex "+this.Sex+"\tAAge "+this.Age;
    }
}
