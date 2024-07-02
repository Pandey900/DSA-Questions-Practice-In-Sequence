package backtracking;

import java.util.Scanner;

public class GridWaysCode {
    public static int factN(int n){
        if (n==0){
            return 1;
        }
        return n*factN(n-1);
    }
//    public static int gridWays(int i,int j,int n,int m){
//        if (i==n-1&&j==m-1){
//            return 1;
//        } else if (i==n||j==m) {
//            return 0;
//        }
//        return gridWays(i+1,j,n,m)+gridWays(i,j+1,n,m);
//    }
    public static int gridWays(int i,int j,int n,int m){
        if (i==n-1&&j==m-1){
            return 1;
        } else if (i==n&&j==m) {
            return 0;
        }
        int totalSteps=(n-1)+(m-1);
        int numerator=factN(totalSteps);
        int denominator=factN(n-1)*factN(m-1);
        return numerator/denominator;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        System.out.println("Enter the value of M:");
        int m= sc.nextInt();
        System.out.println("Total Ways is: " +gridWays(0,0,n,m));
    }
}
