package leetcodequestions;

public class PartitionListCode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static Node partitionList(Node head,int x){
        if(head==null) return null;
        Node before_head=new Node(0);
        Node before=before_head;
        Node after_head=new Node(0);
        Node after=after_head;
        while (head!=null){
            if (head.data<x){
                before.next=head;
                before=before.next;
            }else {
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=after_head.next;
        return before_head.next;
    }

    public static void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        PartitionListCode node = new PartitionListCode();
        node.addFirst(2);
        node.addFirst(5);
        node.addFirst(2);
        node.addFirst(3);
        node.addFirst(4);
        node.addFirst(1);

        System.out.print("Original List: ");
        node.print();

        int x = 3;
        head = partitionList(node.head, x);  // Update the head of the list after partitioning

        System.out.print("Partitioned List around " + x + ": ");
        node.print();
    }
}
