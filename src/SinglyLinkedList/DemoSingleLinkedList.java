package SinglyLinkedList;
class LinkedList{
    Node first, last;
    int size=0;
    //method menambah node di depan
    public void addFirst(int dataBaru){
        Node nodeBaru = new Node(dataBaru); // 1. buat node baru
        if(first == null){
            first = nodeBaru;//first menunjuk ke nodeBaru
            last = nodeBaru;// last menunjuk ke nodeBaru
        }else{
            nodeBaru.next = first;
            first = nodeBaru;
        }
        size++;
    }
    
    //method menambah node dibelakang
    public void addLast(int dataBaru){
        Node nodeBaru = new Node(dataBaru); // 1. buat node baru
        if(first == null){//jika LinkedList masih Kosong
            first = nodeBaru;
            last = nodeBaru;
        }else{//jika LinkedList sudah ada node
            last.next = nodeBaru;
            last = nodeBaru;
        }
        size++;
    }
    
    //method menampilkan data setiap node
    public void printAll(){
        Node current = first;//i=0;
        while(current != null){//i<last
            System.out.print(current.data+" ");
            current = current.next;//i++
        }
    }
    
    //method mengganti data lama dengan data baru
    public void replace(int dataOld, int dataNew){
        Node current = first;
        while(current != null){
            if(current.data == dataOld)
                current.data = dataNew;
            current = current.next;
        }
    }
    
    //method mengembalikan data yang ada pada node paling depan
    public int getDataFirst(){
        return first.data;
    }
    
    //method mengembalikan data yang ada pada node paling depan
    public int getDataLast(){
        return last.data;
    }
    
    //method menghapus node paling depan
    public void removeFirst(){
        first = first.next;
        size--;
    }
    
    //method mengembalikan jumlah node 
    public int getSize(){
        return size;
    }
    
    //method mengahapus linkedlist
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
