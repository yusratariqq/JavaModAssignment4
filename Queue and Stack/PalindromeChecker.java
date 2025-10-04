import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Is 'racecar' palindrome? " + isPalindrome("racecar"));
        System.out.println("Is 'hello' palindrome? " + isPalindrome("hello"));
    }
}