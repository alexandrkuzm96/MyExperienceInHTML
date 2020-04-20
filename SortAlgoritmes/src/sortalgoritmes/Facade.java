
package sortalgoritmes;

/**
 *
 * @author Alexandr
 */
public class Facade {
    
    public void RunProgram(){
        int[] mass=new int[]{5,10,4,1,0,9,2,7,3,6,8};
        BubbleSort buble=new BubbleSort();
        ShakerSort shaker=new ShakerSort();
        System.out.println("Bubble sort\n"+buble.sortMass(mass));
        mass=new int[]{5,10,4,1,0,9,2,7,3,6,8};
        System.out.println("Shaker sort\n"+shaker.sortMass(mass));
    }
    
}
