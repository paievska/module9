public class MyLinkedList {
    class Node{
        Object value;
        Node prev;
        Node next;
        public Node(Object value) {
            this.value = value;
        }
    }
    private Node last;
    private Node first;
    private int size;
    public void add(Object value) {
        Node newNode = new Node(value);
        if (first == null) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }
    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = first;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        if (current.prev == null) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
    }

    public void clear() {
        Node current = first;
        while (current != null) {
            Node next = current.next;
            current.prev = null;
            current.next = null;
            current = next;
        }
        first = last = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public  Object get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node current = first;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.value;
    }
}
