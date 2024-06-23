package bitwiseoperators;

import java.util.Scanner;

public class CheckIfOddOrEvenCode {
    public  static void oddOrEven(int n){
        int bitMask=1;
        if ((n&bitMask)==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        oddOrEven(n);
    }
}
