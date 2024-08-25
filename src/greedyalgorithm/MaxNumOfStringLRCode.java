package greedyalgorithm;

import java.util.Scanner;

public class MaxNumOfStringLRCode {
    public static int maxNumString(String str){
        if (str.isEmpty()){
            return 0;
        }
        int l=0,r=0;
        int ans=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='R'){
                r++;
            } else if (str.charAt(i)=='L') {
                l++;
            }
            if (l==r){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        System.out.println(maxNumString(str));
    }
}
