package firstjavaapplication;

public class Cats {
    private int id;
    private String Name;
    private int Age;
    private static int count=1;
    Cats(){
        Name="No name";
        Age=0;
        id=count;
        count++;
    }
    Cats(String name, int age ){
        this.Name=name;
        this.id=count;
        count++;
        try{
        if(age>0& age<100){
        this.Age=age;}
        else{
           throw new Exception("Error !!!");
           
        }
        }
        catch(Exception ex){
            System.out.println("Error !!!");
            
        }
        
    }
    public void Display(){
        System.out.println(this.Name+" "+this.Age+" count "+this.id);
    }
    
}
