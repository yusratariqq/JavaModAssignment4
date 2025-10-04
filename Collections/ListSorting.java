import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        Collections.sort(names);
        System.out.println("Alphabetical: " + names);
        
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse: " + names);
    }
}