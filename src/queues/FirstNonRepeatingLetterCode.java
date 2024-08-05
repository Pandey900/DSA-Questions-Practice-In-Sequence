package queues;
import java.util.*;
public class FirstNonRepeatingLetterCode {
    public  static void printNonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        printNonRepeating(str);
    }
}
