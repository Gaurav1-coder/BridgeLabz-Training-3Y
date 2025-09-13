package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

import java.util.ArrayList;
import java.util.List;

public class BankClass {
    private String bankName;
    private List<CustomerClass> customers;

    public BankClass(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(CustomerClass c, double initialDeposit) {
        c.deposit(initialDeposit);
        customers.add(c);
        System.out.println("Account opened for " + c.getName() + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName + " Customers:");
        for (CustomerClass c : customers) {
            c.viewBalance();
        }
    }    
}
