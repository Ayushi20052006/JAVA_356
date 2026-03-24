// package unit 4;
import java.util.HashMap;
import java.util.Map;
public class mapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // Adding key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");    
        map.put(4, "Four");

        // Retrieving a value using its key
        System.out.println("Value for key 2: " + map.get(2)); // Output: Two

        // Checking if a key exists in the map
        System.out.println("Does key 3 exist? " + map.containsKey(3)); // Output: true

        // Removing a key-value pair from the map
        map.remove(4);

        //To get all keys of the map
        System.out.println("Keys in the map: " + map.keySet()); // Output: [1, 2, 3]

        //To get all values of the map
        System.out.println("Values in the map: " + map.values()); // Output: [One, Two, Three]
        
        // Iterating over the map entries
        System.out.println("Map entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }   
    }
}
