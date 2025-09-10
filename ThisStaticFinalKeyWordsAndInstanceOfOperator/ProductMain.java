package  ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class ProductMain {
    public static void main(String[] args) {
        ProductClass.updateDiscount(10);

        ProductClass p1 = new ProductClass("P001", "Laptop", 1200, 5);
        ProductClass p2 = new ProductClass("P002", "Phone", 800, 10);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
    
}
