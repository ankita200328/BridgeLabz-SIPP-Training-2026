package SmartLibrayMembership;

public class StudentMember extends LibraryMember {
    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}
