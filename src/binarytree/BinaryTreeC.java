package binarytree;

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

    public  static int height(Node root){
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

//    Diameter Of Tree
    public static int diameter2(Node root){
        if (root==null) return 0;
        int left_diameter=diameter2(root.left);
        int right_diameter=diameter2(root.right);
        int left_height=height(root.left);
        int right_height=height(root.right);
        int self=left_height+right_height+1;
        return Math.max(self,Math.max(left_diameter,right_diameter));
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
        if (root==null){
            return new Info(0,0);
        }
        Info left_diam=diameter(root.left);
        Info right_diam=diameter(root.right);
        int final_Diam=Math.max(Math.max(left_diam.diam, right_diam.diam), left_diam.ht+ right_diam.ht+1);
        int final_Ht=Math.max(left_diam.ht, right_diam.ht)+1;
        return new Info(final_Diam,final_Ht);
    }


//    Checking If The Subtree is Present In The Tree Or Not
    public static boolean isIdentical(Node node,Node subRoot){
        if (node==null&&subRoot==null){
            return true;
        } else if (node==null||subRoot==null||node.data!= subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if (root==null){
            return false;
        }
        if (root.data== subRoot.data){
            if (isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot)||isSubTree(root.right,subRoot);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
        System.out.println(diameter(root).diam);
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);
        System.out.println(isSubTree(root,subRoot));
    }
}
