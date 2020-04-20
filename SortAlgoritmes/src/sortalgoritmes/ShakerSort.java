
package sortalgoritmes;

public class ShakerSort implements ISort {

    @Override
    public StringBuilder sortMass(int[] mass) {
        
        StringBuilder result=new StringBuilder();
        int iter=0;
        int begin=0;
        int end=mass.length-1;
        while(end>begin){
            for(int i=0;i<end;i++){
                if(mass[i]>mass[i+1]){
                    int max=mass[i];
                    mass[i]=mass[i+1];
                    mass[i+1]=max;
                    iter+=100;                    
                }
            }
            end--;
            for(int j=end;j>begin;j--){
                if(mass[j]<mass[j-1]){
                    int max=mass[j-1];
                    mass[j-1]=mass[j];
                    mass[j]=max;
                    iter++;
                }
            }
            begin++;
        }
      
        for(int i:mass){
            result.append(i+", ");
        }
        result.append("Count of iteraci: "+iter);
        return result;
    }
    
}
