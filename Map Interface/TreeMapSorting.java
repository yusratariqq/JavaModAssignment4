import java.util.*;

public class TreeMapSorting {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(50, "Fifty");
        map.put(20, "Twenty");
        map.put(80, "Eighty");
        map.put(10, "Ten");
        
        System.out.println("Automatically sorted: " + map);
    }
}