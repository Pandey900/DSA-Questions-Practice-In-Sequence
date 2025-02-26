package leetcodequestions;

public class ValidAnagramProblemCode {
    public static boolean validAnagram(String s,String t){
        int count[]=new int[26];
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for (int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="anagram";
        System.out.println(validAnagram(s,t));
    }
}
