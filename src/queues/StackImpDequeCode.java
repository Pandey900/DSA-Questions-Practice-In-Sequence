package queues;

import java.util.*;

public class StackImpDequeCode {
    static class Stack{
        Deque<Integer> dq=new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    static class Queue{
        Deque<Integer> dq=new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
//        Stack s=new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        System.out.println("Top Element in the stack:"+s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Top Element in the stack:"+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
