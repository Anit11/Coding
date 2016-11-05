import java.io.*;
import java.util.*;

public class findNumber {
    public boolean findNum(ArrayList<Integer> ar, int num) {
        int start;
        int mid;
        int end;

        start = 0;
        end = ar.size()-1;
        mid = ar.size()/2;

        while(true) {
            diff_1 = Math.abs(ar.get(start) - num);
            diff_2 = Math.abs(ar.get(mid) - num);
            diff_3 = Math.abs(ar.get(end) - num);

            if(
        }
    }
}
