package JavaClassAndObject.level1;

import java.util.Scanner;

public class ItemMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        ClassItem i1 = new ClassItem(code, name, price);
        i1.display();
        System.out.println("Total Cost: " + i1.getTotal(qty));

        sc.close();
    }
    
}
