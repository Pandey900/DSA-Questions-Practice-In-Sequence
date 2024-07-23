package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseAStringUsingStack {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while (index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder sb=new StringBuilder();
        while (!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.next();
        System.out.println(reverseString(str));
    }
}
