package leetcodequestions;

import java.util.LinkedList;
import java.util.Queue;

public class NodesDisKInBinaryTreeProblem {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printKDistanceNodeDown(Node root, int k) {
        if (root == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printKDistanceNodeDown(root.left, k - 1);
        printKDistanceNodeDown(root.right, k - 1);
    }

    public static int printKDistanceNode(Node root, Node target, int k) {
        if (root == null) {
            return -1;
        }

        // If target is found, print nodes at distance k downward from the target node
        if (root == target) {
            printKDistanceNodeDown(root, k);
            return 0;
        }

        // Check if target is in the left subtree
        int dl = printKDistanceNode(root.left, target, k);
        if (dl != -1) {
            if (dl + 1 == k) {
                System.out.print(root.data + " ");
            } else {
                printKDistanceNodeDown(root.right, k - dl - 2);
            }
            return 1 + dl;
        }

        // Check if target is in the right subtree
        int dr = printKDistanceNode(root.right, target, k);
        if (dr != -1) {
            if (dr + 1 == k) {
                System.out.print(root.data + " ");
            } else {
                printKDistanceNodeDown(root.left, k - dr - 2);
            }
            return 1 + dr;
        }

        return -1;
    }

    public static Node insertLevelOrder(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            if (arr[i] != null) {
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new Node(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        Node root = insertLevelOrder(arr);
        Node target = root.left;
        int k = 2;
        System.out.print("Nodes at distance " + k + " from target " + target.data + ": ");
        printKDistanceNode(root, target, k);
    }
}
