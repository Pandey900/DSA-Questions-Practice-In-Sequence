package practiceFromStart;

public class RotateList {
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
    public static int length(Node temp){
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static Node rotateList(Node head,int k){
        if (head==null || head.next==null || k==0){
            return head;
        }
        k%=length(head);
        if (k==0){
            return head;
        }
        head=reverse(head);
        Node prev=null;
        Node curr=head;
        Node next;
        for (int i=0;i<k;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node newHead=prev;
        prev=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=prev;
        return newHead;
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return prev;
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
        RotateList ll=new RotateList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        head=rotateList(head,2);
        ll.printList();
    }
}
