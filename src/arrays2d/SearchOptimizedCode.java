package arrays2d;

import java.util.Scanner;

public class SearchOptimizedCode {
    public static boolean search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while (row<matrix.length&&col>=0){
            if (matrix[row][col]==key){
                System.out.print("key Found At Index ("+row+","+col+")");
                return true;
            }else if (key<matrix[row][col]){
                col--;
            }else {
                row++;
            }
        }
        System.out.println("Key NOT Found!");
        return false;
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
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        search(matrix,key);
    }
}
