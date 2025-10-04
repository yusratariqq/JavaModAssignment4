import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding: " + list);
        
        list.remove("Banana");
        System.out.println("After removing by value: " + list);
        
        list.remove(0);
        System.out.println("After removing by index: " + list);
        
        list.add("Grapes");
        list.set(0, "Mango");
        System.out.println("After replacing: " + list);
    }
}