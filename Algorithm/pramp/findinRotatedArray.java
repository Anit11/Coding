Class Pramp {
   public static void main(String[] args) {
      
      ArrayList<Integer> aList = new ArrayList<> (Arrays.asList(8,9,10,1,2,3,4,5,6,7));
      int index = find_elementindex(aList, 9, 0, aList.size() - 1);
      
   }
   //recursion -- stack space --O(log n)
   public static int find_elementindex(ArrayList<Integer> aList, int element, int start, int end) {
      
      int mid = (end - start) / 2 + start;
      
      if(aList.get(mid) == element) {
         return mid;
      }
      //suppose start = 1, end = 2; mid = 1;
      if(start <= end) {     
         if(aList.get(mid) > aList.get(start)) {
          if(element >= aList.get(start) && element <= aList.get(mid)) {
             //start = 1, end = 2;mid = 1;   
            return find_elementindex(aList, element, start, mid - 1);
         }
         else if(element >= aList.get(mid) || element <= aList.get(end)) {
            //  [9, 12, 17, 2, 4, 5]
            return find_elementindex(aList, element, mid + 1, end);
         }
         
         
         }
         else {
            if(element >= aList.get(mid) && element <= aList.get(end)) {
               return find_elementindex(aList, element, mid + 1, end);
            }
            else if(element <= aList.get(mid) || element >= start) {
               return find_elementindex(aList, element, start, mid - 1);
            }
         }
      }
      retur -1;
      
   }
}



8,9,10,1,2,3,4,5,6,7
   find = 9
   
   Mid = 2;
   check start element = 8
   check end element = 7
      
      8 to 2
