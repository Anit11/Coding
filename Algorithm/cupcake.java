import java.io.*;
import java.util.*;

public class cupcake {
    public static void main(String args[]) {
        String[] str = {"10 2 5", "12 4 4", "6 2 2"};
        maximumCupcakes(str);
    }

    public static void maximumCupcakes(String[] list) {
        int list_size;
        list_size = list.length;

        for(int i=0; i<list_size; i++) {
            int cupcakes;
            int wrappers;
            int j = 0;
            
            String n = "";
            int ch = 0;
            int[] intArray = new int[3];

            while(j<3) {
                while(list[i].charAt(ch) != ' ') {
                    n = n+"list.charAt(ch)";
                    ch++;
                }
                intArray[j] = Integer.parseInt(n);
                j++;
            }

            cupcakes = intArray[0] / intArray[1];
            wrappers = cupcakes / intArray[2];
            boolean count = true;

            while(count) {
                if(wrappers < 1) {
                    System.out.println(cupcakes);
                    count = false;
                }
                else {
                    cupcakes = wrappers + cupcakes;
                    wrappers = wrappers/intArray[2];
                }
            }
        }
    }

}
