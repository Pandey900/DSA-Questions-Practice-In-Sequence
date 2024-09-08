package binarysearchtreeproblems;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListBinarySearchTree {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        private ListNode findMiddleElement(ListNode head) {
            ListNode prevPtr = null;
            ListNode slowPtr = head;
            ListNode fastPtr = head;
            while (fastPtr != null && fastPtr.next != null) {
                prevPtr = slowPtr;
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            if (prevPtr != null) {
                prevPtr.next = null;
            }

            return slowPtr;
        }

        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode mid = findMiddleElement(head);
            TreeNode node = new TreeNode(mid.val);
            if (head == mid) {
                return node;
            }
            node.left = sortedListToBST(head);
            node.right = sortedListToBST(mid.next);

            return node;
        }
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                System.out.print(current.val + " ");
                queue.add(current.left);
                queue.add(current.right);
            } else {
                System.out.print("null ");
            }
        }
    }

    public static void main(String[] args) {
        LinkedListBinarySearchTree treeBuilder = new LinkedListBinarySearchTree();
        Solution solution = treeBuilder.new Solution();

        ListNode head = treeBuilder.new ListNode(-10);
        head.next = treeBuilder.new ListNode(-3);
        head.next.next = treeBuilder.new ListNode(0);
        head.next.next.next = treeBuilder.new ListNode(5);
        head.next.next.next.next = treeBuilder.new ListNode(9);

        TreeNode bstRoot = solution.sortedListToBST(head);
        printLevelOrder(bstRoot);
    }
}
