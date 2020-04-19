
package sortalgoritmes;

/**
 *
 * @author Alexandr
 */
public class Facade {
    
    public void RunProgram(){
        int[] mass=new int[]{5,10,4,1,0,9,2,7,3,6,8};
        BubbleSort buble=new BubbleSort();
        System.out.println(buble.sortMass(mass));
    }
    
}
