import java.io.*;
import java.util.*;


public class AllAlgoProblems
{
    // Problem 3. bubbleSort
    static int[] arr;
    static int length;

    // Problem 4. findElement
    int counter = 0;

    // Problem 5. findRepeatingCharacter
    static char c;

    // -----------------------------------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------------------------------
    public static void main(String args[])
    {
        // Problem 1. ReverseWord
        {
            System.out.println("Reverse the word in the String");
            System.out.println("Enter the String: ");
            Scanner sc = new Scanner(System.in);
            String sentence = sc.next();
            System.out.println("Checking input "+sentence);
            String result = ReverseSentence(sentence);
            System.out.println("The reversed string is: "+result);
        }

        // Problem 2. addDigit
        {
            System.out.println("Sum your digits");
            System.out.println("Enter your digit");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int result = sum(number);
            System.out.println("Answer is "+result);
        }

        // Problem 3. BubbleSort
        {
            System.out.println("Welcome to bubble sort");
            System.out.println("Enter the length: ");

            Scanner sc = new Scanner(System.in);
            length = sc.nextInt();
            arr = new int[length];

            for(int i = 0; i<length; i++)
            {
                arr[i] = sc.nextInt();
            }

            bubble();
            
            System.out.println("Sorted Array is: ");
            for(int i=0; i<length; i++)
            {
                System.out.println(arr[i]);
            }

        }

        // Problem 4. findElement
        {
            int num;
            //int lSiz;
            //int sSiz;
            //int mid;

            System.out.println("Enter the numbers to store and press any alphabet to stop");
            ArrayList<Integer> aList = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            findElement obj = new findElement();
            while(sc.hasNextInt()) {
                aList.add(sc.nextInt());
            }
            String a = sc.next();

            System.out.println("Enter the number to find");
            
            num = sc.nextInt();
    //        lSiz = (int)(Math.floor(aList.size()));
    //        lSiz = (aList.size())-1;
    //        mid = (aList.size()-1)/2;
    //        sSiz = 0;

            int start = 0;
            int end = aList.size() - 1;
    //        boolean answer = obj.getElement(aList, num);
            //boolean answer = obj.getElementRecursive(aList, num, start, end);
            boolean answer = obj.getElementRecursive2(aList, num, start, end);
            obj.printfinal(answer);

        }

        // findRepeatingCharacter
        {
            System.out.println("Enter the String: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.next();

            Boolean b = findRepeat(word);
            printRepeat(b);

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
    private static void bubble()
    {
        Boolean Counter = true;
        int pass = 0;

        while(Counter)
        {
            Counter = false;
            pass++;

            for(int i=1; i<length; i++)
            {
                if(arr[i-1] > arr[i])
                {
                    bSwap(i-1, i);
                    Counter = true;
                }
            }
        }

        System.out.println("No of Pass: "+pass);
    }

    private static void bSwap(int a, int b)
    {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // -----------------------------------------------------------------------------------------
    // Problem 4. findElement
    // -----------------------------------------------------------------------------------------
    public boolean getElement(ArrayList<Integer> aList, int num) {
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

    public void printfinal(boolean ans) {
        if(ans == false)
        {
            System.out.println("The number is not in the list");
        }
    }

    public boolean getElementRecursive(ArrayList<Integer> aList, int num, int start, int end) {
        
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

    public boolean getElementRecursive2(ArrayList<Integer> aList, int num, int start, int end) {
        
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
    public static boolean findRepeat(String str) {

        HashMap<Character, Integer> ham = new HashMap<> ();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            c = str.charAt(i);
            if (ham.containsKey(c)) {
                return true;
            }

            else {
               ham.put(c, ++count); 
            }
        }
        return false;
        
    }

    private static void printRepeat(Boolean bool) {
        
        if(bool == true) {
            System.out.println("The first repeated character in the given word is "+c);
        }
        else {
            System.out.println("All the characters in the word is unique");
        }
    }
}
