import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        
        System.out.println("Smallest: " + numbers.first());
        System.out.println("Largest: " + numbers.last());
        
        numbers.remove(20);
        System.out.println("After removal: " + numbers);
    }
}