import java.io.*;
import java.util.*;

public class a {
    public static void main(String args[]) {
        String s = "2-4A0r7-4k";
        String res = groupString(s, 3);
        System.out.println(res);
    }

    public static String groupString(String input, int groupSize) {
        char[] charResult;

        String dashRemoved = removeDash(input);

        String result = getResultString(dashRemoved, groupSize);
        result = result.toUpperCase();
        return result;
    }

    public static String removeDash(String input) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) != '-') {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String getResultString(String input, int groupSize) {

        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1, j=0; i>=0; i--) {

            if(j==groupSize) {
                if(i!=0) {
                    sb.append('-');
                    j = 0;
                    i++;
                }
            }
            else
            {
                sb.append(input.charAt(i));
                j++;
            }
        }

        sb.reverse();
        return sb.toString();
    }

}




