package binarysearchtreeproblems;

import binarytree.BinaryTreeC;

import java.util.ArrayList;

public class BinarySearchTreeA {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
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



//    Validate Binary Search Tree
    public static boolean isValid(Node root,Node min,Node max){
        if (root==null){
            return true;
        }
        if (min!=null&&root.data<=min.data){
            return false;
        } else if (max!=null&&root.data>= max.data) {
            return false;
        }
        return isValid(root.left,min,root)&&isValid(root.right,root,max);
    }




//    Mirror Of A BST
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node left_Subtree=mirror(root.left);
        Node right_Subtree=mirror(root.right);
        root.left=right_Subtree;
        root.right=left_Subtree;
        return root;
    }


    public static Node createMinBST(int arr[],int si,int ei){
        if (si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr[mid]);
        root.left=createMinBST(arr,si,mid-1);
        root.right=createMinBST(arr,mid+1,ei);
        return root;
    }

//    PreOrder
    public static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }



//    IsSymmteric Check Of The BinarySearch Tree
    public static boolean isSymmetric(Node root){
        if (root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node left,Node right){
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        return (left.data==right.data)&&isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }
    public static void main(String[] args) {
//        int values[]={8,5,3,1,4,6,10,11,14};
//        int values[]={1,1,1,1};
//        Node root=null;
//        int val=5;
//        for (int i=0;i<values.length;i++){
//            root=insert(root, values[i]);
//        }
//        inorder(root);
//        System.out.println();
//        if (searchInBST(root,key)){
//            System.out.println("Found");
//        }else {
//            System.out.println("Not Found");
//        }

//        deleteNode(root,val);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        printRange(root,5,12);
//        printRoot2Leaf(root,new ArrayList<>());

//        if (isValid(root,null,null)){
//            System.out.println("Valid");
//        }else {
//            System.out.println("Not Valid");
//        }


//        Node root = new Node(1);
//        root. left = new Node(2);
//        root. right = new Node(2);
//        root. left. left = new Node(3);
//        root. left. right = new Node (4);
//        root. right. right = new Node(3);
//        root.right.left=new Node(4);
//        mirror(root);
//        preorder(root);
//        System.out.println(isSymmetric(root));

        int arr[]={3,5,6,8,10,11,12};
        Node root=createMinBST(arr,0,arr.length-1);
        preorder(root);
    }
}
