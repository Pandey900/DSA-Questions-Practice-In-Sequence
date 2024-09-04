package binarysearchtreeproblems;

import java.util.ArrayList;

public class BinarySearchTreeA {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

//    Insert Node In BinarySearch Tree
    public static Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }



//    Search In Binary Search Tree
    public static boolean searchInBST(Node root,int key){
        if (root==null){
            return false;
        }
        if (root.data==key){
            return true;
        }
        if (root.data>key){
           return searchInBST(root.left,key);
        }else {
           return searchInBST(root.right,key);
        }
    }



//    Delete Node From Binary Search Tree
    public static Node deleteNode(Node root,int val){
        if (root.data>val){
            root.left=deleteNode(root.left,val);
        } else if (root.data<val) {
            root.right=deleteNode(root.right,val);
        }else {
            if (root.left==null&&root.right==null){
                return null;
            }
            if (root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }

            Node inorderS=inorderSuccessor(root.right);
            root.data=inorderS.data;
            root.right=deleteNode(root.right,inorderS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }


//    Print Nodes Present In The Given Range
    public static void printRange(Node root,int k1,int k2){
        if (root==null){
            return;
        }
        if(root.data>=k1&&root.data<=k2){
            printRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printRange(root.right,k1,k2);
        } else if (root.data<k1) {
            printRange(root.left,k1,k2);
        }else {
            printRange(root.right,k1,k2);
        }
    }



//    Print Different Path From Root 2 Leaf Nodes

    public static void printPath(ArrayList<Integer> path){
        for (int i=0;i< path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left==null&&root.right==null){
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
//        int values[]={8,5,3,1,4,6,10,11,14};
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        int val=5;
        for (int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
//        System.out.println();
//        if (searchInBST(root,key)){
//            System.out.println("Found");
//        }else {
//            System.out.println("Not Found");
//        }

//        deleteNode(root,val);
        System.out.println();
//        inorder(root);
//        System.out.println();
//        printRange(root,5,12);
        printRoot2Leaf(root,new ArrayList<>());
    }
}
