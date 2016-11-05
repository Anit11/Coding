import java.util.*;
import java.io.*;

public class findInRotatedArray {

    public static void main(String args[]) throws Exception {
        int pair;
        int sum;
        int num;
        String ans;
        System.out.println("Enter the array of numbers in sorted order: ");
        ArrayList<Integer> ar = new ArrayList<Integer>();
        rotateArraylist ral = new rotateArraylist();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            ar.add(sc.nextInt());
        }
        String option = sc.next();
        System.out.println("Do you want to rotate array, please press yes");
        option = sc.next();

        if(option.equals("yes")) {
            ar = ral.rotateArray(ar);
        }

        /* 
        System.out.println("You can find pair that add to your sum ");
        System.out.println("Please type your sum: ");
        sum = sc.nextInt();

        findSumPair fp = new findSumPair();
        pair = fp.findPair(ar, sum);

        System.out.println("Elements after rotation");
        for(int i=0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }*/

        System.out.println("Enter the number to be found: ");
        num = sc.nextInt();
        findNumber fn = new findNumber();
        ans = fn.findNum(ar, num);

        if(ans.charAt(0) == 'y') {
            System.out.println("The number is present in the list in the position below");
            for(int i=1; i<ans.length; i++) {
                System.out.print(ans.charAt(i));
            }
        }
        else {
            System.out.println("The number you entered is not found in the list");
        }

        
    }

}
