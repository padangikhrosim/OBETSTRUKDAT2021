/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryLinkedList;
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
    
}

class LinkedListku<T>{
    Node<T> first;
    Node<T> last;
    public void printAll(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void addFirst(T newData){
        Node newNode = new Node(newData);
        if(first == null){
            first = last = newNode;
        }
    }
    
    
    
}

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedListku<String> daftarNama = new LinkedListku<>();
        daftarNama.addFirst("Obet");
        
        
        daftarNama.printAll();
        
        
    }
}
