public class MyHashMap {
    private static final int CAPACITY = 6;
    private Node[] array;
    private int size;
    class Node {
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
    public MyHashMap(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException();
        }
        array = new Node[capacity];
        size = 0;
    }
    public MyHashMap(){
        array = new Node[CAPACITY];
    }
    private void resizeArray() {
        int newCapacity = array.length * 2;
        Node[] newArray = new Node[newCapacity];
        for (Node node : array) {
            Node current = node;
            while (current != null) {
                int hash = current.getKey().hashCode() % CAPACITY;
                Node newNode = new Node(current.getKey(), current.getValue());
                if (newArray[hash] == null) {
                    newArray[hash] = newNode;
                } else {
                    Node last = newArray[hash];
                    while (last.next != null) {
                        last = last.next;
                    }
                    last.next = newNode;
                }
                current = current.next;
            }
        }
        array = newArray;
    }
    public void put(Object key, Object value){
        if(size >= array.length * 0.75){
            resizeArray();
        }
        int hash = key.hashCode() % CAPACITY;
        Node element = array[hash];
        if(element == null){
            array[hash] = new Node(key,value);
        }else{
            while(element.next != null){
                if(element.getKey() == key){
                    element.setValue(value);
                    return;
                }
                element = element.next;
            }
            if(element.getKey() == key){
                element.setValue(value);
                return;
            }
            element.next = new Node(key, value);
        }
        size++;
    }
    public Object remove(Object key){
        int hash = key.hashCode() % CAPACITY;
        Node element = array[hash];
        if(element == null){
            return null;
        }
        if(element.getKey() == key){
            array[hash] = element.next;
            element.next = null;
            size--;
            return element;
        }
        Node prev = element;
        element = element.next;
        while(element != null){
            if(element.getKey() == key){
                prev.next = element.next;
                element.next = null;
                size--;
                return element;
            }
            prev = element;
            element = element.next;
        }
        return null;
    }
    public void clear(){
        array = new Node[CAPACITY];
        size = 0;
    }
    public int size(){
        return size;
    }
    public Object get(Object key){
        int hash = key.hashCode() % CAPACITY;
        Node element = array[hash];
        if(element == null){
            return null;
        }
        while(element != null){
            if(element.getKey() == key){
                return element.getValue();
            }
            element = element.next;
        }
        return null;
    }
}
