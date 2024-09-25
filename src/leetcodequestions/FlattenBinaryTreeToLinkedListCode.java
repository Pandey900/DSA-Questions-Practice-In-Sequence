package leetcodequestions;

public class FlattenBinaryTreeToLinkedListCode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=right=null;
        }
    }
    public static void printFlatten(Node root){
        while (root!=null){
            if (root.left!=null){
                Node curr=root.left;
                while (curr.right!=null){
                    curr=curr.right;
                }
                curr.right=root.right;
                root.right=root.left;
                root.left=null;
            }
            root=root.right;
        }
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.right=new Node(6);
        printFlatten(root);
        inorder(root);
    }
}
