package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class CustomerClass {
      private String name;

    public CustomerClass(String name) {
        this.name = name;
    }

    public void placeOrder(OrderClass o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}
