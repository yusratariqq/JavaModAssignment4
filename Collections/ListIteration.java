import java.util.*;

public class ListIteration {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        
        System.out.println("For loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        
        System.out.println("Enhanced for loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}