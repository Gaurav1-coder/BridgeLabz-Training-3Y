package JavaClassAndObject.level2;

import java.util.Scanner;

public class ShoppingCartMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        ClassShoppingCart c1 = new ClassShoppingCart(item, price, qty);

        System.out.print("Enter quantity to add: ");
        c1.add(sc.nextInt());

        System.out.print("Enter quantity to remove: ");
        c1.remove(sc.nextInt());

        c1.display();

        sc.close();
    }
}
