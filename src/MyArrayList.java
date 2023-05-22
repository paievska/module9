public class MyArrayList {
    private static final int CAPACITY = 3;
    private int size;
    private Object[] array;
    public MyArrayList(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException();
        }
        array = new Object[capacity];
    }
    public MyArrayList(){
        array = new Object[CAPACITY];
    }

    public void add(Object value){
        if(array.length == size){
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = value;
        size++;
    }
    public void remove(int index){
        System.arraycopy(array, index + 1, array, index, size - index -1);
        size--;
    }
    public void clear(){
        array = new Object[CAPACITY];
        size = 0;
    }
    public Object get(int index){
        return array[index];
    }
    public int size(){
        return size;
    }
}
