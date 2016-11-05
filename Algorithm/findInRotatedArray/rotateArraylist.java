import java.util.*;

public class rotateArraylist {

    public ArrayList<Integer> rotateArray(ArrayList<Integer> ar) {
        int start;
        start = 0;
        int end;
        end = ar.size() - 1;
        swapInt sw = new swapInt();
        ar = sw.swapI(ar, start, end);
        start++;
        while(start != ar.size()-1) {
            if(ar.get(start) > ar.get(end))  {
                ar = sw.swapI(ar, start, end);
                start++;
            }
        }
        return ar;
    }

}
