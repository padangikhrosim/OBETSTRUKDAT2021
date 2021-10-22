package DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
    
}
public class DasarDoublyLInkedLIst {
    public static void main(String[] args) {
        Node nodeA = new Node(100);
        Node nodeB = new Node(90);
        Node nodeC = new Node(80);
        
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeB.prev = nodeA;
        nodeC.prev = nodeB;
        
        System.out.println(nodeA.next.prev.data);
    }
}
