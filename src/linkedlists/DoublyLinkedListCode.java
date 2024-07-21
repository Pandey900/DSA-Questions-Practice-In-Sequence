package linkedlists;

public class DoublyLinkedListCode {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
//            System.out.println("Size after removal: " + size);
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
//        System.out.println("Size after removal: " + size);
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListCode dll = new DoublyLinkedListCode();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.removeFirst());
        dll.print();
        System.out.println(dll.removeFirst());
        dll.print();
        System.out.println("Size: " + dll.size);
        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.print();
        System.out.println(dll.removeLast());
        dll.print();
        System.out.println(dll.removeLast());
        dll.print();
        System.out.println("Size: " + dll.size);
    }
}
