package binarytree;

import java.util.Scanner;
import java.util.*;

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



//        PreOrder Traversal Code
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




//        InOrder Traversal Code
        public static void inOrder(Node root){
            if (root==null){
                System.out.print("-1"+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }


//        Level Order Traversal Using Queue And BFS(BREATH FIRST SEARCH)

        public static void levelOrder(Node root){
            if (root==null){
                System.out.print("-1"+" ");
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currNode=q.remove();
                if (currNode==null){
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data+" ");
                    if (currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }



//        PostOrder Traversal
        public static void postOrder(Node root){
            if (root==null){
                System.out.print("-1"+" ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }



    //        Height Of The Tree
    public  static int height(Node root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }



    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the node:");
//        int size= sc.nextInt();
//        int node[]=new int[size];
//        System.out.println("Enter the values of the node:");
//        for (int i=0;i<size;i++){
//            node[i]= sc.nextInt();
//        }


//        BinaryTree tree=new BinaryTree();


//        Node root=tree.buildTree(node);
//        System.out.println(root.data);


//        tree.preOrder(root);

//        tree.inOrder(root);

//        tree.postOrder(root);

//        tree.levelOrder(root);



        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
    }
}
