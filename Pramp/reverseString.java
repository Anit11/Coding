public class reverseString{
   public static void main(String[] args) {
      String pramp = "   Practice .  Makes ,  Perfect  ";
      String result = reverse_words(pramp);
      System.out.println(result);
   }
   
   public static String reverse_words(String input) {
      
      StringBuilder sb = new StringBuilder();
      int end = input.length();
      
      for(int i=input.length()-1; i>=0; i--) {
         if(input.charAt(i) == ' ') {
             sb.append(input.substring(i+1, end)); 
             sb.append(" ");
             end = i;
         }
      }

      
      sb.append(input.substring(0, end));
      String result = sb.toString();
      return result;
   }
}
