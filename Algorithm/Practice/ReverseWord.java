import java.io.*;
import java.util.*;

public class ReverseWord
{
    public static void main(String args[])
    {
        System.out.println("Reverse the word in the String");
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        System.out.println("Checking input "+sentence);
        String result = ReverseSentence(sentence);
        System.out.println("The reversed string is: "+result);
    }
    
    public static String ReverseSentence(String input)
    {
        char[] inputArr = input.toCharArray();
        int i, j, k;
        for(i=0, j=(input.length())-1; i<input.length()/2; i++,j--)
        {
            inputArr[i] = (char)(inputArr[i]^inputArr[j]);
            inputArr[j] = (char)(inputArr[i]^inputArr[j]);
            inputArr[i] = (char)(inputArr[i]^inputArr[j]);
        }
        
        int position = 0;
        StringBuilder sb = new StringBuilder();

        for(i=0; i<inputArr.length; i++)
        {
           if(inputArr[i] == ' ')
           {
               k = i;
               for(j=position; j<i; j++, k--)
               {
                    inputArr[k] = (char)(inputArr[k]^inputArr[j]);
                    inputArr[j] = (char)(inputArr[k]^inputArr[j]);
                    inputArr[k] = (char)(inputArr[k]^inputArr[j]);
               }
               position = i+1;
           }
        }

        return(String.valueOf(inputArr));
    }

/*    public static char[] ReverseWord(char[] input)
    {
        
    } */
}
