import java.util.*;

public class finalDiscountedPrice {
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> price = new ArrayList<>(Arrays.asList(5,1,3,4,6,2));
        ArrayList<Integer> discount_price = find_discount(n, price);
        int final_price = add_price(price, discount_price);
        ArrayList<Integer> zero_discount = find_zero_discount(discount_price);
        System.out.println("The discounts are : "+discount_price);
        System.out.println("The final price is : "+final_price);
        System.out.println("The zero discount index is :");
        System.out.println(zero_discount);
    }

    public static ArrayList<Integer> find_zero_discount(ArrayList<Integer> discount) {
        
        ArrayList<Integer> index = new ArrayList<> ();

        for(int i=0; i<discount.size(); i++) {
            if(0 == discount.get(i)) {
                index.add(i); 
            }
        }

        return index;
    }

    public static int add_price(ArrayList<Integer> price, ArrayList<Integer> discount) {
        int total = 0;

        for(int i=0; i<price.size(); i++) {
            total += price.get(i) - discount.get(i);
        }

        return total;
    }

    public static ArrayList<Integer>find_discount(int total, ArrayList<Integer> price) {

        ArrayList<Integer> discount = new ArrayList<> ();

        for (int i=0; i<price.size(); i++) {
            discount.add(min_distance(price, i)); 
        }

        return discount;
    }

    public static int min_distance(ArrayList<Integer> aList, int index) {

        int curr_element = aList.get(index);

        index++;

        for (int i=index; i<aList.size(); i++) {
            if(aList.get(i) <= curr_element) {
                return aList.get(i);
            }
        }
        return 0;
    }


}
