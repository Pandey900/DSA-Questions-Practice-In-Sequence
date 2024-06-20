package strings;

import java.util.Scanner;

public class StringPalindromeCheckCode {

//    This is for a single word
//    public static boolean isPalindrome(String str){
//        for (int i=0;i<str.length()/2;i++){
//            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
//                System.out.println("Given String is NOT a palindrome");
//                return false;
//            }
//        }
//        System.out.println("String is a palindrome");
//        return true;
//    }


//    This is for a whole line of string
    public static boolean isPalindrome(String str) {
        str=str.toLowerCase();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))){
                b.append(str.charAt(i));
            }
        }
        for(int i=0;i<b.length()/2;i++){
            if(b.charAt(i)!=b.charAt(b.length()-1-i)){
                System.out.println("Given String is NOT a palindrome");
                return false;
            }
        }
        System.out.println("String is a palindrome");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
