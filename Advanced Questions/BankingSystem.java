
import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts;
    
    public BankingSystem() {
        accounts = new HashMap<>();
    }
    
    public void addCustomer(int customerId, double balance) {
        accounts.put(customerId, balance);
    }
    
    public double getBalance(int customerId) {
        return accounts.getOrDefault(customerId, 0.0);
    }
}