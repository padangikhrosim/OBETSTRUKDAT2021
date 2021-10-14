package LinkedList;
class LinkedList{
    Node first, last;
    int size=0;
    public void addFirst(int dataBaru){
        Node nodeBaru = new Node(dataBaru); // 1. buat node baru
        if(first == null){
            first = nodeBaru;//first menunjuk ke nodeBaru
            last = nodeBaru;//
        }else{
            nodeBaru.next = first;
            first = nodeBaru;
        }
        size++;
    }
    public void addLast(int dataBaru){
        Node nodeBaru = new Node(dataBaru); // 1. buat node baru
        if(first == null){
            first = nodeBaru;
            last = nodeBaru;
        }else{
            last.next = nodeBaru;
            last = nodeBaru;
        }
        size++;
    }
    public void printAll(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void replace(int dataOld, int dataNew){
        Node current = first;
        while(current != null){
            if(current.data == dataOld)
                current.data = dataNew;
            current = current.next;
        }
    }
    public int getDataFirst(){
        return first.data;
    }
    public int getDataLast(){
        return last.data;
    }
    public void removeFirst(){
        first = first.next;
        size--;
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        last = null;
        first = null;
        size = 0;
    }
}
public class DemoSingleLinkedList {
    public static void main(String[] args) {
        LinkedList daftarNilai = new LinkedList();
        
        daftarNilai.addFirst(90);
        daftarNilai.addFirst(100);
        daftarNilai.addFirst(70);
        daftarNilai.addLast(50);
        daftarNilai.addLast(10);
        
        daftarNilai.clear();
        System.out.println(daftarNilai.first);
    }
}
