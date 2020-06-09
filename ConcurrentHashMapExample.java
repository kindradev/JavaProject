import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();

        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("5", "Five");
        map.put("6", "Six");

        System.out.println("Initial ConcurrentHashMap: " + map);
        Iterator iterator = map.keySet().iterator();
        try {
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (key.equals("3")) {
                    map.put("4", "Four");
                }

            }
        } catch (ConcurrentModificationException cme) {
            cme.printStackTrace();
        }
        System.out.println("ConcurrentHashMap after modification: " + map);

        map = new HashMap();

        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("5", "Five");
        map.put("6", "Six");

        System.out.println("Initial HashMap: " + map);
        iterator = map.keySet().iterator();

        try {

            while (iterator.hasNext()) {
                String key = (String) iterator.next();

                if (key.equals("3")) {
                    map.put("4", "Four");
                }
            }
            System.out.println("HashMap after modification: " + map);
        } catch (ConcurrentModificationException cme) {
            cme.printStackTrace();
        }

    }

}
