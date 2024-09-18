package geeksforgeekscongnizant.ArraysQuestions;

public class CheckBothStringsAreSameOrNot {
    public static boolean imperfectstring(String S, String T) {
        if(S.length()!=T.length()){
            return false;
        }
        int diffCount=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=T.charAt(i)){
                diffCount++;
                if(diffCount>1){
                    return false;
                }
            }
        }
        return diffCount==1;
    }

    public static void main(String[] args) {
        String s1="abcdef";
        String s2="abcdef";
        System.out.println(imperfectstring(s1,s2));
    }
}
