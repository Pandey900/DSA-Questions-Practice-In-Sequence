package practiceFromStart;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String str){
        if (str==null || str.length()<1){
            return "";
        }
        int low=0,high=0;
        for (int i=0;i<str.length();i++){
            int length1=expandAroundCenter(str,i,i);
            int length2=expandAroundCenter(str,i,i+1);
            int maxLength=Math.max(length1,length2);
            if (maxLength>high-low) {
                low = i - (maxLength - 1) / 2;
                high = i + maxLength / 2;
            }
        }
        return str.substring(low,high+1);
    }
    public static int expandAroundCenter(String str,int low,int high){
        while (low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
            low--;
            high++;
        }
        return high-low-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        System.out.println(longestPalindrome(str));
    }
}
