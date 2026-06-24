package Inheritance;


public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("=== Electric Vehicle ===");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n=== Petrol Vehicle ===");
        pv.displayInfo();
        pv.refuel();
    }
}