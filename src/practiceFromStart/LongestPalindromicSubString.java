package practiceFromStart;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String str){
        int start=0,end=1;
        int l=0,r=0;
        for (int i=0;i<str.length();i++){
//            For Even
            l=i;
            r=i+1;
            while (l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
                if (r-l+1>end){
                    start=l;
                    end=r-l+1;
                }
                l--;
                r++;
            }
//            For ODD
            l=i-1;
            r=i+1;
            while (l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
                if (r-l+1>end){
                    start=l;
                    end=r-l+1;
                }
                l--;
                r++;
            }
        }
        return str.substring(start,start+end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        System.out.println(longestPalindrome(str));
    }
}
