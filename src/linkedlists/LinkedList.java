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


//    Add Element At First Index
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



//    Add Element At Last Index
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



//    Add Element In The Middle Of The Index
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




//    Remove First Element Of The List
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



//    Remove Last Element Of The List
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


//    Iterative Search To Find Element Index Number
    public int search(int key){
        if (size==0){
            System.out.println("No data");
            return Integer.MIN_VALUE;
        }
        Node temp=head;
        int i=0;
        while (temp!=null){
            if (temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


//    Recursive Way To Find Element Index Number
    public int helper(Node head,int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int index=helper(head.next,key);
        if (index==-1){
            return -1;
        }
        return index+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }



//    Finding Middle Of The List
    public Node finMid(Node head){
        Node slow=head;
        Node fast=head;

//        Even Case And Odd Case To Find Mid
        while (fast!=null && fast.next!=null){
            slow=head.next;
            fast=head.next.next;
        }
        return slow;

    }
//    Checking Palindrome
    public boolean isPalindrome(){
        if (head==null || head.next==null){
            return true;
        }
        Node midNode=finMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while (right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }





//    Remove Nth Node From End
    public void removeNth(int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if (n==size){
            head=head.next;
            return;
        }
        Node prev=head;
        int iToFind=size-n;
        int i=1;
        while (i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }





//    Print All The List
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




//    Main Function
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
//        ll.addLast(5);
//        ll.print();
//        ll.addLast(6);
//        ll.add(2,3);
//        ll.print();
////        System.out.println(ll.removeFirst());
//        ll.removeFirst();
//        ll.print();
//        System.out.println(ll.removeLast());
//        ll.print();
//        System.out.println("Element Found At Index: " +ll.recSearch(4));
//        ll.reverse();
        ll.print();
        System.out.println(ll.isPalindrome());
//        ll.removeNth(3);
//        ll.print();
//        ll.print();
//        System.out.println("Size of the linked list is " +ll.size);
    }
}
