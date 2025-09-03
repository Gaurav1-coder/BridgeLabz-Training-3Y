package JavaClassAndObject.level1;

import java.util.Scanner;

public class EmployeeMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        ClassEmployee e1 = new ClassEmployee(name, id, sal);
        e1.display();

        sc.close();
    
    }
    
}

