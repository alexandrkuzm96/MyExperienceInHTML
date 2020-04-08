package collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Client>{

    @Override
    public int compare(Client a, Client b) {
        return a.getAge()-b.getAge();
    }
    
}
