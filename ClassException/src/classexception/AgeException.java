package classexception;

public class AgeException extends Exception {
    private int num;
    
    public AgeException(String message, int num){
     
        super(message);
        this.num=num;
    }
    public int getNum (){return this.num;}  
}
