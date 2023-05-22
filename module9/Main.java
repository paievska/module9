import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        MyArrayList list = new MyArrayList(3);
        list.add(1);
        list.add(3);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        System.out.println(list.size());
        list.clear();
        //LinkedList
        LinkedList list1 = new LinkedList<>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(2);
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        System.out.println(list1.remove(2));
        System.out.println(list1.get(2));
        list1.clear();
        System.out.println(list1.size());
        //Queue
        MyQueue myQueue = new MyQueue();
        myQueue.add(3);
        myQueue.add(2);
        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
        System.out.println(myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peak());
        myQueue.clear();
        System.out.println(myQueue.peak());
        //Stack
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(5);
        myStack.push(7);
        myStack.push(8);
        myStack.push(4);
        myStack.push(10);
        System.out.println(myStack.size());
        System.out.println(myStack.peak());
        myStack.remove(2);
        System.out.println(myStack.size());
        myStack.pop();
        System.out.println(myStack.peak());
        //Hash Map
//        MyHashMap list2 = new MyHashMap();
//        list2.put('A', "Hello");
//        list2.put('C', "Mommy");
//        list2.put('B', "Sunny");
//        list2.put(1, "Good");
//        System.out.println(list2.get(1));
//        System.out.println(list2.size());
//        System.out.println(list2.remove('C'));
//        System.out.println(list2.get('C'));
//        System.out.println(list2.get('A'));
//        list2.clear();
//        System.out.println(list2.get('B'));

    }
}