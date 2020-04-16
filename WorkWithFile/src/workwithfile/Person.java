package workwithfile;

import java.io.Serializable;

public class Person implements Serializable{
    private String Name;
    private String LustName;
    private transient int BournYear;
    private int Age;
    
    public Person(String name,String lastName,int bournYear)throws Exception
    {
        if(bournYear<=0|bournYear>=(2020-14)){
            throw new Exception("Недопустимый год рождения");
        }
        else{
            this.Name=name;
            this.LustName=lastName;
            this.BournYear=bournYear;
            this.Age=2020-bournYear;
        }
    }
    
    public String GetName(){return this.Name;}
    public String GetLastName(){return this.LustName;}
    public int GetBournYear(){return this.BournYear;}
    public int GetAge(){return this.Age;}
    
    public String Display(){
        return "Name:\t"+this.Name+"\nLastname:\t"+this.LustName+"\nAge:\t"+this.Age;
    }
}
