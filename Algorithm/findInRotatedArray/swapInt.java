import java.util.*;

public class swapInt {
    public ArrayList<Integer> swapI(ArrayList<Integer> ar, int a, int b) {
    int temp;
    temp = ar.get(a);
    ar.set(a, ar.get(b));
    ar.set(b, temp);

    return ar;
    }
}
