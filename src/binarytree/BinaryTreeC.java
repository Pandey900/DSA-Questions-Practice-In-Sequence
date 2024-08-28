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
    }
}
