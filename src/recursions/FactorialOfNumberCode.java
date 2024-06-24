package recursions;

import java.util.Scanner;

public class FactorialOfNumberCode {
    public static int factNum(int n){
        if (n==0){
            return 1;
        }
        return n*factNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n= sc.nextInt();
        System.out.println(factNum(n));
    }
}
