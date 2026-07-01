package Park;
import java.util.ArrayList;

public class ParkingManager {
    ArrayList<String> vehicles = new ArrayList<>();

    public void addVehicle(String vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle Added Successfully.");
    }

    public void removeVehicle(String vehicle) {
        if (vehicles.remove(vehicle))
            System.out.println("Vehicle Removed Successfully.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public void searchVehicle(String vehicle) {
        if (vehicles.contains(vehicle))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle is Not Parked.");
    }

    public void displayVehicles() {

        if (vehicles.isEmpty()) {
            System.out.println("No Vehicles Parked.");
        } else {
            System.out.println("\nParked Vehicles:");
            for (String v : vehicles)
                System.out.println(v);
        }

        System.out.println("Occupied Parking Slots: " + vehicles.size());
    }
}
