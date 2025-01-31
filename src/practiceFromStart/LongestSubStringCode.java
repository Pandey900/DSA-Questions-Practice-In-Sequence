package practiceFromStart;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubStringCode {
//    public static String longestSubString(String str){
//        int n=str.length();
//        int freq[]=new int[256];
//        Arrays.fill(freq,0);
//        int i=0;
//        int j=0;
//        int ans=0;
//        int start=0;
//        while(i<n){
//            if (freq[str.charAt(i)]==1){
//                while (freq[str.charAt(i)]==1){
//                    freq[str.charAt(j)]--;
//                    j++;
//                }
//            }
//            freq[str.charAt(i)]++;
//            if (i-j+1>ans){
//                ans=i-j+1;
//                start=j;
//            }
//            i++;
//        }
//        return str.substring(start,start+ans);
//    }
    public static int longestSubString(String str){
        int n=str.length();
        int freq[]=new int[256];
        Arrays.fill(freq,0);
        int i=0;
        int j=0;
        int ans=0;
        while (i<n){
            if (freq[str.charAt(i)]==1){
                while (freq[str.charAt(i)]==1){
                    freq[str.charAt(j)]--;
                    j++;
                }
            }
            freq[str.charAt(i)]++;
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        System.out.println(longestSubString(str));
    }
}
