import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class a {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input;
        int start;
        int end;
        int i = 0;
        int len;
        int count;
        String lowest;
        String highest;
        String temp;
        
        
        input = sc.next();
        len = sc.nextInt();
       
        lowest = input.substring(0,len);
        highest = lowest;
        
        for(int j=1; j<(input.length()-(len - 1)); j++) {
            
            temp = find_substring(input, j, j+len);
            // System.out.println(temp);
            for(int z=0; z<len; z++) {
                // System.out.println(j+"z: "+z);
                // System.out.println(j+"temp at z: "+temp.charAt(z));
                // System.out.println(j+"lowest at z: "+lowest.charAt(z));
                if((int)temp.charAt(z) < (int)lowest.charAt(z)) {
                    lowest = temp;
                    // System.out.println(j+"Lowest :"+lowest);
                    z = len+1;
                } 
                else if((int)temp.charAt(z) > (int)lowest.charAt(z)) {
                    z = len+1;
                }
            }
            for(int z=0; z<len; z++) {
                // System.out.println(j+"2 z: "+z);
                // System.out.println(j+"2 temp at z: "+temp.charAt(z));
                // System.out.println(j+"2 highest at z: "+highest.charAt(z));
                if((int)temp.charAt(z) > (int)highest.charAt(z)) {
                    highest = temp;
                    // System.out.println(j+"Highest :"+highest);
                    z = len+1;
                }
                else if((int)temp.charAt(z) < (int)highest.charAt(z)) {
                    z = len+1;
                }
            } 
        }
        
        printElement(lowest);
        printElement(highest);
    }
    
    public static String find_substring(String word, int start, int end) {
        String new_word;
        new_word = word.substring(start, end);
        return new_word;
    }
    
    public static void printElement(String word) {
        System.out.println(word);
    }
}
