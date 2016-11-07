import java.io.*;
import java.util.*;


public class AllAlgoProblems
{
    // Problem 4. findElement
    static int counter = 0;

    // Problem 5. findRepeatingCharacter
    static char repeatedChar;

    // -----------------------------------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------------------------------
    public static void main(String args[])
    {
        // Problem 1. ReverseWord
        {
            System.out.println("\nProblem 1. Reverse the word in the String");
            String sentence = " My name is anitha ";
            String result = ReverseSentence(sentence);
            System.out.println("The reversed string is: "+result);
        }

        // Problem 2. addDigit
        {
            System.out.println("\nProblem 2. Sum your digits");
            int number = 54321;
            int result = sum(number);
            System.out.println("Answer is: "+result);
        }

        // Problem 3. BubbleSort
        {
            System.out.println("\nProblem 3. Bubble Sort");
            System.out.println("Enter the length: ");

            int[] arr = {5,3,2,4,1};
            bubble(arr);
            
            System.out.println("Sorted Array is: ");
            for(int i=0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }

        // Problem 4. Binary Search
        {
            System.out.println("\nProblem 4. Binary Search");

            ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(1,2,4,6,7,8,9));
            int num = 8;
            int start = 0;
            int end = aList.size() - 1;

            boolean answer = getElementRecursive2(aList, num, start, end);
            printfinal(answer);
        }

        // Problem 5. findRepeatingCharacter
        {
            System.out.println("\nProblem 5. Binary Search");
            String word = "hello";

            Boolean b = findRepeatCharacter(word);
            printRepeat(b);
        }

        // Problem 6. Find all repeated words in a string
        {
            System.out.println("\nProblem 6. Find all repeated words in a string");
            String str = ".,!: I  . am Sloth,. I move slowly. I walk slowly. Sloth says Hello!)";
            findRepeatedWords(str);
        }

        // Problem 7. Find all repeated words in a string
        {
            String str = ".,!: I  . am Sloth,. I move slowly. I walk slowly. Sloth says Hello!! :) ";
            ArrayList<String> strList = new ArrayList<String>();
            strList = filterDelimiter(str, ",. !:) ");
            for (String st : strList) {
                System.out.println(st);
            }
        }

    }
    
    // -----------------------------------------------------------------------------------------
    // Problem 1. ReverseWord
    // -----------------------------------------------------------------------------------------
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

    // -----------------------------------------------------------------------------------------
    // Problem 2. addDigit
    // -----------------------------------------------------------------------------------------
    public static int sum(int input)
    {
        // (int) Math.log10(input)+1 --- to find the number of digits in integer.
        if((int) Math.log10(input) + 1 != 1)
        {
            return sum(input%10)+(input%10);
        }
        else
            return input;
    }

    // -----------------------------------------------------------------------------------------
    // Problem 3. bubbleSort
    // -----------------------------------------------------------------------------------------
    private static void bubble(int[] arr)
    {
        Boolean Counter = true;
        int pass = 0;

        while(Counter)
        {
            Counter = false;
            pass++;

            for(int i=1; i<arr.length; i++)
            {
                if(arr[i-1] > arr[i])
                {
                    bSwap(arr, i-1, i);
                    Counter = true;
                }
            }
        }

        System.out.println("No of Pass: "+pass);
    }

    private static void bSwap(int[] arr, int a, int b)
    {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // -----------------------------------------------------------------------------------------
    // Problem 4. findElement
    // -----------------------------------------------------------------------------------------
    public static boolean getElement(ArrayList<Integer> aList, int num) {
        //System.out.println("1: getElement");
        int size = aList.size();
        if(size != 0 ) {
            int start = 0;
            int end = size - 1;
            int mid = size/2;
            int count = 0;

            do {
                count++;
                System.out.println("Loop: "+count);
                mid = (start + end)/2;
                if(aList.get(mid) == num) {
                     System.out.println("The number "+num+" is found and its position is "+mid);
                     return true;
                }
                else if(aList.get(mid) < num) {
                    start = mid+1;
                }
                else if(aList.get(mid) > num) {
                    end = mid - 1;
                }
            }while(mid != end);
        }
        return false;
    }

    public static void printfinal(boolean ans) {
        if(ans == false)
        {
            System.out.println("The number is not in the list");
        }
    }

    public static boolean getElementRecursive(ArrayList<Integer> aList, int num, int start, int end) {
        
        int mid;
        mid = (start + end)/2; 
        if(counter == 0)
        {
            if(aList.get(mid) == num) {
                System.out.println("The number is found in "+mid+" position");
                return true;
            }
            else if(aList.get(mid) < num) {
                if(mid == start && mid == end) {
                    counter++;
                }
                start = mid + 1; 
                return getElementRecursive(aList, num, start, end);
            }
            else if(aList.get(mid) > num) {
                if(mid == start && mid == end) {
                        counter++;
                }
                end = mid - 1;
                return getElementRecursive(aList, num, start, end);
            }
        }

        return false;
    }

    public static boolean getElementRecursive2(ArrayList<Integer> aList, int num, int start, int end) {
        
        int mid;
        mid = (start + end)/2; 
        if(start <= end)
        {
            if(aList.get(mid) == num) {
                System.out.println("The number is found in "+mid+" position");
                return true;
            }
            else if(aList.get(mid) < num) {
                return getElementRecursive2(aList, num, mid + 1, end);
            }
            else if(aList.get(mid) > num) {
                return getElementRecursive2(aList, num, start, mid - 1);
            }
        }

        return false;
    }

    // -----------------------------------------------------------------------------------------
    // Problem 5. findRepeatingCharacter
    // -----------------------------------------------------------------------------------------
    public static boolean findRepeatCharacter(String str) {

        HashMap<Character, Integer> ham = new HashMap<> ();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            repeatedChar = str.charAt(i);
            if (ham.containsKey(repeatedChar)) {
                return true;
            }

            else {
               ham.put(repeatedChar, ++count); 
            }
        }

        return false;
    }

    private static void printRepeat(Boolean bool) {
        
        if(bool == true) {
            System.out.println("The first repeated character in the given word is "+repeatedChar);
        }
        else {
            System.out.println("All the characters in the word is unique");
        }
    }

    // -----------------------------------------------------------------------------------------
    // Problem 6. Find all repeated words in a string
    // -----------------------------------------------------------------------------------------
    public static void findRepeatedWords(String str) {
        
        int str_size = str.length();
        HashMap<String, Integer> hmap = new HashMap<> ();
        int start = 0;
        int end = 0;
        boolean flag = true;
        String word;

        for(int i=0; i<str_size; i++) {
            //if(str.charAt(i) == '.' || str.charAt(i) == ',') {
            //}
            if(false == flag && str.charAt(i) != ' ') {
               start = i;
               flag = true;
            }
            else if(true == flag && str.charAt(i) == ' ') {
                word = str.substring(start, i);
                //System.out.println(word);
                if(hmap.containsKey(word)) {
                    System.out.println(word);
                }
                else {
                    hmap.put(word, 1);
                }
                flag = false;
            }
        }
        if(flag == true) { 
            word = str.substring(start, str_size);
            if(hmap.containsKey(word)) {
                System.out.println(word);
            }
            else {
                hmap.put(word, 1);
            }
        }
    }

    // -----------------------------------------------------------------------------------------
    // Problem 7. Filtering Delimiter from a String
    // -----------------------------------------------------------------------------------------
    public static ArrayList<String> filterDelimiter(String str, String delim) {
        
        HashMap<Character, Integer> hmap = new HashMap<> ();
        ArrayList<String> arrList = new ArrayList<> ();
        int start = 0;

        for(int i=0; i<delim.length(); i++) {
            hmap.put(delim.charAt(i), 1);
        }

        for(int i=0; i<str.length(); i++) {
            if(hmap.containsKey(str.charAt(i))) {
               if(start != i) {
                   arrList.add(str.substring(start, i));
                   start = i+1;
               }
               else {
                   start++;
               }
            }
        }
        if(start < str.length()) {
            arrList.add(str.substring(start, str.length()));
        }
        return arrList;
    }
}
