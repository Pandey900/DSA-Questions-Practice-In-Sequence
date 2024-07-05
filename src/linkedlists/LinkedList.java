package linkedlists;

public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=newNode=tail;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int index,int data){
        if (index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if (size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        int i=0;
        while (i<size-2){
            prev=prev.next;
            i++;
        }
        int val= tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print(){
//        if (head==null){
//            System.out.println("null");
//            return;
//        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.add(2,3);
        ll.print();
//        System.out.println(ll.removeFirst());
        ll.removeFirst();
        ll.print();
        System.out.println(ll.removeLast());
        ll.print();

        System.out.println("Size of the linked list is " +ll.size);
    }
}
