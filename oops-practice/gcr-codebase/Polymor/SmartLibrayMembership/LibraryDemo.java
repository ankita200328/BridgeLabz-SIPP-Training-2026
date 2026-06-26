package SmartLibrayMembership;

public class LibraryDemo {
    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Ankita", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        int overdueDays = 4;

        System.out.println("Library Members\n");

        for (LibraryMember m : members) {
            m.displayDetails();
            System.out.println("Fine = Rs." + m.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching Member ID: " + searchId);

        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("\nMember Found");
                m.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member Not Found");
        }
    }
}
