package ThisStaticFinalKeyWordsAndInstanceOfOperator;

public class CarRentalClass {
     private static String companyName = "QuickRide Rentals";
    private static int totalRentals = 0;

    private final String rentalID; 
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double cost;

    public CarRentalClass(String rentalID, String customerName, String carModel, int rentalDays, double costPerDay) {
        this.rentalID = rentalID;
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.cost = rentalDays * costPerDay;
        totalRentals++;
    }

    public static void displayTotalRentals() {
        System.out.println("Total Rentals: " + totalRentals);
    }

    public void displayRentalDetails() {
        if (this instanceof CarRentalClass) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Rental ID: " + rentalID);
            System.out.println("Customer: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: $" + cost);
        }
    }
    
}
