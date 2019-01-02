import java.util.*;

public class kDifference {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,5,3,4,2));
        int a = 2;

        int pair_counter = find_num_of_pairs(aList, a);

        System.out.println("The total number of pairs : "+pair_counter);
    }

    public static int find_num_of_pairs(ArrayList<Integer> list, int num) {
        
        HashMap<Integer, Integer> hmap = new HashMap<> ();
        int counter = 0;

        for(int i=0; i<list.size(); i++) {

            if(hmap.containsKey(list.get(i) + num)) {
                counter++;
            }

            if(hmap.containsKey(list.get(i) - num)) {
                counter++;
            }

            hmap.put(list.get(i), 1);
        }

        return counter;
    }
}
