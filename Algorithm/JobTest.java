import java.io.*;
import java.util.*;

public class JobTest {
    public static void main(String args[]) {
       String input = "10101";
       int result = find_count(input);
       System.out.println("The answer is "+result);
    }

    public static int find_count(String input) {
        
        boolean zero_bool = false;
        boolean one_bool = false;
        int zero_count = 0;
        int one_count = 0;
        int answer = 0;

        for(int i=0; i<input.length(); i++) {
            
            if(input.charAt(i) == '0') {
               if(zero_bool == true) {
                   zero_count++;
                   if(one_count - zero_count >= 0) {
                        answer++;
                   }
               }
               else {
                   zero_bool = true;
                   one_bool = false;
                   //resetting zero_count to 1
                   zero_count = 1;
                   if(one_count - zero_count >= 0) {
                       answer++;
                   }
              }
            }
            else if(input.charAt(i) == '1') {
                if(one_bool == true) {
                   one_count++;
                   if(zero_count - one_count >= 0) {
                        answer++;
                   }
               }
               else {
                   one_bool = true;
                   zero_bool = false;
                   //resetting one_count to 1
                   one_count = 1;
                   if(zero_count - one_count >= 0) {
                       answer++;
                   }
              }
           }
        }
        return answer;
    }
}
