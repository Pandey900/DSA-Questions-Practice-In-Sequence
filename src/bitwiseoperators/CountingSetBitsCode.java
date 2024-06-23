package bitwiseoperators;

import java.util.Scanner;

public class CountingSetBitsCode {
    public static int countSetBits(int n){
        int count=0;
        while (n>0){
            if ((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("Number of one's bit in the given number is = " + countSetBits(n));
    }
}
