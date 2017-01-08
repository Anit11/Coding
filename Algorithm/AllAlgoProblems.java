import java.util.*;

//Problem 1. ReverseWord
//Problem 2. addDigit
//Problem 3. BubbleSort
//Problem 4. Binary Search
//Problem 5. findRepeatingCharacter
//Problem 6. Find all repeated words in a string
//Problem 7. Find all repeated words in a string
//Problem 8. Two-Sum pair, finding first pair
//Problem 9. Two-Sum pair, finding all pairs
//Problem 10. Two-Sum pair finding all possible pairs
//Problem 11. Merge two sorted arrays
//Problem 12. Binary Search recursive method
//Problem 13. Partition array with pivot element
//Problem 14. Finding Equilibrium index of an array
//Problem 15. Find kth smallest number in unsorted array
//Problem 16. Given two list. Find common elements in both list.
//Problem 17. Convert string to signed int
//Problem 18. Convert signed int to string
//Problem 19. Find unique character in a string where all other characters are present exactly twice
//Problem 20. Delete the first given character from a String
//Problem 21. K- messed sorting
//Problem 22. Island Problem
//Problem 23. Check Isomorphic for two strings
//Problem 24. Median of stream of numbers
//Problem 25. Find sub-array that gives maximum sum
//Problem 26. Find the Missing number in the array 1 to n. Exactly one number is missing, and one number is duplicated twice.
//Problem 27. Find Missing numbers in the array 1 to n.
//Problem 28. Seperate even and odd numbers. Even first and odd second 
//Problem 29: Find three numbers in a array that will add to a given sum
//Problem 30: Find number in rotated sorted array
//Problem 31. Find minimum number in rotated sorted array(with no duplicates) 
//Problem 32. Sort an array of 0's, 1's, 2's
//Problem 33. Given list of sorted distinct numbers. Find number with same index.
//Problem 34. Stack Implementation
//Problem 35. find k nearest cluster in the group
//reverse a C-Style string
//remove duplicates in string without using buffer
//find anagram
// Given two sorted list, find kth largest number
//Given Array of positive integers, a number is duplicated, find the dupplicated in O(n) time and O(1) space
//Given an int, print the number with no repeating digits
//Given an array, find the majority element in the list 
//Given an stream of numbers as an array, find the median of stream of number
//check if array is unique or not using Bit Manipulation
//Print matrix diagonally
//return all unique pairs of integers that would add up to sum
//Sudoku Solver
//Find the successor of the node, ---given the node---
//Find the subset of the array
//given an array and a number, find the first occurance of the number
//Given the list of numbers, find the longest consecutive numbers 
//Given the array of numbers, starting position and ending position, calculate and print the addition from the starting point to the ending point 
//Given an array with unique numbers, print the wave form of the number
//Problem 56. Given the sorted array, find just bigger to a element k, k can or cannot be present in the array
//Class for Stack Implementation - LinkedList

class node {
   int data;
   node next;

   public node(int data) {
        this.data = data;
   }
}

//Class for k nearest point
class point {
    int x_axis;
    int y_axis;

    public point(int x, int y) {
        x_axis = x;
        y_axis = y;
    }
}

class cluster {
    HashMap<point, Double> hmap_distance = new HashMap<> ();
    int x1;
    int y1;

    public void my_cluster(int x, int y) {
       hmap_distance.put(new point(x,y), Math.sqrt((x-x1) / (y-y1)));
    }
}

//Problem 46.
//return all unique pairs of integers that add up to sum
//Class to create type pair to return set of integers
class Pair {
	int _a;
	int _b;
	public Pair(int a, int b) {
		_a = a;
		_b = b;
    }
}

//Problem 52.
//Permutation of words in phone number
class PhoneNumber {
    HashMap<Integer,String> phoneMap = new HashMap<>();
    
    PhoneNumber() {
        phoneMap.put(0, "");
        phoneMap.put(1, "");
        phoneMap.put(2, "abc");
        phoneMap.put(3, "def");
        phoneMap.put(4, "ghi");
        phoneMap.put(5, "jkl");
        phoneMap.put(6, "mno");
        phoneMap.put(7, "pqrs");
        phoneMap.put(8, "tuv");
        phoneMap.put(9, "wxyz");
    }
}

//Problem 54.
//Given the array of numbers, starting position and ending position, calculate and print the addition from the starting point to the ending point 

class CreateSum {
    int[] _arr; 

    CreateSum(int[] arr) {
       _arr = new int[arr.length];
       _arr[0] = arr[0];
       for(int i=1; i<arr.length; i++) {
            _arr[i] = arr[i] +  _arr[i-1];
       }
    }
}

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

         //Problem 24. Median of stream of numbers
         {
           ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(30, 25, 22, 5, 10, 20)); 
           int result = find_median(aList);    
           System.out.println(result);
         }

         //Problem 25. Find sub-array that gives maximum sum
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(4, 5, -14, 7, 1, 3, -9, 2, -1));
            int sum = find_maxsum_subarray(aList);
            System.out.println("Max Sum :"+sum);
         }

         //Problem 26. Find the Missing number in the array. Exactly one number is missing, and one number is duplicated twice.
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(10, 2, 3, 6, 4, 5, 8, 9, 1, 2));
            int missing_num = find_missing_num(aList);
            System.out.println("The number is : "+missing_num);
         }

         //Problem 27. Find Missing numbers in the array 1 to n.
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(10, 3, 6, 4, 5, 9, 1, 2));
            find_missing_numbers(aList);
         }

         //Problem 28. Seperate even and odd numbers. Even first and odd second 
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(2, 3, 5, 4, 8, 2, 7, 10));
            seperate_evenodd(aList);
            for(int i : aList) {
                System.out.print(i +",");
            }
         }

         //Problem 29. Find number that adds up to a Sum
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(2, 8, 10, 2, 1, 5, 6, 7));
            three_sum(aList, 54);
         }

         //Problem 30: Find number in rotated sorted array, without duplicates or less number of dupliactes
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(2, 2, 5, 6, 6, 7, 8, 10, 1, 2));
            find_num_rotated_sortedarray(aList, 7);
         }

         //Problem 31. Find minimum number in rotated sorted array(with no duplicates) 
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(10, 11, 12, 34, 65, 90, -1, 0, 1, 2, 2, 2, 5, 6, 6, 7, 8));
            find_min_rotated_sortedarray(aList);
         }

         //Problem 32. Sort an array of 0's, 1's, 2's
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(1, 0, 0, 1, 2, 2, 1, 0, 2, 0));
            sort_zero_one_two(aList);
         }

         //Problem 33. Given list of sorted distinct numbers. Find number with same index.
         {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(-1, 1, 4, 6, 7));
            findSameIndex(aList);
         }

         //Problem 34. Stack Implementation
         {
            node head = null; 
            head = node_push(8, head);
            head = node_push(2, head);
            head = node_push(5, head);
            head = node_pop(head);
            head = node_pop(head);
         }

         //Problem 35. Stack Implementation with ArrayList

         //Problem 36. find k-nearest stars
        {
            cluster c = new cluster();
            c.x1 = 2;
            c.y1 = 3;
            c.my_cluster(2,2);
            c.my_cluster(1,4);
            c.my_cluster(8,7);
            c.my_cluster(2,9);
            c.my_cluster(63,10);
            c.my_cluster(7,7);
            k_nearestCluster(c, 5);

        }   
     */
     /*

        //Cracking coding interview
        //Problem 37.
        //Problem 1.2
        //reverse a C-Style string
        {
            reverseString("hello I am good\0");
        }

        //Problem 1.3
        //Problem 38.
        //remove duplicates character in a string
        {
            removeDuplicates("array");
        }

        //Problem 1.4
        //Problem 39.
        //find if the two string has anagram
        {
            findAnagram("sing the song", "shjhssong the sings");
        }

        //REDO
        {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,4,5,6));
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7,8));
            int result = kHighest(list1, list2, 9);
            System.out.println(result);
        }

        //Problem 40.
        //Given Array of positive integers, a number is duplicated, find the dupplicated in O(n) time and O(1) space
        //the elements in the array is not greater than the size of the array
        {
            ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(1,3,2,1,4));
            int result = findFirstDuplicate(aList);
            if(result != -1) {
                System.out.println(result);
            }
        }

		//Problem 41.
		//Print unique digits in the integer
		{
			printUniqueDigits(-1210);
		}

        //Problem 42.
        //find majority Element in the given list, dynamic procedure is followed here
		{
			int res = findMajorityElement(new ArrayList<Integer> (Arrays.asList(2,2,2,2,3,3,3,3,2)));
			System.out.println("The result is"+res);
		}

        //Problem 43.
        //find the median in stream of numbers using heap datastructure
		{
			findMedian(new ArrayList<Integer> (Arrays.asList(2,6,4,5,7,8,1,3,9)));
		}	

        //Problem 44.
        //check if array is unique or not using Bit Manipulation
        //Only 32 bits are in a integer, so this method works only for number upto 32
        {
           ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,233847178,8));
           findUniqueBitManipulation(aList);
        }

        //Problem 45.
        //Print the matrix in diagonal order
        
        {
            int[][] matrix = new int[5][5];
                
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[i][j] = i;
                }
            }
            printDiagonally(matrix);
        } 
        
        //Problem 46.
        //return all unique pairs of integers that would add up to sum
        //Adding a pair class to return result
        {
			ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(100, 25, 25, 50, 10, 10, 75, 150, 140, 140));
			ArrayList<Pair> result = findUniquePair(aList, 150);
			for(int i=0; i<result.size(); i++) {
				System.out.println(result.get(i)._a+" "+result.get(i)._b);
			}
        }

		//Problem 47.
		//Sudoku Solver
		{
			int[][] input = new int[9][9];
			//for(int i=0; i<input.length; i++) {
				//for(int j=0; j<input[0].length; j++) {
				   // if(i == j) {
						//input[i][j] = 2;
					//}
				//}
			//}
			input[0][0] = 5;
			input[0][1] = 3;
			input[0][2] = 8;
			boolean boo = checkSudoku(input, 0, 8);
			if(boo == true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
	
		}
        {
            TreeNode root = new TreeNode(50);
            root._left = new TreeNode(25);
            root._right = new TreeNode(75);
            root._left._left = new TreeNode(12);
            root._left._right = new TreeNode(37);
            root._right._left = new TreeNode(67);
            root._right._right = new TreeNode(100);
            root._left._left._left = new TreeNode(6);
            root._left._left._right = new TreeNode(18);
            root._left._right._left = new TreeNode(30);
            root._left._right._right = new TreeNode(40);

            System.out.println(findSuccessor(root._left._left._right));
        }

        //Problem 49.
        //Find the subset of the array
        {
            printSubset(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        }

        //Problem 50.

        //Problem 51.
        //given an sorted array and a number, return the index with first occurance of that number
        {
            ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(0,1,1,1,1,2,2,3,3,3,4,4,5));
            int answer = findFirstOccurance(aList, 1);
            System.out.println("The answer is "+answer);
        }

        //Problem 52.
        //Given the phone number, print all the permutaion of string for the phone number

        //Problem 53.
        //Given the list of numbers, find the longest consecutive numbers 
        {
            //int[] arr = new int[10];
            //arr = {2,3,4,1,2,3,4,1,1,2};
            int[] arr = {2,3,4,1,2,3,4,1,1,2};
            findLongestConsecutive(arr);
        }

        //Problem 54.
        //Given the array of numbers, starting position and ending position, calculate and print the addition from the starting point to the ending point 
        {
            int[] arr = new int[] {2,3,4,1,2,3,4,1,1,2};
            printSum(arr, 2, 8);
        }

        //Problem 55.
        //Given an array with unique numbers, print the wave form of the number
        {
            int[] arr = new int[] {20, 40, 50, 60, 10, 30, 90};
            waveForm(arr);
        }

*/
        //Problem 57. 
        {
            int number  = zipNumbers(12345, 678);
            System.out.println(number);
        }
    }


    static class TreeNode {
        int _data;
        TreeNode _left;
        TreeNode _right;
        TreeNode _parent;

        public TreeNode(int data) {
           _data = data;
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
        //Math.log() returns a double
        if((int) Math.log10(input) + 1 != 1)
        {
            return sum(input%10)+(input%10);
        }
        else
            return input;
    }
    // -----------------------------------------------------------------------------------------
    // Problem 3. bubbleSort
    // Every pass, bubble out the biggest element to the right by swapping. 
    // Hence every pass we pass the one big elements to it right place. Stop when a element takes no swap.
    // Time Complexity: O(N ^ 2)
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

    //Recursive function for finding element in sorted array
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

    //Recursive 2.
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
    // Problem 5. find repeating character in a string
    // Can use HashMap or HashSet as lookup data structure
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
    // Get Word. Insert into HashMap if not present. If present print it.
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
    // Add Delimiter to HashMap or HashSet. 
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
    // Create a HashMap. Add item if difference of sum and current number is not in Map.
    // If present return it.
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
    // Same as previous problem. If element is present, add it to list and continue.
    // Finally return it.
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

    public static void add_Element_Twosumpair(int element, int index,  HashMap<Integer, ArrayList<Integer>> hmap) { 
        if(hmap.containsKey(element)) {
            //Learn:
            //Adding new index to the existing arraylist present inside hashmap
            //Accessing the hashmap values directly. It is not a good approach as it anyways iterate internally.
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
     //Error: This is kth largest number in the array
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
     //Problem 20. Delete the first given characters from a String
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

     // -----------------------------------------------------------------------------------------
     //Problem 24. Median of stream of numbers
     // -----------------------------------------------------------------------------------------

     public static int find_median(ArrayList<Integer> aList) {

        int a = 9;
        System.out.println(a/2);
         int result;
         if(aList.size() % 2 == 0) {
            result = median(aList, 2);
         }
         else {
            result = median(aList);
         }
         return result;   
     }

     public static int median(ArrayList<Integer> aList, int a) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
        for(int i=0; i<(aList.size()/2)+1; i++) {
            pq.add(aList.get(i));
        }
        for(int i=aList.size()/2+2; i<aList.size(); i++) {
            if(aList.get(i) <= pq.element()) {
                pq.remove();
                pq.add(aList.get(i));
            }
        }

        a = pq.remove();
        a += pq.remove();
        a = a/2;

        return a;
     }

     public static int median(ArrayList<Integer> aList) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
        for(int i=0; i<(aList.size()/2); i++) {
            System.out.println("Adding "+aList.get(i));
            pq.add(aList.get(i));
        }
        for(int i=aList.size()/2+1; i<aList.size(); i++) {
            if(aList.get(i) <= pq.element()) {
                pq.remove();
                System.out.println("Adding "+aList.get(i));
                pq.add(aList.get(i));
            }
        }
        return pq.remove();
     }


     // -----------------------------------------------------------------------------------------
     //Problem 25. Find sub-array that gives maximum sum
     // -----------------------------------------------------------------------------------------

     public static int find_maxsum_subarray(ArrayList<Integer> aList) {
        
        int total_max = 0;
        int current_max = 0;
        for(int i=0; i<aList.size(); i++) {
            current_max = max(aList.get(i), current_max + aList.get(i));
            total_max = max(total_max, current_max);
        }
        return total_max;
    }

    public static int max(int a, int b) {
        
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    // -----------------------------------------------------------------------------------------
    //Problem 26. Find the Missing number in the array 1 to n. Exactly one number is missing, and one number is duplicated twice.
    // -----------------------------------------------------------------------------------------

    public static int find_missing_num(ArrayList<Integer> aList) {
        
        int total = 0;
        int size = aList.size();
        int actual_total = (size * (size+1)) / 2;
        Set<Integer> set = new HashSet<> ();

        for(int i=0; i<size; i++) {
            if(!set.contains(aList.get(i))) {
                set.add(aList.get(i));
                total += aList.get(i);
            }
        }
        
        return actual_total - total;
    }

    // -----------------------------------------------------------------------------------------
    //Problem 27. Find Missing numbers in the array 1 to n.
    // -----------------------------------------------------------------------------------------

    public static void find_missing_numbers(ArrayList<Integer> aList) {

        int actual_size = aList.size() + 2;
        Set<Integer> set = new HashSet<> ();

        for(int i=1; i<=actual_size; i++) {
           set.add(i); 
        }

        for(int i=0; i<aList.size(); i++) {
            set.remove(aList.get(i));
        }

        System.out.println("The missing elements are : "+set);
    }

    // -----------------------------------------------------------------------------------------
    //Problem 28. Seperate even and odd numbers. Even first and odd second 
    // -----------------------------------------------------------------------------------------
    public static void seperate_evenodd(ArrayList<Integer> aList) {
        
    }

    public static void arraylist_swap(ArrayList<Integer> aList, int a, int b) {
        
        int temp = aList.get(a);
        aList.add(a, aList.get(b));
        aList.add(b, temp);
    }

    // -----------------------------------------------------------------------------------------
    //Problem 29: Find three numbers in a array that will add to a given sum
    // -----------------------------------------------------------------------------------------
    public static void three_sum(ArrayList<Integer> aList, int given_sum) {
        
        Collections.sort(aList);
        
        for(int i=0; i<aList.size()-2; i++) {
            int a = aList.get(i);
            for(int j=i+1, k=aList.size()-1; j<k; ) {
                int b = aList.get(j);
                int c = aList.get(k);

                if(a+b+c == given_sum) {
                    System.out.println("a :"+a+" b :"+b+" c :"+c);
                    return;
                }
                else if(a+b+c > given_sum) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        System.out.println("There are no elements present in the array that add up to the given sum");
    }

    // -----------------------------------------------------------------------------------------
    //Problem 30: Find number in rotated sorted array
    // -----------------------------------------------------------------------------------------
    public static void find_num_rotated_sortedarray(ArrayList<Integer> aList, int given_num) {
        
        int middle = aList.size()/2;
        int start = 0;
        int end = aList.size()-1;


        if(aList.get(start) < aList.get(middle)) {
            if(aList.get(start) <= given_num && aList.get(middle) >= given_num) {
                binarysearch_findnum(start, middle, aList, given_num);
            }
            else {
                binarysearch_findnum(middle, end, aList,  given_num);
            }
        }
        else {
            if(aList.get(middle) <= given_num && aList.get(end) >= given_num) {
                binarysearch_findnum(middle, end, aList, given_num);
            }
            else {
                binarysearch_findnum(start, middle, aList, given_num);
            }
        }
    }

    public static void binarysearch_findnum(int start, int end, ArrayList<Integer> aList, int given_num) {
        
        int middle = start + (end - start) / 2;
        
        if(start <= end) {
            if(aList.get(middle) == given_num) {
                System.out.println("In index: "+middle);
                return; 
            }
            else if(aList.get(middle) > given_num) {
                if(aList.get(start) <= given_num) {
                    binarysearch_findnum(start, middle-1, aList, given_num);
                }
                else {
                    binarysearch_findnum(middle+1, end, aList, given_num);
                }
            }
            else {
                if(aList.get(end) >= given_num) {
                    binarysearch_findnum(middle+1, end, aList, given_num);
                }
                else {
                    binarysearch_findnum(start, middle-1, aList, given_num);
                }
            }
        }

        return;
    }



    // -----------------------------------------------------------------------------------------
    //Problem 31. Find minimum number in rotated sorted array(with no duplicates) 
    // -----------------------------------------------------------------------------------------

    public static void find_min_rotated_sortedarray(ArrayList<Integer> aList) {

        int start = 0; 
        int end = aList.size()-1;
        int middle = start + (end - start) / 2;
        int smallest;

        if(aList.get(start) < aList.get(end)) {
            System.out.println("The minimum element is :"+aList.get(start));
        }
        else {
           if(aList.get(middle) > aList.get(end)) {
               smallest = aList.get(end);
               binarysearch_findmin(aList, middle+1, end, smallest);
           }
           else {
               smallest = aList.get(middle);
               binarysearch_findmin(aList, start, middle-1, smallest);
           }
        }
    }

    public static void binarysearch_findmin(ArrayList<Integer> aList, int start, int end, int small) {
        
        if(start <= end) {
            int mid = start + (end - start) / 2;

            if(aList.get(mid) < small) {
                small = aList.get(mid);
            }

            if(aList.get(mid) <= aList.get(end)) {
                binarysearch_findmin(aList, start, mid-1, small);
            }
            else {
                binarysearch_findmin(aList, mid+1, end, small);
            }
        }
        else {
            System.out.println("The smallest element is :"+small);
        }
    }

    // -----------------------------------------------------------------------------------------
    //Problem 32. Sort an array of 0's, 1's, 2's
    // -----------------------------------------------------------------------------------------

    public static void sort_zero_one_two(ArrayList<Integer> aList) {

        for(int zero=0, one=1, two=aList.size()-1; zero<aList.size() && one<aList.size() && two>=0; ) {
            
           // do(aList.get(zero) != 0) {
                if(aList.get(zero) == 1) {
                    Collections.swap(aList, zero, one);
                }
                else if(aList.get(zero) == 2) {
                    Collections.swap(aList, zero, two);
                    two--;
                }
            
            zero++;
            while(aList.get(one) != 1) {
               if(aList.get(one) == 2) {
                   Collections.swap(aList, one, two);
                   two--;
               }
           }
           one++;
        }

        for(int i : aList) {
            System.out.println(i);
        }
        
    }

    // -----------------------------------------------------------------------------------------
    //Problem 33. Given list of sorted distinct numbers. Find number with same index.
    // -----------------------------------------------------------------------------------------

    public static void findSameIndex(ArrayList<Integer> aList) {
        
        if(aList.size() == 0) {
            System.out.println("There are no elements in the list");
        }

        int start = 0;
        int end = aList.size() - 1; 
        boolean boo = false;

        while(start <= end) {
           int mid = start + ((end - start) / 2); 
            if(aList.get(mid) == mid) {
                System.out.println("The index and the element matched at :"+mid);
                boo = true;
                break;
            }
            else if(aList.get(mid) < mid) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(boo == false) {
            System.out.println("There are no elements present in the array that has number same as index");
        }

    }
   
    // -----------------------------------------------------------------------------------------
    //Problem 34. Stack Implementation
    // -----------------------------------------------------------------------------------------

    public static node node_push(int given_no, node head) {
        
        if(head == null) {
            head = new node(given_no);
            System.out.println("The element is inserted, the new head is "+head.data);
        }
        else {
            node new_node = new node(given_no);
            new_node.next = head;
            head = new_node;
            System.out.println("The element is inserted, the new head is "+head.data);
        }
        return head;
   }

   public static node node_pop(node head) {
    
        if(head == null) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The node "+head.data+" is popped");
            head = head.next;
        }
        return head;
   }

    // -----------------------------------------------------------------------------------------
    //Problem 35. find k nearest cluster in the group
    // -----------------------------------------------------------------------------------------
    
    public static void k_nearestCluster(cluster c, int k) {
        
        PriorityQueue<Double> pq = new PriorityQueue<>(k);
/*
        for(double i : c.hmap_distance.keySet()) {
            //System.out.println(i);
            pq.add(i);
        }

        for(int i=0; i<k; i++) {
            double my_k = pq.remove();
            point p = c.hmap_distance.get(my_k);
            System.out.println(p.x_axis+", "+p.y_axis);
        }
*/
    }

    // -----------------------------------------------------------------------------------------
    //Cracking coding interview
    //Problem 1.2
    //reverse a C-Style string
    // -----------------------------------------------------------------------------------------

    public static void reverseString(String str) {
        
        char[] ch = str.toCharArray();
        //ch[1] = '\u0000';
        int i = 0, j = str.length()-1;
        for(; i<j; i++,j--) {
            ch = swap_char(ch, i, j);
        }

        System.out.println("The string after reverse is :"+String.valueOf(ch));
    }

    public static char[] swap_char(char[] arr, int i, int j) {
        
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }


    // -----------------------------------------------------------------------------------------
    //Problem 1.3
    //remove duplicates in string without using buffer
    // -----------------------------------------------------------------------------------------

    public static void removeDuplicates(String str) {
        
        for(int i=str.length()-1; i>=0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(str.charAt(i) == str.charAt(j)) {
                   str = str.replace(str.charAt(i), '\0') + str.charAt(i); 
                }   
            }
        }
        System.out.println("The string is "+str);
    }


    // -----------------------------------------------------------------------------------------
    //Problem 1.4
    //find anagram
    // -----------------------------------------------------------------------------------------

    public static void findAnagram(String str1, String str2) {
        
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i=0; i<str1.length(); i++) {
            if(hmap.containsKey(str1.charAt(i))) {
                hmap.put(str1.charAt(i), hmap.get(str1.charAt(i)) + 1);
            }
            else {
                hmap.put(str1.charAt(i), 1);
            }
        }

        for(int i=0; i<str2.length(); i++) {
            if(hmap.containsKey(str2.charAt(i))) {
                if(hmap.get(str2.charAt(i)) != 0) {
                    hmap.put(str2.charAt(i), hmap.get(str2.charAt(i))-1);
                }
                else {
                    System.out.println("The string1 is not anagram of string2");
                    return;
                }
            }
            else {
                System.out.println("The string1 is not anagram of string2");
                return;
            }
        }
        System.out.println("The string1 is anagram of string2");
    }

    // -----------------------------------------------------------------------------------------
    // Given two sorted list, find kth largest number
    // assuming the elements in the array is positive
    //redo
    // -----------------------------------------------------------------------------------------

    public static int kHighest(ArrayList<Integer> aList1, ArrayList<Integer> aList2, int k) {
        
        int x = 0;
        int y = 0;

        if(k > aList1.size() + aList2.size() || k < 1) {
            System.out.println("check your inputs");
            return -1;
        }

        while(x+y < k-1) {
            if(x < aList1.size() && y < aList2.size()) {
                if(aList1.get(x) < aList2.get(y)) {
                    x++;
                }
                else {
                    y++;
                }
            }   
        }

        char full = 'z';
        if(x == aList1.size()) {
            x--;
            full = 'x';
        }
        else if(y == aList2.size()) {
            y--;
            full = 'y';
        }

        System.out.println("x value after while loop is "+x);
        System.out.println("y value after while loop is "+y);

        if(x+y == k-1) {
            System.out.println("Entered = array");
            if(x<aList1.size() && y<aList2.size()) {
                if(aList1.get(x) < aList2.get(y)) {
                    return aList1.get(x);
                }
                else {
                    return aList2.get(y);
                }
            }
        }
        else if(full == 'x') {
            System.out.println("Entered y array");
            while(x+y < k) {
               y++; 
            }
            return aList2.get(y);
        }
        else {
            System.out.println("Entered x array");
            while(x+y < k) {
                x++;
            }
        }

            return aList1.get(x);
    }
    

    //Problem 40.
    //Given Array of positive integers, a number is duplicated, find the dupplicated in O(n) time and O(1) space
    //the elements in the array is not greater than the size of the array
    public static int findFirstDuplicate(ArrayList<Integer> aList) {
            
        int arrSize = aList.size()-1;

        for(int i=0; i<aList.size(); i++) {
            
            if(aList.get(Math.abs(aList.get(i))) > 0) {
                    
                aList.set(Math.abs(aList.get(i)), -aList.get(Math.abs(aList.get(i))));

            }   
            else {
                return Math.abs(aList.get(i));
            }   
        }   
        return -1;
    }   

    //Problem 41. 
    //Given an int, print the number with no repeating digits

    public static void printUniqueDigits(int input) {
		
		HashSet<Integer> hSet  = new HashSet<>();

		int p = 0;
		int num = 0;

		while(input  != 0) {
			int mod = input % 10;
			input = input / 10;
				if(! hSet.contains(mod)) {
					num += mod * Math.pow(10, p);
					hSet.add(mod);
					p++;
				}
		} 

		System.out.println(num);
    }


    //Problem 42.
    //Given an array, find the majority element in the list 
		
    public static int findMajorityElement (ArrayList<Integer> aList) {
			
		int prev = aList.get(0);
		int repeat = 0;
		int temp = aList.get(0);
			
			for(int i=1; i<aList.size(); i++) {
				if(aList.get(i) == prev) {
					repeat++;
				}
				else {
					if(repeat == 0) {
						prev = aList.get(i);
							repeat = 0;		
					}
					else {
						repeat--;
						temp = aList.get(i);
					}
				}
			}
			return prev;
    }

    //Problem 43.
    //Given an stream of numbers as an array, find the median of stream of number
    
    public static void findMedian(ArrayList<Integer> aList) {
        
        if(aList.isEmpty()) {
            System.out.println("The list is empty");
        }

        PriorityQueue<Integer> smallQueue = new PriorityQueue<> (Collections.reverseOrder());
        PriorityQueue<Integer> bigQueue = new PriorityQueue<> ();

        smallQueue.add(aList.get(0));

        for(int i=1; i<aList.size(); i++) {
            if(aList.get(i) < smallQueue.element()) {
                smallQueue.add(aList.get(i));
            }
            else {
                bigQueue.add(aList.get(i));
            }

            if(Math.abs(smallQueue.size() - bigQueue.size()) == 2) {
                if(smallQueue.size() > bigQueue.size()) {
                    int element = smallQueue.remove();
                    bigQueue.add(element);
                }
                else {
                    int element = bigQueue.remove();
                    smallQueue.add(element);
                }
            }
            printMedian(smallQueue, bigQueue);
        }
    }

    public static void printMedian(PriorityQueue<Integer> smallQueue, PriorityQueue<Integer> bigQueue) {
        
        if(Math.abs(smallQueue.size() - bigQueue.size()) == 1) {
            if(bigQueue.size() > smallQueue.size()) {
                System.out.println(bigQueue.element());
            }
            else {
                System.out.println(smallQueue.element());
            }
        }
        else if(smallQueue.size() == bigQueue.size()) {
            int res = (smallQueue.element() + bigQueue.element() ) / 2;
            System.out.println(res);
        }
        
    }

    //check if array is unique or not using Bit Manipulation
    //Only 32 bits are in a integer, so this method works only for number upto 16
    //We can use long, yet the number ranges from -32 to 32, and 1 bit for sign

    public static void findUniqueBitManipulation(ArrayList<Integer> aList) {

        int k = 0;

        for(int i=0; i<aList.size(); i++) {
            int j = 1;
            j = j<<aList.get(i);
            System.out.println("The j value is "+j);
            int and = j & k;
            if(and == 0) {
                k = k | j;
            }
            else {
                System.out.println("The given array is not unique");
                return;
            }
        }
        System.out.println("Unique");
    
    }

    //Problem 45.
    //Print matrix diagonally
    public static void printDiagonally(int[][] matrix) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0, k=i; j<=i; j++,k--) {
                if(j<0) {
                    break;
                }
                System.out.print(matrix[k][j]);
            }
            System.out.println();
        }
        
        for(int j=1; j<matrix[0].length; j++) {
            for(int i=matrix.length-1, k=j; k<=matrix[0].length; i--,k++) {
                if(k>=matrix[0].length) {
                    break;
                }
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }
                    
    }

    //Problem 46.
    //return all unique pairs of integers that would add up to sum
    //Adding a pair class to return result

    public static ArrayList<Pair> findUniquePair(ArrayList<Integer> aList, int k) 
    {
        HashSet<Integer> hSet = new HashSet<>();
        ArrayList<Pair> result = new ArrayList<>();

        for(int i=0; i<aList.size(); i++) 
        {
            if(hSet.contains(k - aList.get(i)))
            {	
                if(!hSet.contains(aList.get(i)))
                {
                    result.add(new Pair(aList.get(i), k-aList.get(i)));
                }	
            }
            if(!hSet.contains(aList.get(i))) 
            {
                hSet.add(aList.get(i));
            }
        }
        return result;
    }
    
    //Problem 47.
    //Sudoku Solver

    public static boolean checkSudoku(int[][] matrix, int stIndex, int eIndex) {
   
        ArrayList<Integer> listOfPossible = new ArrayList<>();
        for(int i=stIndex; i<matrix.length; i++){
            for(int j=eIndex; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    listOfPossible = findListPossible(matrix, i, j);
                    if(listOfPossible.isEmpty()) {
                        return false;
                    }
                    
                    for(int k=0; k<listOfPossible.size(); k++) {
                        matrix[stIndex][eIndex] = listOfPossible.get(k);
                        return checkSudoku(matrix, i+1, j+1);
                    }	   
                }
            }
        }
        return true;
    }

    public static ArrayList<Integer> findListPossible(int[][] matrix, int i, int j) {
   
        HashSet<Integer> numPresent = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
   
        for(int x=i, y=0; y<matrix.length; y++) {
            if(matrix[x][y] != 0) {
                //System.out.println("1.check"+x);
                numPresent.add(matrix[x][y]);
            }
        }
   
        for(int y=j, x=0; x<matrix.length; x++) {
            if(matrix[x][y] != 0) {
                //System.out.println("2.check"+y);
                numPresent.add(matrix[x][y]);
            }
        }
   
        int row = i - (i % 3);
        int col = j - (j % 3);
   
        for(int x=row; x<=row+2; x++) {
            for(int y=col; y<=col+2; y++) {
                if(matrix[x][y] != 0) {
                    //System.out.println("3.check"+x+""+y);
                    numPresent.add(matrix[x][y]);
                }
            }
        }
        for(int z=0; z<9; z++){
            if(!numPresent.contains(i)) {
                result.add(z);
            }
        }
        /*for(int list : result) {
            System.out.println(list);
        }
        */
        return result;
    }

    //Problem 48.
    //Find the successor of the node, ---given the node---
    public static int findSuccessor(TreeNode givenNode) {
        
        if(givenNode._right != null) {
            return givenNode._right._data;
        }
        else {
            return findParentSuccessor(givenNode._parent, givenNode._data);
        }
    }

    public static int findParentSuccessor(TreeNode node, int targetData) {
        
        if(node != null) {
            if(node._data > targetData) {
                return node._data;
            }   
        }
        if(node._parent != null) {
            findParentSuccessor(node._parent, targetData);
        }
        return -1;
    }

    //Problem 49.
    //Find the subset of the array

    static void printSubset(ArrayList<Integer> aList) {
        
        for(int i=0; i<Math.pow(2, aList.size()); i++) {
            for(int j=0; j<Math.log(i)/Math.log(2)+1; j++) {
                int k = 1 << j;
                k = k & i;
                if(k != 0) {
                    System.out.print(aList.get(j));
                }
            }
            System.out.println();
        }
    }

    //Problem 50.
    //Given two list, find the number that is not present in both the list
    //Add code

    //Problem 51.
    //given an array and a number, find the first occurance of the number

    static int findFirstOccurance(ArrayList<Integer> aList, int num) {
        
        if(aList == null || aList.isEmpty()) {
            return -1;
        }

        int start = 0; 
        int end = aList.size()-1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(aList.get(mid) == num) {
                if(mid == 0 || aList.get(mid-1) != num) {
                    return mid;
                }
                else {
                    end = mid - 1;
                }
            }   
            else if(aList.get(mid) < num) {
                start = mid + 1;
            }
            else if(aList.get(mid) > num) {
                end = mid - 1;
            }
        }

        return -1;
    }   

    //Problem 52.
    //Given the phone number, print all the permutaion of string for the phone number
    static void printPermutation(String phoneNumber) {
        
        if(phoneNumber == null || phoneNumber.length() == 0) {
            return;
        }
        else {
            ArrayList<Character> result = new ArrayList<>();
            doPermutation(phoneNumber, 0, result);
        }
    }

    static void doPermutation(String phoneNo, int position, ArrayList<Character> result) {
        
        if(phoneNo.length() == position) {
            System.out.println(result.toString());
            return;
        }
        
        int digit = Character.getNumericValue(phoneNo.charAt(position));
        PhoneNumber obj = new PhoneNumber();

        for(int j=0; j<obj.phoneMap.get(digit).length(); j++) {
            String value = obj.phoneMap.get(digit);
            char c = value.charAt(j);
            result.add(new Character(c));
            doPermutation(phoneNo, position+1, result);
            result.remove(result.size()-1);
        }
    }

    //Problem 53.
    //Given the list of numbers, find the longest consecutive numbers 
    static void findLongestConsecutive(int[] array) {

        if(array.length == 0 || array.length == 1) {
            return;
        }

        int permI = 0;
        int permJ = 0;
        int count = 0;
        int tempI = 0;
        int tempJ = 0;

        for(int i=0, j=1; j<array.length; i++, j++) {
            if(array[j]-array[i] == 1) {
                if(tempI == 0) {
                    tempI = i;
                    tempJ = j;
                }
                else {
                    tempJ++;
                }
                count--;
            }
            else if(tempI != 0 && count <= 0) {
                    permI = tempI;
                    permJ = tempJ;
                    count = permJ - permI;
                    tempI = 0;
                    tempJ = 0;
            }
        }

        System.out.println("The starting index of consecutive numbers :"+permI);
        System.out.println("The ending index of consecutive numbers :"+permJ);
}


    //Problem 54.
    //Given the array of numbers, starting position and ending position, calculate and print the addition from the starting point to the ending point 
    static void printSum(int[] arr, int start, int end) {
        CreateSum obj = new CreateSum(arr);

        int stValue = obj._arr[start-1];
        int endValue = obj._arr[end];

        int result = endValue - stValue;
        System.out.println("The sum is "+result);
    }    

    //Problem 55.
    //Given an array with unique numbers, print the wave form of the number
    static void waveForm(int[] arr) {
        
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i]; 
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            i++;
            if(arr[i] < arr[i+1]) {
                int temp = arr[i]; 
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }
    
    //Problem 56. Given the sorted array, find just bigger to a element k, k can or cannot be present in the array
    static int justBigger(int[] arr, int k) {
        
        if(arr.length == 0 || arr[end] <= k) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            mid = start + (start-end) / 2;

            if(arr[mid] > k) {
                if(arr[mid-1] <= k) {
                    return mid;
                }
                end = mid - 1;
            }
            else if(arr[mid] <= k) {
                if(arr[mid+1] > k) {
                    return mid+1;
                }
                start = mid + 1;
            }
        }
    }

    //Problem 57. Given two numbers, zip it. If it exceeds 100000000 return -1 
    static int zipNumbers(int a, int b) {
        
        int result = 0;

        while (a > 0 || b > 0) {

            int digits;
            int division;
            int num;

            if(a > 0) {
                digits = Math.log(a) / Math.log(10) + 1;
                division = 1;
                for(int i=0; i<digits; i++) {
                    division = division * 10;
                }
                num = a / division;
                a = a - division;
                System.out.println("a: "+a);

                result = (result * 10) + num;
            }

            if (b > 0) {
                digits = Math.log(b) / Math.log(10) + 1;
                division = 1;
                for(int i=0; i<digits; i++) {
                    division = division * 10;
                }
                num = b / division;
                b = b - division;
                System.out.println("b: "+b);

                result = (result * 10) + num;

            }
        }

        return result;
    }   

    //Problem 58. Find minimum number of flights needed
    /* 
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int arr[] = new int[] {900, 940, 950, 1100, 1500, 1800};
            int dep[] = new int[] {910, 1200, 1120, 1130, 1900, 2000};
            int flights = 6;
            int result = findMinGates(arr, dep, flights);
            System.out.println(result);
        }
    }
    */
    
    static int findMinGates(int[] arrivals, int[] departures, int flights) {
    
        int entry = 0;
        int exit = 0;
        int result = 0;
        int noOfGates = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(flights);
        
        for(int i=0; i<flights; i++) {
            heap.add(departures[i]);
        }
        
        while(entry < flights) {
            
            if(arrivals[entry] < heap.element()) {
                System.out.println("arrivals: "+arrivals[entry]);
                System.out.println("arrivals: "+heap.element());
                noOfGates++;
                entry++;
                if(result < noOfGates) {
                    System.out.println("No of Gates: "+result);
                    result = noOfGates;
                }
            }
            else {
                heap.remove();
                noOfGates--;
            }
        }
        return result;
    }

    //Problem 59. Given Matrix, find biggest island 

    static int bigIsland(int[][] matrix) {
        
        //Is it possible
        if(martrix.length == 0) {
            return 0;
        }

        int answer = 0;
        
        for(int i=0; i<martix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    int res = findBigRecursion(matrix, i, j, 0);
                    if(res > answer) {
                        answer = res;
                    }
                }
            }
        }
        return answer;
    }

    static int findBigRecursion(int[][] matrix, int i, int j, int count) {

        count++;

        if(i>0 && matrix[i-1][j] == 1) {
            matrix[i-1][j] = 2;
            count = findBigRecursion(matrix, i-1, j, count);
        }
        if(j>0 && matrix[i][j-1] == 1) {
            matrix[i][j-1] = 2;
            count = findBigRecursion(matrix, i, j-1, count);
        }
        if(i<matrix.length && matrix[i+1][j] == 1) {
            matrix[i+1][j] = 2;
            count = findBigRecursion(matrix, i+1, j, count);
        }
        if(j<matrix[0].length && matrix[i][j+1] == 1) {
            matrix[i][j+1] = 2;
            count = findBigRecursion(matrix, i, j+1, count);
        }

        return count;
    }

    //Problem 60. Given number, check if it is invertable.
    static boolean invertableNumber(int num) {
        
        String strNumber = String.valueOf(num);

        HashMap<Character, Character> hmap = new HashMap<>();
        hmap.put('1','1');
        hmap.put('2','5');
        hmap.put('5','2');
        hmap.put('6','9');
        hmap.put('8','8');
        hmap.put('9','6');

        for(int i=0, j=strNumber.length()-1; i<strNumber.length()/2; i++, j--) {
            if(hmap.containsKey(strNumber.charAt(i))) {
               if(!(hmap.get(strNumber.charAt(i)) == strNumber.charAt(j))) {
                    return false;
               }
            }
            else {
                return false;
            }
        }
        return true;
    }

    //Problem 61. Given array of unknown size and number, find number in array without using length function

    //Problem 62. Given a string of numbers in words, return its number.
    static int strWordsToNumber(String words) {
        
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("one", 1);
        hmap.put("two", 2);
        hmap.put("three", 3);
        hmap.put("four", 4);
        hmap.put("five", 5);
        hmap.put("six", 6);
        hmap.put("seven", 7);
        hmap.put("eight", 8);
        hmap.put("nine", 9);
        hmap.put("zero", 0);

        String[] numWords = words.split(" ");
        
        int multiplier = 10;
        int number = hmap.get(numWords[0]);

        for(int i=1; i<numWords.length; i++) {
            number = (number * multiplier) + hmap.get(numWords[i]);
        }
        return number;
    }

    //Problem 63. Multiply two very large numbers represented in the form of string

    //Problem 64. Generalized abbreviation of String Eg: word, O/p: word, 1ord, w1rd, wo1d, wor1, 2rd, w2d, wo2, 1o1d, 1or1, w1r1, 1o2, 2r1, 3d, w3, 4
	static void printAbbreviation(String givenWord) {
        
        ArrayList<Integer> aList = new ArrayList<>();

        abbreviationRecursion(givenWord, aList);
    }

    static void abbreviationRecursion(String theWord, ArrayList<Integer> aList) {
        
/*        if(aList != null && aList.size() == theWord.length()) {
            System.out.println(theWord.length() + 1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        if(aList.size() == 0) {
           System.out.println(theWord); 
           aList.add(0);
           abbreviationRecursion(theWord, aList);
        }
        else {
            String result = appendOne(theWord, arrayList);
            result = addOne(result);
            System.out.println(result);
            if(aList.size() == 1) {
                if(aList.get(0) < theWord.length()) {
                    aList.add(aList.get(0) + 1);
                }
                else
            }
        }
*/        
    }

    //Problem 65. Reverse the binary bits in the integer
    static int reverseBits(int number) {
        
        if(number == 0) {
            return 0;
        }

        int result = 0;

        while(number != 1) {
            if((number % 2) == 0) {
                number /= 2;
                result *= 2;
            }
            else if((number % 2) == 1) {
                number /= 2;
                result *= 2;
                result += 1;
            }
        }
        result = (result * 2) + 1;
        return result;
    }

    //Problem 66. Given a string on 1s and 0s with ?s in between, replace all ?s with 1 or 0 and print all such combinations    
    //yet to complete
	static void printQuestionWithZeroOne(String numberStr) {
		
		if(numberStr == null) {
            System.out.println("Not a valid String");
            return;
		}
        
        StringBuilder strBuilder = new StringBuilder();

        for(int i=0; i<numberStr.length(); i++) {
            strBuilder.append(numberStr.charAt(i));
        }

		printRecursionQuestionMark(strBuilder, 0);
			
    }

    static void printRecursionQuestionMark(StringBuilder strBuilder, int position) {
        
        if(position >= strBuilder.length()) {
            System.out.println(strBuilder.toString());
            return;
        }

        for(int i=position; i<strBuilder.length(); i++) {
            if(strBuilder.charAt(i) == '?') {

                strBuilder = strBuilder.replace(i, i, 0);
                printRecursionQuestionmark(strBuilder, i+1);

                strBuilder = strBuilder.replace(i, i, 1);
                printRecursionQuestionmark(strBuilder, i+1);
            }
        }
    }

    //Problem 67. find the element in the sorted matrix
    static point findInSortedMatrix(int[][] matrix) {
        
        return recursiveSortedMatrix(matrix, matrix.length, matrix[0].length);
    }

    static point recursiveSortedMatrix(int[][] matrix, int row, int col) {
        pair mid = new pair(row/2, col/2);

        if(matrix[mid._a][mid._b] == number) {
            return mid;
        }
        else if(


    }
}

