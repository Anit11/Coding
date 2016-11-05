import java.util.*;

/*ToL: 
  1. int[] arr is declared, so when you use next time you should use as 'arr' not '     arr[]', unless and until you want specific position in array.

  2. Scanner is in package 'util'

  3. Static array and static variable inside class are considered as global.
     So, all the methods can use it and the changes made into it can be
     seen everywhere in the class.
     SCOPE IS GLOBAL to class.
 */

public class bubblesort
{
    static int[] arr;
    static int length;

    public static void main(String[] args)
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
}
