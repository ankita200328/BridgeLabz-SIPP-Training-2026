package DeleteATPos;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

    public Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.data == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }
}
