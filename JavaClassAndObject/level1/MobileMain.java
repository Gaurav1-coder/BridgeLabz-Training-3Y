package JavaClassAndObject.level1;

import java.util.Scanner;

public class MobileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        ClassMobile m1 = new ClassMobile(brand, model, price);
        m1.display();

        sc.close();
    }
}
