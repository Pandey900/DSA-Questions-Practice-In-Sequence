package recursions;

import java.util.Scanner;

public class TilingProblemCode {
    public  static int tilingProblem(int n){
        if (n==0||n==1){
            return 1;
        }
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        System.out.println("Total ways to fit the tiles on the floor is:"+tilingProblem(n));
    }
}
