package practiceFromStart;

public class ReverseNodeInKThGroups {
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
    public static Node reverseKthGroup(Node head,int k){
        int n=length(head);
        int groups=n/k;
        Node prevHead=null;
        Node currHead=head;
        Node ansNode=null;
        for (int i=0;i<groups;i++){
            Node prev=null;
            Node curr=currHead;
            Node next;
            for (int j=0;j<k;j++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            if(prevHead==null){
                ansNode=prev;
            }else {
                prevHead.next=prev;
            }
            prevHead=currHead;
            currHead=curr;
        }
        prevHead.next=currHead;
        return ansNode;
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
        ReverseNodeInKThGroups ll=new ReverseNodeInKThGroups();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        head=reverseKthGroup(head,2);
        ll.printList();
    }
}
