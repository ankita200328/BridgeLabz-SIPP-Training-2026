package CircularQueue;

public class Main {
    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(3);

        buffer.enqueue(100);
        buffer.enqueue(200);
        buffer.enqueue(300);

        System.out.println(buffer.dequeue());

        buffer.enqueue(400);

        while (!buffer.isEmpty()) {
            System.out.println(buffer.dequeue());
        }
    }
}
