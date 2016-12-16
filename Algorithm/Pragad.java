import java.io.*;
import java.util.*;

public class Pragad
{
    public static void printMatrixDiagonally(int[][] twoDMat)
    {

    }

    public static void printLadderPaths(int numSteps, String path)
    {
        if (numSteps == 0)
        {
            System.out.println(path);
        }

        if (numSteps >= 1)
        {
            path  += '1';
            printLadderPaths(numSteps - 1, path);
        }

        if (numSteps >= 1)
        {
            path  += '1';
            printLadderPaths(numSteps - 1, path);
        }

        if (numSteps >= 2)
        {
            path  += '2';
            printLadderPaths(numSteps - 1, path);
        }
    }

    public static void main(String[] args)
    {
        int [][] twoDMat = new int[5][3];
        
        printLadderPaths(4);
    }
}
