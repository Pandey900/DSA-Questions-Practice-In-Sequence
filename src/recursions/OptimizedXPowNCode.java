package recursions;

import java.util.Scanner;

public class OptimizedXPowNCode {
    public static int optimizedXPowerN(int x,int n){
        if (n==0){
            return 1;
        }
        int halfPower=optimizedXPowerN(x,n/2);
        int halfSquare=halfPower*halfPower;
//        Odd Case
        if (n%2!=0){
            halfSquare=x*halfSquare;
        }
        return halfSquare;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x=sc.nextInt();
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        System.out.println("The power of " +x+ " to the power " +n+ " is " +optimizedXPowerN(x,n));
    }
}
