import java.util.*;

/*
    Author : Anitha Kandasamy
    Registration for a Event: 
        1. should be able to register a member to the event
        2. should be able to remove a member from the event
        3. at any point, should be able to give the k members in the order of registration
*/

class Register {
    
    LinkedHashMap<Integer,String> _registryMap = new LinkedHashMap<> ();

    public void add(int num, String name) {
       _registryMap.put(num, name);
    }

    public void remove(int num) {
       if(_registryMap.containsKey(num)) {
           _registryMap.remove(num);
           System.out.println("Details are removed for the given number");
       }
       else {
           System.out.println("Registration not found for "+num);
       }
    }

    public void getTopK(int k) {
    /*
    //Iterating through iterator
        Iterator<Integer> it = _registryMap.keySet().iterator();
        //Iterator<Integer> it = _registryMap.values().iterator();
        int count = 1;
        
        while(it.hasNext() && count <= k) {
            int key = (int) it.next();
            System.out.println(key+" , "+_registryMap.get(key));
            count++;
        }   
    */

    //Iterating through for each loop by using entrySet
    int count = 1;
    for(Map.Entry<Integer, String> entry : _registryMap.entrySet()) {
        if(count > k) {
           break; 
        }
        else {
            System.out.println(entry.getKey()+","+entry.getValue());
            count++;
        }
    }

    }
}

public class registrationProb {
    public static void main(String args[]) {
        Register obj = new Register();
        obj.add(1, "abc");
        obj.add(2, "def");
        obj.add(3, "ghi");
        obj.add(4, "jkl");
        obj.remove(2);
        obj.add(5, "gi");
        obj.add(2, "jl");

        obj.getTopK(5);
    }
}
