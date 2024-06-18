package arrays2d;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void printMatrix(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
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
        int transpose[][]=new int[columns][rows];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix Is:");
        printMatrix(transpose);
    }
}
