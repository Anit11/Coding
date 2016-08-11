import java.util.*;

public class RemoveDuplicate
{
    public static String input;
    public static void main(String args[])
    {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        input = removedup(input);

        System.out.println("The new string is "+input);
    }

    public static String removedup(String str)
    {
//        char[] word = new char[str.length()];
        String result = "";
        int count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        for(int i=0; i<str.length(); i++)
        {
            //if(!hmap.containsKey(i))
            //if(hmap.get(i) == null)
            if(hmap.get((int)str.charAt(i)) == null)
            {
//                System.out.println(hmap.get((int)word[i]));
//                hmap.put(i, word[i]);
                hmap.put((int)str.charAt(i), i); 
//                System.out.println("The word array is "+word[i]);
//                word[count] = str.charAt(i);
                result += str.charAt(i);
                ++count;
            }
        }

//        String newstr = "";
//        newstr = String.valueOf(word);
        return result;
//        return newstr;

        /*
        str = "";
        for(int k=0; k<count; k++)
        {
            str += hmap.get(k);
        }
         
        return str;
        */
    }
}

