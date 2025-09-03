package JavaClassAndObject.level1;

import java.util.Scanner;

public class CircleMain {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        ClassCircle c1 = new ClassCircle(r);
        c1.display();

        sc.close();
    }
    
}
