package arrays2d;

import java.util.Scanner;

public class CarPoolingProblemCode {
    public static boolean carPooling(int trips[][],int capacity){
        int m[]=new int[1001];
        for (int a[]:trips){
            m[a[1]]+=a[0];
            m[a[2]]-=a[0];
        }
        for (int i=0;capacity>=0&&i<1001;i++){
            capacity+=m[i];
        }
        return capacity>=0;
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
        System.out.println("Enter the capacity of the car:");
        int capacity= sc.nextInt();
        System.out.println(carPooling(matrix,capacity));
    }
}
