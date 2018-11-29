package streams;

import java.util.Map;
import java.util.HashMap;

public class MapToStream {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Boi", 6);
        myMap.put("Zooey", 3);
        myMap.put("Charis", 8);

        long count = myMap.entrySet().
	    stream().
	    filter(d -> d.getValue() > 4).
	    count();

        System.out.println("count: " + count);
    }
}
