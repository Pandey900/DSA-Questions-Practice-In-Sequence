package leetcodequestions;

public class MergeTwoSortedListsCode {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createList(int[] values) {
        Node dummy = new Node(0);
        Node current = dummy;
        for (int value : values) {
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next;
    }

    public static Node mergeLists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node ans;
        if (list1.data <= list2.data) {
            ans = list1;
            list1 = list1.next;
        } else {
            ans = list2;
            list2 = list2.next;
        }

        Node current = ans;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return ans;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node l1 = createList(new int[]{1, 2, 4});
        Node l2 = createList(new int[]{1, 3, 4});

        System.out.println("List 1:");
        printList(l1);
        System.out.println("List 2:");
        printList(l2);

        Node mergedList = mergeLists(l1, l2);
        System.out.println("Merged List:");
        printList(mergedList);
    }
}
