package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class OrderClass {
     private List<ProductClass> products;

    public OrderClass() {
        this.products = new ArrayList<>();
    }

    public void addProduct(ProductClass p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order contains:");
        for (ProductClass p : products) {
            System.out.println(" - " + p.getName() + " : Rs. " + p.getPrice());
        }
    }
}
