import java.util.*;
import java.io.*;

//find if the string has unique character or not
public class StrUniHashMap
{
    public static void main(String args[])
    {
        System.out.println("Please enter the string to check: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //declaring HashMap
        HashMap<Integer, Character> hmap = new HashMap<Integer, Character>();

        for(int i=0; i<word.length(); i++)
        {
            char c = word.charAt(i);
            int k = (int)c;

            //ASCII value of each character is checked
            //if character is repeated, ASCII of that particular value will not be null, boooom!! we got it, else loop will execute.
            if(hmap.get(k) == null)
            {
                hmap.put(k, c); 
            }
            else
            {
                System.out.println("The string is not unique");
                System.exit(0);
            }

        }

        System.out.println("The given string is unique");

/*        for(int j=0; j<word.length(); j++)
        {
            System.out.println("The value is: "+hmap.get(j));
        }*/
    }
}
