//Given the document with words. Iterate the document and return the list of words with its number of occurance sorted by its number

public class DocumentScanning {
    public static void main(String args[]) {
        String input = "Practice makes man perfect, so practice daily. If you practice you can win eventually.";
        HashMap<String, Integer> hMap = parseString(input);
        printString(hMap);
    }

    static HashMap<String, Integer> parseString(String input) {
        
        HashMap<String, Integer> hMap = new HashMap<>();
        Set<Character> symbols = new HashSet<>();
        symbols.add(' ');
        symbols.add(',');
        symbols.add('.');
        symbols.add(';');
        symbols.add(':');
        symbols.add('"');

        int i=0;
        for(int j=0; j<input.length(); j++) {
            if(symbols.contains(input.charAt(j)) {
                if(i != j) {
                    string s = input.substring(i, j);
                    s = s.toLowerCase();
                    if(hMap.containsKey(s)){
                        hMap.put(s, hMap.get(s)+1);
                    }
                    else {
                        hMap.put(s, 1);
                    }
                    i = j+1;
                }
                else{
                    i++;
                }
            }
        }

        String s = input.subString(i, j+1);
        if(hMap.containsKey(s)) {
            hMap.put(s, hMap.get(s)+1);
        }
        else {
            hMap.put(s, 1);
        }
        
        return hMap;
    }

    static void printString(HashMap<String, Integer> strMap) {
        PriorityQueue<Pair> heap = new PriorityQueue<>(myComparator);

        for(Map.Entry<String, Integer> entry : strMap.entrySet()) {
            // Get s and i as entrySet from strMap
            Pair ob = new Pair(entry.getKey(), entry.getValue());
            heap.add(p);
        }

        for(Pair p : heap) {
            System.out.println(p._word+" , "+p._value);
        }
    }
}

class Pair {
    String _word;
    int _value;
}
