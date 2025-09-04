package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.InstanceVsClassVariablesAndMethods;

public class VehicleMain {
     public static void main(String[] args) {
        VehicleClass v1 = new VehicleClass("Ravi", "Car");
        VehicleClass v2 = new VehicleClass("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        VehicleClass.updateRegistrationFee(6000); // update class variable

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
    
}
