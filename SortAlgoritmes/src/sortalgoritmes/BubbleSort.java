package sortalgoritmes;

public class BubbleSort implements ISort{

    @Override
    public StringBuilder sortMass(int []mass) {
        StringBuilder result=new StringBuilder("");
        int iter=0;
        
        for(int i=0;i<mass.length;i++){
            for(int j=0; j<mass.length-1; j++){
                if(mass[j+1]<mass[j]){
                    int min=mass[j+1];
                    mass[j+1]=mass[j];
                    mass[j]=min;
                    iter++;
                }
            }
        }
        for(int i:mass){
            result.append(i+", ");
        }
        result.append("count iteraci: "+iter);
        return result;
    }
}
