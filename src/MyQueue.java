public class MyQueue {
    int size = 5;
    Object array[] = new Object[size];
    int front = -1;
    int back = -1;
    boolean isFull(){
        if(back == size - 1){
            return true;
        } else {
            return false;
        }
    }
    boolean isEmpty(){
        if(front == -1 && back == -1){
            return true;
        } else {
            return false;
        }
    }
    public void add(Object value) {
        if(isFull()){
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            size = newArray.length;
        }
        if(front == -1 && back == -1){
            front = back = 0;
            array[back] = value;
        } else{
            back++;
            array[back] = value;
        }
    }
    public void clear(){
        front = back = -1;
    }
    public int size(){
        return back - front +1;
    }
    public Object peak(){
        if(isEmpty()){
            return null;
        }else{
            return array[front];
        }
    }
    public Object poll() {
        if (isEmpty()) {
            return null;
        } else {
            Object firstElement = array[front];
            if (front == back) {
                front = back = -1;
            } else {
                front++;
            }

            return firstElement;
        }
    }
}
