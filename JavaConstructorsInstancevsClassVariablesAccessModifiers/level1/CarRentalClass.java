package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

public class CarRentalClass {
      String cn;   // customerName
    String cm;   // carModel
    int d;       // rentalDays
    double cost; // total cost

    CarRentalClass() { // Default constructor
        this.cn = "Customer";
        this.cm = "Basic Car";
        this.d = 1;
        calcCost();
    }

    CarRentalClass(String cn, String cm, int d) { // Parameterized constructor
        this.cn = cn;
        this.cm = cm;
        this.d = d;
        calcCost();
    }

    CarRentalClass(CarRentalClass cr) { // Copy constructor
        this.cn = cr.cn;
        this.cm = cr.cm;
        this.d = cr.d;
        this.cost = cr.cost;
    }

    void calcCost() {
        this.cost = d * 1000; // simple price or rate
    }

    void show() {
        System.out.println("Rental: " + cn + ", Car: " + cm + ", Days: " + d + ", Cost: " + cost);
    }
    
}
