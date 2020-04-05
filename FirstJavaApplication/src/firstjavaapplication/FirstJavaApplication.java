package firstjavaapplication;

import java.util.Scanner;

public class FirstJavaApplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Cats [] cats=new Cats[2];
        try{        
        cats[0]= new Cats("Archy",1000);
        cats[1]=new Cats("Tomas",-2);
        for(int i=0;i<cats.length; i++){
            cats[i].Display();
        }
        }
        catch(Exception ex){
            System.out.print("Error!!!");
        }
        
    }
    
}

