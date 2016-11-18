
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
        } 
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
        //Problem 14. Finding Equilibrium index of an array
        {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(1,2,3,4,5,6,27,-3,-4,-5));
            //ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(-7, 1, 5, 2, -4,  3, 0));
            int result_index = find_equilibriumIndex(aList);
            if(result_index == -1) {
                System.out.println("There is no equilibrium index in the array");
            }
            else {
                System.out.println("The Equilibrium index is "+(result_index + 1)+" and the element in the index is "+aList.get(result_index));
            }
        }

        //Problem 15. Find kth smallest number in unsorted array
        {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(5, 3, 7, 4, 2, 1));
            int result = find_kth_smallElement(aList, 3);
            System.out.println("The kth smallest element is : "+result);
        }

        //Problem 16. Given two list. Find common elements in both list.
        {
            List<Integer> aList1 = new ArrayList<> (Arrays.asList(1, 3, 5, 2, 8, 6, 9));
            List<Integer> aList2 = new ArrayList<> (Arrays.asList(2, 7, 4, 6));
            //String result = find_commonElements(aList1, aList2);
            String result = find_commonElementsSet(aList1, aList2);
            for(int i=0; i<result.length(); i++) {
                System.out.println(result.charAt(i));
            }
        }

        //Problem 17. Convert string to signed int
        {
            String str = "-123";
            int num = string_to_int(str);
            System.out.println("The final number is : "+num);
        } 

         //Problem 18. Convert signed int to string
         {
            int num = -123;
            String str = int_to_string(num);
            System.out.println("The final string is : "+str);
         }

         //Problem 19. Find unique character in a string where all other characters are present exactly twice
         {
            String str = "helloohhe";
            char ch = find_unique_character(str);
            System.out.println("The unique character in the string is : "+ch);
         }

         //Problem 20. Delete the first given character from a String
         {
            String str = "This is my String";
            str = delete_character(str, "iohm");
            System.out.println("The new string is : "+str);
         }

         //Problem 21. K- messed sorting
         {
            ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(2, 6, 3, 12, 56, 8));
            aList = k_messed_sort(aList, 10);
            System.out.println(aList);
         }
         i*/

         //Problem 22. Island Problem
         {
            int[][] arr = {
                {0, 1, 0, 1, 0}, 
                {0, 0, 1, 1, 1}, 
                {1, 0, 0, 1, 0},
                {0, 1, 1, 0, 0}, 
                {1, 0, 1, 0, 1}
              };
            int n = find_island(arr);
            System.out.println("The number of island is: "+n);
         }
         

         //Problem 23. Check Isomorphic for two strings
         {
            String str1 = "ab";
            String str2 = "aa";
            boolean boo = check_isomorphic(str1, str2);

            if(boo == false) {
                System.out.println("It is not Isomorphic");
            }
            else {
                System.out.println("It is Isomorphic");
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

        //reverse the entire string
        for(i=0, j=(input.length())-1; i<input.length()/2; i++,j--)
        {
            /*
            XOR Swap Example:
            input[i] = input[i] ^ input[j];  --->o^h = some value
            input[j] = input[i] ^ input[j];  --->(o^h) ^ h = h cancels h, therefore ans is o
            input[i] = input[i] ^ input[j];  --->(o^h) ^ o = o cancels o, therefore ans is h 
            */
            //Typecasting to char as XOR operation changes the value to int
            inputArr[i] = (char)(inputArr[i]^inputArr[j]);
            inputArr[j] = (char)(inputArr[i]^inputArr[j]);
            inputArr[i] = (char)(inputArr[i]^inputArr[j]);
        }
        
        int position = 0;
        
        //reverse each word in reversed string
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
            i++;
            j--;
        }
        return aList;
     }
     // -----------------------------------------------------------------------------------------
     //Problem 14. Finding Equilibrium index of the array
     // -----------------------------------------------------------------------------------------
     static int find_equilibriumIndex(ArrayList<Integer> aList) {
        
        int left_total = 0;
        int right_total = aList.get(aList.size()-1);
        for(int i=0; i<aList.size() - 1; i++) {
            left_total += aList.get(i);
        }
        for(int i=aList.size()-2; i>0; i--) {
            left_total = left_total - aList.get(i);
            if(left_total == right_total) {
                return i;
            }
            else {
                right_total += aList.get(i);
                }
        }
        return -1;
     }


     // -----------------------------------------------------------------------------------------
     //Problem 15. Find kth smallest number in unsorted array
     // -----------------------------------------------------------------------------------------
     public static int find_kth_smallElement(ArrayList<Integer> aList, int k) {
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<> (Collections.reverseOrder());

        for(int i=0; i<k; i++) {
            pQueue.add(aList.get(i));
        }
         
        for(int i=k; i<aList.size(); i++) {
            if(pQueue.element() > aList.get(i)) {
                pQueue.remove();
                pQueue.add(aList.get(i));
            }
        }

        return pQueue.element();
     }


     // -----------------------------------------------------------------------------------------
     //Problem 16. Given two list. Find common elements in both list using HashMap
     // -----------------------------------------------------------------------------------------

     public static String find_commonElements(List<Integer> aList1, List<Integer> aList2) {
        
        HashMap<Integer, Integer> hmap = new HashMap<> ();

        for(int i=0; i<aList1.size(); i++) {
            hmap.put(aList1.get(i), 1);
        }

        String str1 = new String();
        for(int i=0; i<aList2.size(); i++) {
            if(hmap.containsKey(aList2.get(i))) {
                str1 = str1+aList2.get(i);
            }
        }

        return str1;
     }

     // -----------------------------------------------------------------------------------------
     //Problem 16b. Given two list. Find common elements in both list using HashSet
     // -----------------------------------------------------------------------------------------

     public static String find_commonElementsSet(List<Integer> aList1, List<Integer> aList2) {
        
        System.out.println("Problem 16b. Using HashSet");
        HashSet<Integer> hSet = new HashSet<> ();

        for(int i=0; i<aList1.size(); i++) {
            hSet.add(aList1.get(i));
        }

        String str1 = new String();
        for(int i=0; i<aList2.size(); i++) {
            if(hSet.contains(aList2.get(i))) {
                str1 = str1+aList2.get(i);
            }
        }

        return str1;
     }

     // -----------------------------------------------------------------------------------------
     //Problem 17. Convert string to signed int
     // Best peice of code. Amazing work. Love this piece of code.
     // -----------------------------------------------------------------------------------------

     public static int string_to_int(String str) {
        
        int number;
        int multiplier;
        number = 0;
        multiplier = 1;

        for(int i=str.length()-1; i>0;  i--) {
           
            /*char a = str.charAt(i);
            number +=  Character.getNumericValue(a) * multiplier;*/
            int num = str.charAt(i) - '0';
            number += num * multiplier;
            multiplier = multiplier * 10;
        }

        if(str.charAt(0) == '-') {
            //changing positive number to negative number
            number = -number;
        }   
        else {
            char a = str.charAt(0);
            number += Character.getNumericValue(a) * multiplier;
        }

        return number;
     }

     // -----------------------------------------------------------------------------------------
     //Problem 18. Convert signed int to string
     // Best peice of code. Amazing work. Love this piece of code.
     // -----------------------------------------------------------------------------------------

    public static String int_to_string(int number) {
        
        StringBuilder sb = new StringBuilder();
        boolean boo = false;

        if(number < 0) {
            boo = true;
            // changing negative number to positive number
            number = -number; 
        }
        while(number > 0) {
            sb.append(number % 10);
            number = number / 10;
        }
        if(true == boo) {
            sb.append('-');
        }

        sb.reverse();

        String str = sb.toString();
        return str;
    }

     // -----------------------------------------------------------------------------------------
     //Problem 19. Find unique character in a string where all other characters are present exactly twice
     // -----------------------------------------------------------------------------------------

    public static char find_unique_character(String str) {
        
        char ans = str.charAt(0);

        for(int i=1; i<str.length(); i++) {
            
            char a = str.charAt(i);
            ans = (char)(ans ^ a);
        }

        return ans;
    }

     // -----------------------------------------------------------------------------------------
     //Problem 20. Delete the first given character from a String
     // -----------------------------------------------------------------------------------------
     
     public static String delete_character(String my_string, String remove) {
        
        HashMap<Character, Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<remove.length(); i++) {
            hmap.put(remove.charAt(i), 1);
        }

        for(int i=0; i<my_string.length(); i++) {
            
            if(!hmap.containsKey(my_string.charAt(i))) {
                sb.append(my_string.charAt(i));
            }
        }

        String result = sb.toString();
        return result;
        
     }

     // -----------------------------------------------------------------------------------------
     //Problem 21. K- messed sorting
     // -----------------------------------------------------------------------------------------

     public static ArrayList<Integer> k_messed_sort(ArrayList<Integer> aList, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<> (k);
        int j = 0;

        if(k > aList.size()) {
            return null;
        }

        for(int i=0; i<k-1; i++) {
            pq.add(aList.get(i));
        }

        for(int i=k-1; i<aList.size(); i++,j++) {
            pq.add(aList.get(i));
            aList.set(j, pq.remove());
        }

        while(!pq.isEmpty()) {
            aList.set(j, pq.remove());
            j++;
        }

        return aList;
     }


     // -----------------------------------------------------------------------------------------
     //Problem 22. Island Problem
     // -----------------------------------------------------------------------------------------

     public static int find_island(int[][] arr) {
        int island = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == 1) {
                    arr = find_neighbor(arr, i, j);
                    island++;
                }
            }
        }
        return island; 
     }

     public static int[][] find_neighbor(int[][] arr, int i, int j) {
        
        if(arr[i][j] == 1) {
            arr[i][j] += 1;

            if(i<arr.length-1) {
               arr = find_neighbor(arr, i+1, j); 
            }
            if(j<arr[0].length-1) {
               arr = find_neighbor(arr, i, j+1);
            }
            if(i>0) {
               arr = find_neighbor(arr, i-1, j);
            }
            if(j>0) {
               arr = find_neighbor(arr, i, j-1);
            }
        }
        return arr;
     }

     // -----------------------------------------------------------------------------------------
     //Problem 23. Check isomorphic for two strings
     // -----------------------------------------------------------------------------------------

     public static boolean check_isomorphic(String str1, String str2) {
        
        if(str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> hmap = new HashMap<> ();
        Set<Character> hset = new HashSet<> ();

        for(int i=0; i<str1.length(); i++) {
            
            if(hmap.containsKey(str1.charAt(i))) {
                if(hmap.get(str1.charAt(i)) != str2.charAt(i)) {
                   return false; 
                }
            }
            else if(hset.contains(str2.charAt(i))) {
                return false;
            }
            else {
                hmap.put(str1.charAt(i), str2.charAt(i));
                hset.add(str2.charAt(i));
            }
         }

         return true;
        }
}

