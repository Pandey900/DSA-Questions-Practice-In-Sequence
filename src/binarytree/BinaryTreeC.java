package binarytree;

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

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        System.out.println(height(root));
//        System.out.println(diameter(root).diam);
//        Node subRoot=new Node(2);
//        subRoot.left=new Node(4);
//        subRoot.right=new Node(5);
//        System.out.println(isSubTree(root,subRoot));

        topView(root);
        int k=2;
        printKth(root,1,k);
    }
}
