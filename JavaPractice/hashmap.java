import java.util.HashMap;
import java.util.Map;
import java.io.*;

//basic HashMap implementation
class hashmap
{
    public static void main(String args[])
    {
        //declaration of HashMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        //HashMap uses get and put for inserting and retrieving
        hmap.put(1, "a");
        hmap.put(2, "b");
        hmap.put(3, "c");
        hmap.put(4, "d");

        //HashMap collections cannot get the key, while it can get the value through key
        System.out.println(hmap.size());
        System.out.println(hmap.get(1));

        //to get the key and value of the hmap, you have to get through Map collections of same key value type
        for(Map.Entry<Integer, String> emap : hmap.entrySet())
        {
            System.out.println(emap.getKey() +" : "+emap.getValue());
        }

    }
}
