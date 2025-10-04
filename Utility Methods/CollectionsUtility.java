import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
    }
}