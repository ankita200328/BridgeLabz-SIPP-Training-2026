package SmartLibrayMembership;

public class FacultyMember extends LibraryMember{
    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}
