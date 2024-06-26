package recursions;

import java.util.Scanner;

public class NumbersToDigits {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if (n==0){
            return;
        }
        int lastDigit=n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n=sc.nextInt();
        printDigits(n);
    }
}
