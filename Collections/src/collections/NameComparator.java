package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Client>{

    @Override
    public int compare(Client a, Client b) {
        return a.getName().compareTo(b.getName());
    }    
}
