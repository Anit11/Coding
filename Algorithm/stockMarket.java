import java.util.*;

class stockPair {
    String _name;
    int _value;

    public stockPair(String s, int v) {
        _name = s;
        _value = v;
    }
}

class Stock {
    
    //min Comparator that orders the heap such that root is minimum
    static class myComparator implements Comparator<stockPair> {
        
        public int compare(stockPair x, stockPair y) {
            return y._value - x._value;
        }
    }
    
    HashMap<String, Integer> _hmap = new HashMap<> ();

    public void addStock(String stockName, int stockCount) {
        if(_hmap.containsKey(stockName)) {
            _hmap.put(stockName, _hmap.get(stockName) + stockCount);
        }
        else {
            _hmap.put(stockName, stockCount);
        }
    }

    public void printStock() {

        for(Map.Entry<String, Integer> myEntry : _hmap.entrySet()) {

            System.out.print(myEntry.getKey()+" ");
            System.out.print(myEntry.getValue());
            System.out.println();
        }
    }

    public void getTopStock(int k) {
        Comparator<stockPair> stockComparator = new myComparator();
        PriorityQueue<stockPair> priority = new PriorityQueue<>(k, stockComparator);
        Iterator iterator = _hmap.keySet().iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if(count == k) {
                break;
            }
            String key = iterator.next().toString();
            Integer value = _hmap.get(key);
            priority.add(new stockPair(key, value));
        }

        //for(Map.Entry<String, Integer> pair : _hmap.entrySet()){
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            Integer value = _hmap.get(key);

            if(priority.element()._value < value) {
                priority.remove();
                priority.add(new stockPair(key, value));
            }
        }

        for(int i=0; i<k; i++) {
            stockPair sp = priority.remove();
           System.out.println(sp._name+" , "+sp._value); 
        } 
    }

    public void printArrayList(ArrayList<String> list) {
        System.out.println("The top k elements are : ");
        for(int i=0; i<list.size(); i++) {
           System.out.println(list.get(i)); 
        }
    }

}
public class stockMarket {
    
    public static void main(String args[]) {
        
        Stock obj = new Stock();
        obj.addStock("Google", 100);
        obj.addStock("LinkedIn", 120);
        obj.addStock("Amazon", 90);
        obj.addStock("Google", 50);
        //obj.printStock();
        obj.getTopStock(1);
        
    }
}

