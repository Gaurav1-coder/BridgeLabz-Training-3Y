package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class HotelBookingClass {
      String g;   // guestName
    String rt;  // roomType
    int n;      // nights

    HotelBookingClass() { // Default constructor
        this.g = "Guest";
        this.rt = "Standard";
        this.n = 1;
    }

    HotelBookingClass(String g, String rt, int n) { // Parameterized constructor
        this.g = g;
        this.rt = rt;
        this.n = n;
    }

    HotelBookingClass(HotelBookingClass hb) { // Copy constructor
        this.g = hb.g;
        this.rt = hb.rt;
        this.n = hb.n;
    }

    void show() {
        System.out.println("Booking: " + g + ", Room: " + rt + ", Nights: " + n);
    }
    
}
