//practice file
import java.util.*;

public class binarySearch {
    public static void binarySearchRecursion(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size()-1;
        
//        int index = recursion(list, target, start, end);
        int index = binaryIteration(list, target, start, end);
        if(index >= 0) {
            System.out.println("The element is present, the index is : "+index);
        }
        else {
            System.out.println("The element is not present");
        }
    }

    public static int recursion(ArrayList<Integer> aList, int targetNumber, int startIndex, int endIndex) {

        if(startIndex > endIndex) {
            return -1;
        }

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if(aList.get(midIndex) == targetNumber) {
            return midIndex;
        }
        else if(aList.get(midIndex) < targetNumber) {
            return recursion(aList, targetNumber, midIndex + 1, endIndex);
        }
        else {
            return recursion(aList, targetNumber, startIndex, midIndex - 1);
        }
    }

    public static int binaryIteration(ArrayList<Integer> aList, int targetNum, int startIndex, int endIndex) {
        
        if(aList == null) {
            return -1;
        }

        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(aList.get(midIndex) == targetNum) {
                return midIndex;
            }
            else if(aList.get(midIndex) > targetNum) {
                endIndex = midIndex - 1;
            }
            else {
                startIndex = midIndex + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        binarySearchRecursion(aList, 7);
        binarySearchRecursion(aList, 0);
        binarySearchRecursion(aList, 1);
        binarySearchRecursion(aList, 2);
        binarySearchRecursion(aList, 3);
        binarySearchRecursion(aList, 4);
        binarySearchRecursion(aList, 5);
//        binarySearchIteration(aList, 4);
    }
}
