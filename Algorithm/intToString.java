import java.util.*;

public class intToString {
    public static void main(String[] args) {
       int num = 12345; 
       intToString obj = new intToString();
       String s = obj.convert(num);
       System.out.println(s);
    }
    
    //e.g: 12345
    String convert(int num) {
        String result = ""; 
        boolean negative = false;

        if(num < 0) {
          negative = true; 
          num = -num;
        }

        while(num!=0) {
            int n = num % 10;
            char chr = (char)(1);
            System.out.println("chr:"+chr);
            System.out.println("Stringchr:"+String.valueOf('0'));
            num = num / 10;
            char ch = (char) (n + '0'); 

            System.out.println("ch:"+ch);
            result = String.valueOf(ch) + result;
        }

        if(negative == true) {
            result = "-" + result;
        }

        return result;
    }
}

