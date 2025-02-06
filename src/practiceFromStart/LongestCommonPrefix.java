package practiceFromStart;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String str[]){
        StringBuilder result=new StringBuilder();
        Arrays.sort(str);
        char first[]=str[0].toCharArray();
        char last[]=str[str.length-1].toCharArray();
        for (int i=0;i<first.length;i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array string:");
        int size= sc.nextInt();
        String str[]=new String[size];
        System.out.println("Enter the strings of the array:");
        for (int i=0;i<size;i++){
            str[i]= sc.next();
        }
        System.out.println(longestCommonPrefix(str));
    }
}
