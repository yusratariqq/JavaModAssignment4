import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        
        for (String word : new HashSet<>(words)) {
            int frequency = Collections.frequency(words, word);
            System.out.println(word + ": " + frequency);
        }
    }
}