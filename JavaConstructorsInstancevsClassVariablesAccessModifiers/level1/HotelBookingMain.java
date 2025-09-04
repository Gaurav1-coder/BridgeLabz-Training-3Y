package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class HotelBookingMain {
 public static void main(String[] args) {
        // Using default constructor
        HotelBookingClass b1 = new HotelBookingClass();
        b1.show();

        // Using parameterized constructor
        HotelBookingClass b2 = new HotelBookingClass("Amit Kumar", "Deluxe", 3);
        b2.show();

        // Using copy constructor
        HotelBookingClass b3 = new HotelBookingClass(b2);
        b3.show();
    }
    
}
