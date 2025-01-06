package practiceFromStart;

import java.util.Scanner;

public class CheckNumberIsPalindrome {
    public static boolean checkPalindrome(int n){
        if (n<0){
            return false;
        }
        int rev=0;
        int temp=n;
        while (temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        if (rev==n){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println(checkPalindrome(n));
    }
}
