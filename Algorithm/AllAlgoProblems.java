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
    { /*
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

        //Problem 8. Two-Sum pair, finding first pair
        {
            ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(4,1,3,-2,4,3,6,5,5,-1,3,10,2));
            findaPair(arrList, 8);
        }

        //Problem 9. Two-Sum pair, finding all pairs
        {
            //ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(5,1,3,-2,4,3,6,5,5,-1,3,10,2));
            //ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(5,5,5,3,3,3,5,5,3,3,5,3));
            ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(3,3,3,3,5,5,5,5,5));
            findallPair(arrList, 8);
        }

        //Problem 10. Two-Sum pair finding all possible pairs
        {
            //ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(2,3,4,5,1,7,6,4,2,6));
            //ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(3,3,3,3,5,5,5,5,5));
            ArrayList<Integer> arrList = new ArrayList<> (Arrays.asList(5,1,3,-2,4,3,6,5,5,-1,3,10,2));
            find_all_possible_pairs(arrList, 8);
        }

        //Problem 11. Merge two sorted arrays
        {
            ArrayList<Integer> arr1 = new ArrayList<Integer> (Arrays.asList(1, 5, 7));
            ArrayList<Integer> arr2 = new ArrayList<Integer> (Arrays.asList(3, 6, 11, 12, 34));
            Merge_SortedArrays(arr1, arr2);
        }

        //Problem 12. Binary Search recursive method
        {
            //ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(2, 4, 5, 56, 57, 61, 64, 83, 97, 100));
            ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(2));
            binarySearch_recursive(arr, 0, arr.size() - 1, 2);
        } */

        //Problem 13. Partition array with pivot element
        {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(6,9,8,5,4,7,2,5,3,1));
            ArrayList<Integer> result = pivotPartition(aList);
            for(int i=0; i<aList.size(); i++) {
                System.out.print(aList.get(i));
                System.out.print(" ");
            }
            System.out.println();
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
    // Problem 4. Binary Search Iterative method
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

    // -----------------------------------------------------------------------------------------
    // Problem 8. Two-Sum pair, finding first pair
    // -----------------------------------------------------------------------------------------
    public static void findaPair(ArrayList<Integer> aList, int num) {
        
        HashMap<Integer, Integer> hmap = new HashMap<> ();

        for(int i=0; i<aList.size(); i++) {
            if(hmap.containsKey(num - aList.get(i))) {
                System.out.println(aList.get(i));
                System.out.println(num - aList.get(i));
                break;
            }
            else {
                hmap.put(aList.get(i), 1);
            }
        }
        
    }

    // -----------------------------------------------------------------------------------------
    // Problem 9. Two-Sum pair, finding all pairs
    // -----------------------------------------------------------------------------------------
    public static void findallPair(ArrayList<Integer> aList, int tot) {
        
        HashMap<Integer, Integer> hmap = new HashMap<> ();
        
        for(int i=0; i<aList.size(); i++) {
            if(!hmap.containsKey(tot - aList.get(i))) {
                if(hmap.containsKey(aList.get(i))) {

                    int temp_value = hmap.get(aList.get(i));
                    hmap.put(aList.get(i), temp_value+1);

                }
                else {
                    hmap.put(aList.get(i), 1);
                }
            }
            else {
                if(0 <  hmap.get(tot - aList.get(i))) {

                    int value = hmap.get(tot - aList.get(i));
                    hmap.put(tot - aList.get(i), value-1);

                    System.out.println((tot - aList.get(i))+","+aList.get(i));
                }
                else {
                    hmap.put(aList.get(i), 1);
                }   
            }
        }
    }

    // -----------------------------------------------------------------------------------------
    // Problem 10. Two-Sum pair, finding all possible pairs
    // -----------------------------------------------------------------------------------------
    public static void find_all_possible_pairs(ArrayList<Integer> aList, int tot) {
        
        HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<> ();

        for(int i=0; i<aList.size(); i++) {
            
            if(hmap.containsKey(tot - aList.get(i))) {
                ArrayList<Integer> a_list = hmap.get(tot - aList.get(i));
                for(int j=0; j<a_list.size(); j++) {
                    System.out.println(aList.get(i)+","+(tot-aList.get(i)));
                }
                add_Element_Twosumpair(aList.get(i), i, hmap);
            }
            else {
                add_Element_Twosumpair(aList.get(i), i, hmap);                
            }
        }
    }

    //Problem 10. Sub Methods
    public static void add_Element_Twosumpair(int element, int index,  HashMap<Integer, ArrayList<Integer>> hmap) { 
        if(hmap.containsKey(element)) {
            //Learn:
            //Adding new index to the existing arraylist present inside hashmap
            //Accessing the hashmap values directly
            (hmap.get(element)).add(index);
        }
        else {
            ArrayList<Integer> a_list1 = new ArrayList<Integer>(Arrays.asList(index));
            hmap.put(element, a_list1);
        }
    }

    // -----------------------------------------------------------------------------------------
    // Problem 11. Merge two sorted arrays
    // -----------------------------------------------------------------------------------------
    public static void Merge_SortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        ArrayList<Integer> arr3;
        if(arr1.size() < arr2.size()) {
            arr3 = Merge(arr1, arr2);
        }
        else {
            arr3 = Merge(arr2, arr1);
        }
        for(int i=0; i<arr3.size(); i++) {
            System.out.println(arr3.get(i));
        }
    }

    static ArrayList<Integer> Merge(ArrayList<Integer> aList1, ArrayList<Integer> aList2) {
        
        ArrayList<Integer> aList3 = new ArrayList<> ();
        int i = 0;
        int j = 0;

        while(i<aList1.size()) {
            if(j == aList2.size()) {
                break;
            }
            else {
                if(aList1.get(i) < aList2.get(j)) {
                    aList3.add(aList1.get(i));
                    i++;
                }
                else {
                    aList3.add(aList2.get(j));
                    j++;
                }
            }
        }

        if(i == aList1.size()) {
            if(j < aList2.size()) {
                aList3 = add_remaining(aList3, j, aList2);
            }
        }
        else if(j == aList2.size()) {
            if(i < aList2.size()) {
                aList3 = add_remaining(aList3, i, aList1);
            }
        }

        return aList3;
    }

    public static ArrayList<Integer> add_remaining(ArrayList<Integer> b1, int i, ArrayList<Integer> a1) {
        
        for(i=i; i<a1.size(); i++) {
            b1.add(a1.get(i));
        }

        return b1;
    }

     // -----------------------------------------------------------------------------------------
     //Problem 12. Binary Search recursive method
     // -----------------------------------------------------------------------------------------
     static void binarySearch_recursive(ArrayList<Integer> aList, int start, int end, int num) {
         
         System.out.println("St: " + start + "; End: " + end + "; Num: " + num);
         if(start <= end) {
             int mid = start + ((end - start) / 2);
             if(aList.get(mid) == num) {
                System.out.println("Yes");
             }
             else {
                if(aList.get(mid) > num) {
                    binarySearch_recursive(aList, start, mid-1, num);
                }
                else {
                    binarySearch_recursive(aList, mid+1, end, num);
                }
             }
         }
         else {
            System.out.println("No");
         }
     }

     // -----------------------------------------------------------------------------------------
     //Problem 13. Partition array with pivot element
     // -----------------------------------------------------------------------------------------

     static ArrayList<Integer> pivotPartition(ArrayList<Integer> aList) {
        
        int i = 1;
        int j = aList.size() - 1;
        int pivot = aList.get(0);
        int pivot_index = 0;

        while(i != aList.size() && j != 0) {

            while(aList.get(i) < pivot && i < aList.size()) {
               i++;
            }

            while(aList.get(j) > pivot && j > 0) {
                j--;
            }

            if(i < j) {
                Collections.swap(aList, i, j);
                System.out.println("Swapping "+i+" and "+j);
                }
            }
            i++;
            j--;
        }

        return aList;
     }


}

