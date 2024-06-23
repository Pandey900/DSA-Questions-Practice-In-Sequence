package bitwiseoperators;

import java.util.Scanner;

public class PowerOf2CheckingCode {
    public static boolean isPowerOf2(int n){
        return (n&(n-1))==0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println(isPowerOf2(n));
    }
}
