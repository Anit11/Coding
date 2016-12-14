import java.util.*;

public class QuickSort {
    public static void main(String args[]) {
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(5,3,7,2,4,8,9,1));
        quickSort(aList, 0, aList.size() - 1);
        for(int i : aList) {
            System.out.println(i);
        }
    }

    public static void quickSort(ArrayList<Integer> aList, int startIndex, int endIndex) {

        if (endIndex - startIndex > 1)
        {
            int pivot = partition(aList, startIndex, endIndex);

            quickSort(aList, startIndex, pivot - 1);
            quickSort(aList, pivot + 1, endIndex);
        }
    }

    public static int partition(ArrayList<Integer> aList, int sIndex, int eIndex) {
        
        int pivot = aList.get(sIndex);
        sIndex++;

        while(sIndex < eIndex) {
           if(aList.get(sIndex) > pivot && aList.get(eIndex) < pivot) {
               int temp = aList.get(sIndex);
               aList.set(sIndex, aList.get(eIndex));
               aList.set(eIndex, temp);
               sIndex++;
               eIndex--;
           }
           else if(aList.get(sIndex) < pivot) {
               sIndex++;
           }
           else if(aList.get(eIndex) > pivot) {
               eIndex--;
           }
        }

        if(aList.get(eIndex) < pivot) {
            aList.set(0, aList.get(eIndex)); 
            aList.set(eIndex, pivot);
        }
        return eIndex;

    }
}
