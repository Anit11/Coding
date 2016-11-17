public class reducingFraction {
    public static void main(String args[]) {

        String inp_arr[] = {"54/24", "24/54", "6/8", "8/2"};
        String answer[];

        answer = reduce_fraction(inp_arr);

        for(String i: answer) {
            System.out.println(i);
        }
    }

    public static String[] reduce_fraction(String[] input) {
        
        
        for(int i=0; i<input.length; i++) {

            int[] inp_arr = remove_delimiter(input[i], "/");

            int gcd = find_gcd(inp_arr[0], inp_arr[1]);

            inp_arr[0] = inp_arr[0] / gcd;
            inp_arr[1] = inp_arr[1] / gcd;

            input[i] = String.valueOf(inp_arr[0] + "/" + inp_arr[1]);
        }

        return input;
    }

    //String splits with delimiter, store it in string array and converts string array to int array
    //returns int array
    public static int[] remove_delimiter(String input, String delim) {
        
        String[] str = input.split(delim);

        int[] res = new int[2];

        for(int i=0; i<str.length; i++) {
            res[i] = Integer.parseInt(str[i]);
        }

        return res;
    }
    
    //Standard routine for gcd
    public static int find_gcd(int a, int b) {
        
        if(0 == b) {
            return a;
        }
        else {
            return find_gcd(b, a%b);
        }
    }
}
