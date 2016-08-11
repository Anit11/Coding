import java.util.*;

public class RoundOffCheck
{
    public static void main(String args[])
    {
        double[] num = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result = 0;
        long a = 20/3;
        System.out.println("Test: "+a);
        
        for(int i=0; i<num.length; i++)
        {
            result = result + num[i];
        }

        System.out.println(result);
    }
}
        



