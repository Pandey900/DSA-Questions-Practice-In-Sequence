package arrays2d;

import java.util.Scanner;

public class SpiralMatrixCode {
    public static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;
        while (startRow<=endRow&&startColumn<=endColumn){

//            Top
            for (int j=startColumn;j<=endColumn;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

//            Right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

//            Bottom
            for (int j=endColumn-1;j>=startColumn;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

//            Left
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
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
        spiralMatrix(matrix);
    }
}
