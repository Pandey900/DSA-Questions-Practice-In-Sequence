package arrays2d;

import java.util.Scanner;

public class DiagonalSumCode {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
//        Brute Force Approach
//        for (int i=0;i<matrix.length;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                if (i==j){
//                    sum+=matrix[i][j];
//                }else if(i+j==matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

//        Optimized Approach
        for (int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if (i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int columns= sc.nextInt();
        int matrix[][]=new int[rows][columns];
        System.out.println("Enter the elements of the Array:");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(diagonalSum(matrix));
    }
}
