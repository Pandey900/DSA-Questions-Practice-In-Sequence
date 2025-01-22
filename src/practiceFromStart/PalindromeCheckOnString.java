package practiceFromStart;

import java.util.Scanner;

public class PalindromeCheckOnString {
    public static boolean isPalindrome1(String str){
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            while (left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
