package SinglyLinkedList;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
    
}
public class SingleListDasar {
    public static void main(String[] args) {
        Node n1 = new Node(90);
        Node n2 = new Node(100);
        Node n3 = new Node(85);
        
        n1.next = n2;
        n2.next = n3;
        
        System.out.println(n1.next.next);
    }
}
