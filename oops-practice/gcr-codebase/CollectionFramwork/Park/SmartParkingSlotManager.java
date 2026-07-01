package Park;
import java.util.Scanner;

public class SmartParkingSlotManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingManager parking = new ParkingManager();

        while (true) {

            System.out.println("\n1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    parking.addVehicle(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number: ");
                    parking.removeVehicle(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Vehicle Number: ");
                    parking.searchVehicle(sc.nextLine());
                    break;

                case 4:
                    parking.displayVehicles();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
