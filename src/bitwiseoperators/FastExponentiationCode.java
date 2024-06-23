package bitwiseoperators;

import java.util.Scanner;

public class FastExponentiationCode {
    public static int fastExpo(int a,int n){
        int answer=1;
        while (n>0){
            if ((n&1)!=0){
                answer*=a;
            }
            a*=a;
            n=n>>1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a= sc.nextInt();
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        System.out.println("The value of " +a+ " to the Power " +n+ " is " +fastExpo(a,n));
    }
}
