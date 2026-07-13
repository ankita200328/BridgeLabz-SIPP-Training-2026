package InsertATPos;

public class Node {
    int data;
    Node next;
    Node( int data){
        this.data=data;
        this.next=null;
    }
    public void insertAfter(Node current, int trackId) {
        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }
}
