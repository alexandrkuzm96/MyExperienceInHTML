package sortalgoritmes;

public class BubbleSort implements ISort{

    @Override
    public StringBuilder sortMass(int []mass) {
        StringBuilder result=new StringBuilder("");
        int iter=0;
        for(int i=0;i<mass.length;i++){
            for(int j=i; j<mass.length; j++){
                if(mass[j]<mass[i]){
                    int min=mass[j];
                    mass[j]=mass[i];
                    mass[i]=min;
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
