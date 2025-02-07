package practiceFromStart;

import java.util.Scanner;

public class DiagonalSumCode {
    public static int diagonalSum(int mat[][]){
        int n=mat.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if (n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int row= sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int col= sc.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }
}
