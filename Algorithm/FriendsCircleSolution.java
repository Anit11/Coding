import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class solution {

    public static void main(String[] args) {
        
        int tot;
        int answer;
        String temp; 
        int j = 0; 
        Scanner sc = new Scanner(System.in);
        tot = sc.nextInt();
        char[][] inp = new char[tot][tot];
        for(int i=0; i<tot; i++) {
                temp = sc.next();
                while(j != tot){
                    inp[i][j] = temp.charAt(j);
                    j++;
                }
            j=0;
        }
        answer = friends(inp, tot);     
        System.out.println(answer); 
    }
    
    public static int friends(char[][] input, int tot) {
       
        Integer[] num = new Integer[tot];
        Arrays.fill(num, 1);
        for(int a=0; a<tot; a++) {
            for(int b=1; b<tot; b++) { 
             if(a!=b) {
                char ch = Character.toUpperCase(input[a][b]);
                if((ch == 'Y')) {
                    if(num[a] == num[b]) {
                        if(num[a] != 0) {
                            num[b]--; 
                        }
                    }
                    else if(num[a] > num[b]) {
                        if(a>b) {
                            num[a]--;
                        }
                    }
                    else if(num[a] < num[b]) {
                        if(b>a) {
                           num[b]--; 
                           }
                    }
            }
        }
    }
    }
        int count = 0;
        for(int i=0; i<tot; i++) {
//            System.out.println(num[i]);
            if(num[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
