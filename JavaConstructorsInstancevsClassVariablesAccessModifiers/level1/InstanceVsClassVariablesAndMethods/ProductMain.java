package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class ProductMain {
     public static void main(String[] args) {
        ProductClass p1 = new ProductClass("Laptop", 55000);
        ProductClass p2 = new ProductClass("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductClass.displayTotalProducts();
    }
    
}
