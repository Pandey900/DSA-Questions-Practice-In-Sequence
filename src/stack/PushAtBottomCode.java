package stack;
import java.util.*;
public class PushAtBottomCode {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data you want to print at the bottom of the stack:");
        int data= sc.nextInt();
        pushAtBottom(s,data);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
