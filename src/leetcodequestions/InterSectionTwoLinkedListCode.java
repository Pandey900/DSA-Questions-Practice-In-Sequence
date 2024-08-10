package leetcodequestions;

public class InterSectionTwoLinkedListCode {
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

    public static void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static Node interSection(Node l1, Node l2) {
        if (l1 == null || l2 == null) return null;
        Node p1 = l1;
        Node p2 = l2;
        while (p1 != p2) {
            p1 = (p1 == null) ? l2 : p1.next;
            p2 = (p2 == null) ? l1 : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        InterSectionTwoLinkedListCode l1 = new InterSectionTwoLinkedListCode();
        InterSectionTwoLinkedListCode l2 = new InterSectionTwoLinkedListCode();

        // Adding elements to list l1
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);

        // Manually create intersection

        // Adding elements to list l2
        l2.addFirst(4);
        l2.addFirst(3);
        l2.addFirst(5);

        // Print both lists
        l1.print();
        l2.print();

        // Find and print intersection
        Node intersection = interSection(l1.head, l2.head);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
