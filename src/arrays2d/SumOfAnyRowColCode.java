package arrays2d;

import java.util.Scanner;

public class SumOfAnyRowColCode {
    public static int rowSum(int matrix[][],int n){
        int sum=0;

//        ROW SUM
//        for (int j=0;j<matrix[0].length;j++){
//            sum+=matrix[row][j];
//        }

//        COLUMN SUM
        for (int i=0;i<matrix.length;i++){
            sum+=matrix[i][n];
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
        System.out.println("Enter the row for which you want the sum for:");
        int n= sc.nextInt();
        System.out.println("Total Sum of the given row is:"+rowSum(matrix,n));
    }
}
