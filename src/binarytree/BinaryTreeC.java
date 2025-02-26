package binarytree;


import com.sun.source.tree.ArrayAccessTree;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeC {
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

//    public  static int height(Node root){
//        if (root==null){
//            return 0;
//        }
//        int lh=height(root.left);
//        int rh=height(root.right);
//        return Math.max(lh,rh)+1;
//    }

//    Diameter Of Tree
//    public static int diameter2(Node root){
//        if (root==null) return 0;
//        int left_diameter=diameter2(root.left);
//        int right_diameter=diameter2(root.right);
//        int left_height=height(root.left);
//        int right_height=height(root.right);
//        int self=left_height+right_height+1;
//        return Math.max(self,Math.max(left_diameter,right_diameter));
//    }
//    static class Info{
//        int diam;
//        int ht;
//        public Info(int diam,int ht){
//            this.diam=diam;
//            this.ht=ht;
//        }
//    }
//    public static Info diameter(Node root){
//        if (root==null){
//            return new Info(0,0);
//        }
//        Info left_diam=diameter(root.left);
//        Info right_diam=diameter(root.right);
//        int final_Diam=Math.max(Math.max(left_diam.diam, right_diam.diam), left_diam.ht+ right_diam.ht+1);
//        int final_Ht=Math.max(left_diam.ht, right_diam.ht)+1;
//        return new Info(final_Diam,final_Ht);
//    }
//
//
////    Checking If The Subtree is Present In The Tree Or Not
//    public static boolean isIdentical(Node node,Node subRoot){
//        if (node==null&&subRoot==null){
//            return true;
//        } else if (node==null||subRoot==null||node.data!= subRoot.data) {
//            return false;
//        }
//        if (!isIdentical(node.left,subRoot.left)){
//            return false;
//        }
//        if (!isIdentical(node.right,subRoot.right)){
//            return false;
//        }
//        return true;
//    }
//    public static boolean isSubTree(Node root,Node subRoot){
//        if (root==null){
//            return false;
//        }
//        if (root.data== subRoot.data){
//            if (isIdentical(root,subRoot)){
//                return true;
//            }
//        }
//        return isSubTree(root.left,subRoot)||isSubTree(root.right,subRoot);
//    }



    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;

        q.add(new Info(root,0));
        q.add(null);
        while (!q.isEmpty()){
            Info curr=q.remove();
            if (curr==null){
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                if (!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if (curr.node.left!=null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if (curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
        for (int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }



//    Kth Level Node value find

    public static void printKth(Node root,int level,int k){
        if (root==null) return;
        if (level==k){
            System.out.print(root.data+" ");
        }
        printKth(root.left,level+1,k);
        printKth(root.right,level+1,k);
    }



//    Lowest Common Ancestor

    public static boolean getPath(Node root, int n, ArrayList<Node> p){
        if (root==null) return false;
        p.add(root);
        if (root.data==n){
            return true;
        }
        boolean getLeft=getPath(root.left,n,p);
        boolean getRight=getPath(root.right,n,p);
        if (getLeft||getRight){
            return true;
        }
        p.remove(p.size()-1);
        return false;
    }
    public static Node getLca(Node root,int n1,int n2){
        ArrayList<Node> p1=new ArrayList<>();
        ArrayList<Node> p2=new ArrayList<>();
        getPath(root,n1,p1);
        getPath(root,n2,p2);
        int i=0;
        for (;i<p1.size()&&i<p2.size();i++){
            if (p1.get(i)!=p2.get(i)){
                break;
            }
        }
        Node lca=p1.get(i-1);
        return lca;
    }



//    LCA Second Approach In Less Space Complexity But Linear Time Complexity
    public static Node lca2(Node root,int n1,int n2){
        if (root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftNodes=lca2(root.left,n1,n2);
        Node rightNodes=lca2(root.right,n1,n2);
        if (leftNodes==null){
            return rightNodes;
        }
        if (rightNodes==null){
            return leftNodes;
        }
        return root;
    }


    public static int lcaDist(Node root,int n){
        if (root==null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right,n);
        if (leftDist==-1&&rightDist==-1){
            return -1;
        } else if (leftDist==-1) {
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }

    public static int kthAncestor(Node root,int n,int k){
        if (root==null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }
        int leftDist=kthAncestor(root.left,n,k);
        int rightDist=kthAncestor(root.right,n,k);
        if (leftDist==-1&&rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist,rightDist);
        if (max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }


    public static int transform(Node root){
        if (root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static boolean invertedBinaryTreeCheck(Node root){
        if (root==null){
            return true;
        }
        if (root.left!=null&&root.data!=root.left.data){
            return false;
        }
        if (root.right!=null&&root.data!=root.right.data){
            return false;
        }
        return invertedBinaryTreeCheck(root.left)&&invertedBinaryTreeCheck(root.right);
    }
    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);


        Node root=new Node(1);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right.left=new Node(1);
        root.right.right=new Node(1);
//        System.out.println(height(root));
//        System.out.println(diameter(root).diam);
//        Node subRoot=new Node(2);
//        subRoot.left=new Node(4);
//        subRoot.right=new Node(5);
//        System.out.println(isSubTree(root,subRoot));

//        topView(root);
//        int k=2;
//        printKth(root,1,k);
//        int n1=4,n2=6;
//        System.out.println(getLca(root,n1,n2).data);
//        System.out.println(lca2(root,n1,n2).data);
//        System.out.println(minDist(root,n1,n2));
//        int n=5,k=2;
//        kthAncestor(root,n,k);

//        transform(root);
//        preorder(root);

        System.out.println(invertedBinaryTreeCheck(root));;
    }
}
