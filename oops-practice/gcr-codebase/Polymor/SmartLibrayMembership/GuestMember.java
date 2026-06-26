package SmartLibrayMembership;

public class GuestMember extends LibraryMember {
    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}
