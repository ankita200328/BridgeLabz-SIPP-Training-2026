package Deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {
    private Deque<Integer> queue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        queue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        queue.addFirst(jobId);
    }

    public int printNextJob() {
        if (queue.isEmpty()) {
            throw new RuntimeException("No Jobs");
        }

        return queue.removeFirst();
    }

}
