package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication;

public class BankMain {
     public static void main(String[] args) {
        BankClass bank = new BankClass("SBI");
        CustomerClass c1 = new CustomerClass("Amit");
        CustomerClass c2 = new CustomerClass("Riya");

        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 3000);

        bank.showCustomers();
    }
}
