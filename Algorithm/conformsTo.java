import java.util.*;

public class conformsTo {
    public static void main(String[] args) {
        int numberOfZeros = findZeros(8);    
        int copyOfZeros = findNumFromZeros(numberOfZeros);
        HashSet<Integer> numberConforms = new HashSet<>();
        findNumberConforms(8, copyOfZeros, numberConforms);
        findNumberConforms(9, copyOfZeros, numberConforms);
        findNumberConforms(10, copyOfZeros, numberConforms);
        System.out.println(numberConforms.size());
    }


    static int findZeros(int num) {
        
        int highBitSet = (int) (Math.log(num) / Math.log(2)) + 1;
        int count = 0;

        for(int i=0; i<highBitSet; i++) {
            int k = 1;
            k = k<<i;
            int result = num | k;

            if(result != num) {
                count++;
            }
        }
        return count;
    }

    static int findNumFromZeros(int numOfZeros) {
        
        int count = 0;

        for(int i=1; (int)(Math.log(i) / Math.log(2))+1 <= numOfZeros; i++) {
            count++;
        }

        return count;
    }

    static void findNumberConforms(int number, int limitOfZeros, HashSet<Integer> hset) {
        
        for(int i=1; i<limitOfZeros; i++) {
            for(int j=0; j<(int)(Math.log(i)/Math.log(2))+1; j++) {
                    int counter = (int)(Math.log(i)/Math.log(2))+1;
                    int x = 1;
                    int inc = 0;
                    while(counter > 0) {
                        x = x<<inc;
                        int newNumber = number | x;
                        if(! (number == newNumber)) {
                          hset.add(number | x);  
                          counter--;
                        }
                        inc++;
                    }
                }
            }
        }

}
