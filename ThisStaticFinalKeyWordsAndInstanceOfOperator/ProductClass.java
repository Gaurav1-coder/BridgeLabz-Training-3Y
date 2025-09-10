package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class ProductClass {
     private static double discount = 0.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public ProductClass(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        }
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof ProductClass) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        }
    }
}
