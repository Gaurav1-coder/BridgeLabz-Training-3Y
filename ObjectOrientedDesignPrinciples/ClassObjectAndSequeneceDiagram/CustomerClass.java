package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

import java.util.ArrayList;
import java.util.List;

public class CustomerClass {
      private String customerId;
    private String name;
    private List<ProductClass> purchasedProducts;

    public CustomerClass(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(ProductClass p) {
        purchasedProducts.add(p);
    }

    public List<ProductClass> getPurchasedProducts() {
        return purchasedProducts;
    }
}
