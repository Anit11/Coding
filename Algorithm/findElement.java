import java.util.*;
import java.io.*;

public class findElement {

    int counter = 0;

    public static void main(String args[]) {
        int num;
        //int lSiz;
        //int sSiz;
        //int mid;

        System.out.println("Enter the numbers to store and press any alphabet to stop");
        ArrayList<Integer> aList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        findElement obj = new findElement();
        while(sc.hasNextInt()) {
            aList.add(sc.nextInt());
        }
        String a = sc.next();

        System.out.println("Enter the number to find");
        
        num = sc.nextInt();
//        lSiz = (int)(Math.floor(aList.size()));
//        lSiz = (aList.size())-1;
//        mid = (aList.size()-1)/2;
//        sSiz = 0;

        int start = 0;
        int end = aList.size() - 1;
//        boolean answer = obj.getElement(aList, num);
        //boolean answer = obj.getElementRecursive(aList, num, start, end);
        boolean answer = obj.getElementRecursive2(aList, num, start, end);
        obj.printfinal(answer);
}


    public boolean getElement(ArrayList<Integer> aList, int num) {
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

    public void printfinal(boolean ans) {
        if(ans == false)
        {
            System.out.println("The number is not in the list");
        }
    }

    public boolean getElementRecursive(ArrayList<Integer> aList, int num, int start, int end) {
        
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

    public boolean getElementRecursive2(ArrayList<Integer> aList, int num, int start, int end) {
        
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
}

