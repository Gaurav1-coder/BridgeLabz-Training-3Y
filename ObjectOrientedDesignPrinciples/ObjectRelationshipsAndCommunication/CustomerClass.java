package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;


public class CustomerClass {
     private String name;
    private double balance;

    public CustomerClass(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }

    public String getName() {
        return name;
    }
}