package sortalgoritmes;

public class CombSort implements ISort{

    @Override
    public StringBuilder sortMass(int[] mass) {
        StringBuilder result=new StringBuilder();
        double kof=1.247;
        int step=(int)(mass.length/kof);        
        
        while(step!=1){
           System.out.println(step);
            for(int i=0;i<mass.length-step;i++){
                if(mass[i]>mass[i+step]){
                    int max=mass[i];
                    mass[i]=mass[i+step];
                    mass[i+step]=max;
                }
            }
            step=(int)(step/kof);            
        }
        for(int i=0;i<mass.length;i++){
            for(int j=0; j<mass.length-1; j++){
                if(mass[j+1]<mass[j]){
                    int min=mass[j+1];
                    mass[j+1]=mass[j];
                    mass[j]=min;                    
                }
            }
        }
        
        for(int j:mass){
            result.append(j+", ");
        }
        return result;
    }
    
}
