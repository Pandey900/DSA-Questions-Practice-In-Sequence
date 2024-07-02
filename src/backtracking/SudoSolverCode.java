package backtracking;

import java.util.Scanner;

public class SudoSolverCode {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
//        Row
        for (int i=0;i<=8;i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
//        Column
        for (int j=0;j<=8;j++){
            if (sudoku[row][j]==digit){
                return false;
            }
        }
//        Grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for (int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        if (row==9){
            return true;
        }
        int nextRow=row,nextCol=col+1;
        if (col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if (sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for (int digit=1;digit<=9;digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if (sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int row= sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int column= sc.nextInt();
        int sudoku[][]=new int[row][column];
        System.out.println("Enter the value of row and colum");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                sudoku[i][j]= sc.nextInt();
            }
        }
        if (sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution Does NOT Exists");
        }
    }
}
