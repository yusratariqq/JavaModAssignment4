import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 22);
        map.put("Charlie", 28);
        
        System.out.println("Sorted by keys: " + map);
    }
}