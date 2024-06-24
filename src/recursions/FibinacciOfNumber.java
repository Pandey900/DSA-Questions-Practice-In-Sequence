package recursions;

import java.util.Scanner;

public class FibinacciOfNumber {
    public static int fibN(int n){
        if (n==0 || n==1) {
            return n;
        }
        return fibN(n-1)+fibN(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n= sc.nextInt();
        System.out.println(fibN(n));
    }
}
