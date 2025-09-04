package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class ProductClass {
    String productName;
    double price;
    static int totalProducts = 0; // shared among all products

    ProductClass(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
}
