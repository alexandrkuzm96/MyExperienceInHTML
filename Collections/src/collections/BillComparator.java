
package collections;

import java.util.Comparator;

public class BillComparator implements Comparator<Client>{

    @Override
    public int compare(Client a, Client b) {
        return (int)(a.getBill()-b.getBill());
    }
    
}
