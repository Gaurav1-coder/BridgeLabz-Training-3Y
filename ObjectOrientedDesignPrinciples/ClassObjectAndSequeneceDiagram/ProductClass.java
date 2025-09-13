package ObjectOrientedDesignPrinciples.ClassObjectAndSequeneceDiagram;

public class ProductClass {
     private String productName;
    private double pricePerUnit;
    private double quantity;

    public ProductClass(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getSubtotal() {
        return pricePerUnit * quantity;
    }
}
