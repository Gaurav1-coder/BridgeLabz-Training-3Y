package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class CarRentalMain {
    public static void main(String[] args) {
        // Using default constructor
        CarRentalClass r1 = new CarRentalClass();
        r1.show();

        // Using parameterized constructor
        CarRentalClass r2 = new CarRentalClass("Amit Kumar", "SUV", 5);
        r2.show();

        // Using copy constructor
        CarRentalClass r3 = new CarRentalClass(r2);
        r3.show();
    }
    
}
