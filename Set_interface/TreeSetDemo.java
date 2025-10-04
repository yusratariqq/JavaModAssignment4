import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        
        System.out.println("Sorted TreeSet: " + numbers);
    }
}