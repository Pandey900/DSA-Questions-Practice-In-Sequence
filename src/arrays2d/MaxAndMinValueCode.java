package arrays2d;

import java.util.Scanner;

public class MaxAndMinValueCode{
    public static int maxAndMin(int matrix[][]){
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (minValue>matrix[i][j]){
                    minValue=matrix[i][j];
                }
                if (maxValue<matrix[i][j]){
                    maxValue=matrix[i][j];
                }
            }
        }
        System.out.println("Minimum Value in the Matrix is:"+minValue);
        return maxValue;
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
        System.out.println(maxAndMin(matrix));
    }
}
