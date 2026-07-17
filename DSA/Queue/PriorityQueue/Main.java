package PriorityQueue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        pq.offer(new Patient(3, "Rahul"));
        pq.offer(new Patient(1, "Ankita"));
        pq.offer(new Patient(2, "Riya"));

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}
