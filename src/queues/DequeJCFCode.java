package queues;
import java.util.*;
public class DequeJCFCode {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        System.out.println(dq);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("First Element:"+dq.getFirst());
        System.out.println("last Element:"+dq.getLast());
    }
}
