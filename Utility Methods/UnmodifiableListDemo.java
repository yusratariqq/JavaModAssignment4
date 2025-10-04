import java.util.*;

public class UnmodifiableListDemo {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("Apple");
        original.add("Banana");
        
        List<String> unmodifiable = Collections.unmodifiableList(original);
        
        try {
            unmodifiable.add("Orange"); // This will throw exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list!");
        }
    }
}