package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class CircleMain {
     public static void main(String[] args) {
        // Circle using default constructor (radius = 1.0)
        CircleClass c1 = new CircleClass();
        System.out.println("Circle 1: Radius = " + c1.r + ", Area = " + c1.area());

        // Circle using parameterized constructor
        CircleClass c2 = new CircleClass(5.0);
        System.out.println("Circle 2: Radius = " + c2.r + ", Area = " + c2.area());

        CircleClass c3 = new CircleClass(10.5);
        System.out.println("Circle 3: Radius = " + c3.r + ", Area = " + c3.area());
    }
}
