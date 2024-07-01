package backtracking;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class StringPermutationCode {
    public static void printPermutation(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,ans+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        printPermutation(str,"");
    }
}
