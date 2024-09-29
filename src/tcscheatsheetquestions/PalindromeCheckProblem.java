package tcscheatsheetquestions;

import java.util.Scanner;

public class PalindromeCheckProblem {
    public static String palindromeCheck(int n){
        String str=n+"";
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println(palindromeCheck(n));
    }
}
