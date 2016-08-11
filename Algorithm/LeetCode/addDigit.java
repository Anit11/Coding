import java.util.*;
import java.io.*;

public class addDigit
{
    public static void main(String[] args)
    {
        System.out.println("Sum your digits");
        System.out.println("Enter your digit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = sum(number);
        System.out.println("Answer is "+result);
    }

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
}
