public class zipNum {

        public static void main(String[] args) {
            int result = zipNumbers(185679, 234);
            System.out.println(result);
        }

        static int zipNumbers(int a, int b) {
            
            int result = 0;

            while (a > 0 || b > 0) {

                if(a > 0) {
                    int div = getDivision(a);
                    int num = a / div;
                    a = a - (num * div);
                    result = (result * 10) + num;
                }

                if (b > 0) {
                    int div = getDivision(b); 
                    int num = b / div;
                    b = b - (num * div);
                    result = (result * 10) + num;
 
                }
            }

            if(result <= 100000000) {

                return result;
            }
            return -1;

        }   

        static int getDivision(int num) {

                    int digits = (int) (Math.log(num) / Math.log(10)) + 1;
                    int division = 1;

                    for(int i=1; i<digits; i++) {
                        division = division * 10;
                    }

                    return division;
        }
}
