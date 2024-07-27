package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisCode {
    public static boolean isValidParenthesis(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else {
                if (s.isEmpty()){
                    return false;
                }else {
                    if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') ||(s.peek()=='['&&ch==']')) {
                        s.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the parenthesis string:");
        String str= sc.next();
        System.out.println(isValidParenthesis(str));
    }
}
