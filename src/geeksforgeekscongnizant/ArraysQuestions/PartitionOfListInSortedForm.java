package geeksforgeekscongnizant.ArraysQuestions;

public class PartitionOfListInSortedForm {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node partition(Node head,int data){
        Node beforeHead=new Node(0);
        Node before=beforeHead;
        Node afterHead=new Node(0);
        Node after=afterHead;
        while (head!=null){
            if (head.data<data){
                before.next=head;
                before=before.next;
            }else {
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=afterHead.next;
        return beforeHead.next;
    }
    public static void printList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(2);
        int x=3;
        head=partition(head,x);
        printList(head);
    }
}
