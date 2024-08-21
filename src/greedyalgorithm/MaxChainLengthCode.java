package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxChainLengthCode {
    public static int maxChainLength(int n[][]){
        Arrays.sort(n, Comparator.comparingDouble(o->o[1]));
        int chainLength=1;
        int chainEnd=n[0][1];
        for (int i=1;i<n.length;i++){
            if (n[i][0]>chainEnd){
                chainLength++;
                chainEnd=n[i][1];
            }
        }
        return chainLength;
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
        System.out.println(maxChainLength(matrix));
    }
}
