package pkgthrow;

public class Throw {

    public static void main(String[] args) {
    try{
        int result = getFactorial(-6);
         
        System.out.println(result);
    }
    catch(Exception ex){
         
        System.out.println(ex.getMessage());
    }
    }
    public static int getFactorial(int num) throws Exception
    {
        if(num<1)throw new Exception("Error");
        int result=1;
        for(int I=1;I<=num;I++){
            result*=I;
        }
        return result;
    }
}
