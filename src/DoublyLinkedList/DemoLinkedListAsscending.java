package DoublyLinkedList;
class LinkedListAsc{
    Node first, last;
    public void printAll(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void addAscending(int newData){
        Node newNode = new Node(newData);
        if(first == null){
            first = last = newNode;
        }else if(newData<=first.data){
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }else if(newData >= last.data){
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }else{
            Node current = first;
            while(current != null){
                if(newData <= current.data){
                    Node temp = current.prev;
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev = newNode;
                    temp.next = newNode;
                    break;
                }
                current = current.next;
            }    
            
        }
    }
}
public class DemoLinkedListAsscending {
    public static void main(String[] args) {
        LinkedListAsc daftarNilai = new LinkedListAsc();
        daftarNilai.addAscending(90);
        daftarNilai.addAscending(80);
        daftarNilai.addAscending(70);
        daftarNilai.addAscending(60);
        daftarNilai.addAscending(65);
        daftarNilai.addAscending(85);
        daftarNilai.printAll();
    }
}
