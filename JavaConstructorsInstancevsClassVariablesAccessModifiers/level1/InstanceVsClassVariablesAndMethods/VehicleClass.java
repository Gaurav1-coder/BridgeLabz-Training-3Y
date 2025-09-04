package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class VehicleClass {
      String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    VehicleClass(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + 
                           ", Vehicle: " + vehicleType + 
                           ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
