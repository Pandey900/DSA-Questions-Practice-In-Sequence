package triesdatastructure;

public class WordBreakProblemSolution {
    static class Node{
        Node words[]=new Node[26];
        boolean eow=false;
        Node(){
            for (int i=0;i<26;i++){
                words[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if (curr.words[index]==null){
                curr.words[index]=new Node();
            }
            curr=curr.words[index];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if (curr.words[index]==null){
                return false;
            }
            curr=curr.words[index];
        }
        return curr.eow==true;
    }
    public static boolean wordBreak(String key){
        if (key.length()==0){
            return true;
        }
        for (int i=1;i<=key.length();i++){
            if (search(key.substring(0,i))&&wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        String key="ilikesung";
        System.out.println(wordBreak(key));
    }
}
