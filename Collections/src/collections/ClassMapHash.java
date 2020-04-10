
package collections;

import java.util.HashMap;
import java.util.Map;

public class ClassMapHash {
    
    public void ArrayOperation(){
        Map<Integer,String> colors=new HashMap();
        colors.put(0,"red");
        colors.put(1, "orange");
        colors.putIfAbsent(2, "yellow");
        colors.putIfAbsent(3, "blue");
        for(String s:colors.values()){
            System.out.println(s);
        }
        Map<Integer,Employeers> emps=new HashMap();
        try {
            emps.put(0, new Employeers("Tom",34,"VTB"));
            emps.putIfAbsent(0, new Employeers("Bob",33,"Sber"));
            emps.putIfAbsent(1, new Employeers("Ada",29,"Sber"));
            emps.put(2, new Employeers("Louse",28,"Sber"));
            for(Employeers e:emps.values()){
            System.out.println(e.display());
            }
        emps.replace(1, new Employeers("Lisa",29,"VT"));
        System.out.println("Изменённый список");
        for(Employeers e:emps.values()){
            System.out.println(e.display());
            }
        } 
        catch (Exception ex) {
            System.out.println(ex.getCause());
        }

    }
}
