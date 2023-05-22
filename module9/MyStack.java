public class MyStack {
    int size = 5;
    Object array[] = new Object[size];
    int top = -1;

    boolean isFull(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Object value) {
        if(isFull()){
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            size = newArray.length;
        }
        top++;
        array[top] = value;
    }
    public void remove(int index){
        if(index == top){
            top--;
        }else{
            System.arraycopy(array, index + 1, array, index, top - index);
            top--;
        }
    }
    public void clear(){
        top = -1;
    }
    public int size(){
        return top + 1;
    }
    public Object peak(){
        if(isEmpty()){
            return null;
        }else{
            return array[top];
        }
    }
    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            Object firstElement = array[top];
            top--;
            return firstElement;
        }
    }
}
