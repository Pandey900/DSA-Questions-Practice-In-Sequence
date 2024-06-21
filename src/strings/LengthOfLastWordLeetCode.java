package strings;

import java.util.Scanner;

public class LengthOfLastWordLeetCode {
    public static int lastWordLength(String str){
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=' '){
                count++;
            }else if (count>0){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        System.out.println("The length of the last Word In the String is:"+lastWordLength(str));
    }
}
