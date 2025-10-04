import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> frequency = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Character frequencies: " + frequency);
    }
}