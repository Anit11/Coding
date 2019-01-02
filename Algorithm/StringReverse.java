import java.util.*;

public class StringReverse 
{
    public static void main(String args[])
    {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
//        int k = reverse(input);
        int k = reverseString(input);

        if(k == 1)
        {
            System.out.println("Success");
        }
        else 
        {
            System.out.println("Failure");
        }
    }

//----- These functions can take only a word as an input, not a sentence -----//

    public static int reverse(String string)
    {
        //To reverse string by converting string to char array and vice versa to print it.
        
        char[] ch = string.toCharArray();
        for(int i = 0, j=ch.length-1; i<ch.length/2; i++,j--)
        {
            ch[i] = (char)(ch[i]^ch[j]);
            ch[j] = (char)(ch[i]^ch[j]);
            ch[i] = (char)(ch[i]^ch[j]);
        }
        string = String.valueOf(ch);  
        System.out.println("The reversed string is: "+string);
        return 1;
    }

    public static int reverseString(String string)
    {
//  This is wrong as string.charAt(i) is a value not variable to store the right side function.
/*       for(int i=0, j=string.length(); i<string.length()/2; i++,j--)
       {
           string.indexOf(i) = (char)(string.charAt(i) ^ string.charAt(j));
           string.charAt(j) = (char)(string.charAt(i) ^ string.charAt(j));
           string.charAt(i) = (char)(string.charAt(i) ^ string.charAt(j));
       }  */ 
        StringBuffer sb = new StringBuffer(string);
        sb.reverse();
        System.out.println(sb);
        return 1;
    }
}
