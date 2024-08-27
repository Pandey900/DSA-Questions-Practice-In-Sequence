package binarytree;

import java.util.Scanner;

public class BinaryTreesB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{

//        PreOrder Tree
        static int index=-1;
        public static Node buildTree(int node[]){
            index++;
            if (node[index]==-1){
                return null;
            }
            Node newNode=new Node(node[index]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }

        public static void preOrder(Node root){
            if (root==null){
                System.out.print("-1"+" ");
                return;
            }
//            System.out.print(" ");
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the node:");
        int size= sc.nextInt();
        int node[]=new int[size];
        System.out.println("Enter the values of the node:");
        for (int i=0;i<size;i++){
            node[i]= sc.nextInt();
        }
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(node);
        System.out.println(root.data);
        tree.preOrder(root);
    }
}
