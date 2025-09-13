package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class EcommerceMain {
    
     public static void main(String[] args) {
        CustomerClass c1 = new CustomerClass("Amit");

        ProductClass p1 = new ProductClass("Laptop", 55000);
        ProductClass p2 = new ProductClass("Phone", 20000);

        OrderClass order = new OrderClass();
        order.addProduct(p1);
        order.addProduct(p2);

        c1.placeOrder(order);
    }
}
