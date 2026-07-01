package EventManager;
import java.util.Scanner;
public class EventEntryVerificationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventManager event = new EventManager();

        while (true) {

            System.out.println("\n1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Email ID: ");
                    event.registerParticipant(sc.nextLine());
                    break;

                case 2:
                    event.displayParticipants();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
