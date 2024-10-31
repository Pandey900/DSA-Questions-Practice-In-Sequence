package triesdatastructure;

public class StartWithProblemSolution {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        Node(){
            for (int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if (curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if (curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.eow==true;
    }

    public static boolean startWith(String prefix){
        Node curr=root;
        for (int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if (curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="men";
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
