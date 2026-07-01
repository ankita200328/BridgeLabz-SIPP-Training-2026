package EventManager;
import java.util.HashSet;

public class EventManager {
    HashSet<String> participants = new HashSet<>();

    public void registerParticipant(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Not Allowed.");
    }

    public void displayParticipants() {

        if (participants.isEmpty()) {
            System.out.println("No Participants Registered.");
        } else {

            System.out.println("\nRegistered Participants:");

            for (String email : participants)
                System.out.println(email);
        }

        System.out.println("Total Eligible Participants: " + participants.size());
    }

}
