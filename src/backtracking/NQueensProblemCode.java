package backtracking;

import java.util.Scanner;

public class NQueensProblemCode {
    public static boolean isSafe(char board[][],int row,int col){
//        Vertically Up
        for (int i=row-1;i>=0;i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }
//        diagonal left
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
//        diagonal right
        for (int i=row-1,j=col+1;i>=0&&j<=0;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        if (row== board.length){
            prinBoard(board);
            return;
        }
        for (int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='x';
            }

        }
    }
    public static void prinBoard(char board[][]){
        System.out.println("----------chess board-----------");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        char board[][]=new char[n][n];
//        Initialize
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
    }
}
