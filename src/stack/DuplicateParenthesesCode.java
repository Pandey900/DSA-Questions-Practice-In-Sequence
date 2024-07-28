package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateParenthesesCode {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
//            Closing Conditions Check
            if(ch==')'){
                int count=0;
                while (s.pop()!='('){
                    count++;
                }
                if (count<1){
                    return true;
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.next();
        System.out.println(isDuplicate(str));
    }
}
