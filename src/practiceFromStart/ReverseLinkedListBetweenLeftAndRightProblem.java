package practiceFromStart;

public class ReverseLinkedListBetweenLeftAndRightProblem {
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

    public static Node reverseLLFromLeftAndRight(Node head,int left,int right){
        Node temp=new Node(0);
        temp.next=head;
        Node preLeft=temp;
        Node curr=head;
        for (int i=0;i<left-1;i++){
            preLeft=preLeft.next;
            curr=curr.next;
        }
        Node subList=curr;
        Node prev=null;
        Node next;
        for (int i=0;i<=right-left;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        preLeft.next=prev;
        subList.next=curr;
        return temp.next;
    }
    public static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ReverseLinkedListBetweenLeftAndRightProblem ll=new ReverseLinkedListBetweenLeftAndRightProblem();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        reverseLLFromLeftAndRight(head,2,4);
        ll.printList();
    }
}
