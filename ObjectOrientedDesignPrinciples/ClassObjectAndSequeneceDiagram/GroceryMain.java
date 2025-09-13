package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class GroceryMain {
     public static void main(String[] args) {
        CustomerClass customer = new CustomerClass("C1", "Alice");
        customer.addProduct(new ProductClass("Apples", 3.0, 2)); // 2kg at $3/kg
        customer.addProduct(new ProductClass("Milk", 2.0, 1));   // 1L at $2/L

        BillGeneratorClass billGen = new BillGeneratorClass();
        double total = billGen.generateBill(customer);

        System.out.println(customer.getName() + "'s Total Bill: $" + total);
    }
}
