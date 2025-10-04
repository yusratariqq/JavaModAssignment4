import java.util.*;

public class TicketSystem {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("Customer1");
        ticketQueue.add("Customer2");
        ticketQueue.add("Customer3");
        
        while (!ticketQueue.isEmpty()) {
            String customer = ticketQueue.poll();
            System.out.println("Processing ticket for: " + customer);
        }
    }
}