package practiceFromStart;

public class ReverseNodesInPair {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static Node swapInPairs(Node head){
        Node temp=new Node(0);
        temp.next=head;
        Node point=temp;
        while (point.next!=null && point.next.next!=null){
            Node swap1=point.next;
            Node swap2=point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;
        }

        return temp.next;
    }

    public static Node swapNodeFromKthFirstAndLastPosition(Node head,int k){
        Node fast=head;
        Node slow=head;
        Node first=head,last=head;
        for (int i=0;i<k-1;i++){
            fast=fast.next;
        }
        first=fast;
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        last=slow;
        int temp=first.data;
        first.data=last.data;
        last.data=temp;
        return head;
    }
    public static void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ReverseNodesInPair ll=new ReverseNodesInPair();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        swapNodeFromKthFirstAndLastPosition(head,2);
//        head=swapInPairs(head);
        ll.printList();
    }
}
