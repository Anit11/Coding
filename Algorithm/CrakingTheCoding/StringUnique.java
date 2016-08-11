import java.util.*;
import java.lang.*;

public class StringUnique
{
    public static int Unique(String st)
    {
        for(int i = 0; i<st.length(); i++)
        {
            System.out.println("1. i = "+i);
            for(int j = 0; j != i; j++)
            {
                System.out.println("2. j = "+j);
                if(st.charAt(i) == st.charAt(j))
                {
                    System.out.println(st.charAt(i));
                    System.out.println(st.charAt(j));

                    System.out.println("It is not Unique");
                    return 0;
                }
            }
        }
        System.out.println("It is Unique");
        return 1;
    }

    public static void main(String args[])
    {
        String s = "anithe";
        int res = Unique(s);
        if(res == 0)
        {
            System.out.println("False");
        }
        else if(res == 1)
        {
            System.out.println("True");
        }
        System.out.println("THE END");
    }
}
            



