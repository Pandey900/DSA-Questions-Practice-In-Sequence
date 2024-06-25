package recursions;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class XPowerNCode {
    public static int xPowerN(int x,int n){
        if (n==0){
            return 1;
        }
        return x*xPowerN(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x=sc.nextInt();
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        System.out.println("The power of " +x+ " to the power " +n+ " is " +xPowerN(x,n));
    }
}
