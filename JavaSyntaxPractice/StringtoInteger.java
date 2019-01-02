import java.util.*;

public class StringtoInteger {
    public static void main(String args[]) {
        String my_string = "...25...10..84.";
        //String my_string = "25.10.84";

        // TODO:
        // string delimString = "., $!";
        // string str = "...hel.lo  wo!$rl,,du  ";
        // Output: {"hel", "lo", "wo", "rl", "du"};
        char delim = '.';
        String[] string_array = splitString(my_string, delim);

        /*        for(int i=0; i<string_array.length; i++) {
                  System.out.println(string_array[i]); 
                  } */
        int[] int_array = convert_string(string_array);

        int count = 0;
        for(int i=0; i<int_array.length; i++) {
            System.out.println(int_array[i]); 
            count += int_array[i];
        }

        System.out.println("Total of above numbers are "+count);
    }

    private static String[] splitString(String inp_string, char my_delim) {

        String[] string_array = new String[3]; 
        int start;
        int k;
        start = 0;
        k = 0;

        for(int end=0; end<inp_string.length(); end++) {

            if(inp_string.charAt(end) ==  my_delim) {
                string_array[k] = inp_string.substring(start, end);
                k++;
                if(inp_string.charAt(++end) != my_delim) {
                    start = end;
                }
            }
            else if(end == inp_string.length()-1) {
                string_array[k] = inp_string.substring(start, end+1);
            }
        }

        return string_array;
    }

    private static int[] convert_string(String[] str_array) {

        int[] int_array = new int[3];

        for(int i=0; i<str_array.length; i++) {
            int_array[i] = Integer.parseInt(str_array[i]);
        }

        return int_array;
    }
}


