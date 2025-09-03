package JavaClassAndObject.level2;

import java.util.Scanner;

public class StudentMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        ClassStudent s1 = new ClassStudent(name, roll, marks);
        s1.display();

        sc.close();
    }
}
