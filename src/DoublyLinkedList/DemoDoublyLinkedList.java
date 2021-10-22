
package DoublyLinkedList;
class DoublyLinkedList{
    Node first;
    Node last;
    
    public void printAll(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void addLast(int newData){
        Node newNode = new Node(newData);
        if(last == null){
            first = last = newNode;
        }else{
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }
    public void addFirst(int newData){
        Node newNode = new Node(newData);
        if(first == null){
            first = last = newNode;
        }else{
            
            first.prev = newNode;
            newNode.next = first;
            first = newNode;

        }
        
    }
    public void addAfter(int data, int newData){
        
        Node newNode = new Node(newData);
        if(data == last.data){
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }else{
            Node current = first;
            while(current != null){
                if(current.data == data){
                    Node temp = current.next;
                    newNode.next = current.next;
                    newNode.prev = current;
                    current.next = newNode;
                    temp.prev = newNode;
                }
                current = current.next;
            }
        }
     }
    public void removeFirst(){
        first = first.next;    
    }
    public void removeLast(){
        last = last.prev;
        last.next = null;
    }
}
public class DemoDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList daftarNilai = new DoublyLinkedList();
        daftarNilai.addLast(100);
        daftarNilai.addLast(200);
        daftarNilai.addLast(300);
        daftarNilai.addAfter(300, 400);
        daftarNilai.addAfter(200, 250);
        daftarNilai.addAfter(300, 350);
        
        daftarNilai.removeLast();
        daftarNilai.printAll();
    }
}
