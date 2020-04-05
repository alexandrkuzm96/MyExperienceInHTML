package classexception;

public class ClassException {

    public static void main(String[] args) {
        RunProgram();
    }
    public static void RunProgram(){
        try{
            Person tom=new Person("Tom",'m',-24);
            Person bob=new Person("Bob",'m',2);
            System.out.println( tom.Display());
            System.out.println( bob.Display());
            bob.setAge(25);
            System.out.println( tom.Display());
            System.out.println( bob.Display());
        }
        catch(AgeException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNum());
            
        }
        
    }
}
