/*
 Maximum distance between two occurrences of same element in array
 Given an array with repeated elements, the task is to find the maximum distance two occurrences of an element.

 Examples:
 Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
 Output: 10
   maximum distance for 2 is 11-1 = 10 
   maximum distance for 1 is 4-2 = 2 
   maximum distance for 4 is 10-5 = 5 *
*/

import java.util.*;

class ItemDetails
{
  int min;
  int max;
  public ItemDetails(int element)
  {
    min = element;
    max = element;
  }
}

class MaximumDistanceTwoOccurances
{
  private static int maximumDistance(int[] input)
  {
    int maxDistance = 0;
    HashMap<Integer, ItemDetails> hmap = new HashMap<>();

    for(int i = 0; i < input.length; i++)
    {
      if (hmap.containsKey(input[i]))
      {
        ItemDetails obj = hmap.get(input[i]);
        obj.max = i;
        int distance = obj.max - obj.min;

        if (maxDistance < distance)
        {
          maxDistance = distance;
        }
      }
      else
      {
        hmap.put(input[i], new ItemDetails(i));
      }
    }
    return maxDistance;
  }

  public static void main(String[] args)
  {
    int[] input = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2, 3};
    int output = maximumDistance(input);
    System.out.println("The maximum distance between two occurances is/are "+output);
  }
}
