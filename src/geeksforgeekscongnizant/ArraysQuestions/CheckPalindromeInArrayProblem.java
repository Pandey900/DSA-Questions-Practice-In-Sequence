package geeksforgeekscongnizant.ArraysQuestions;

public class CheckPalindromeInArrayProblem {
    public static boolean isPalindrome(int n){
        String str=""+n;
        int len=str.length();
        for (int i=0;i<len/2;i++){
            if (str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalinArray(int n[]){
        for (int i=0;i< n.length;i++){
            boolean ans=isPalindrome(n[i]);
            if (ans==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={111,222,333,444,555};
        boolean ans=isPalinArray(arr);
        System.out.println(ans);
    }
}
