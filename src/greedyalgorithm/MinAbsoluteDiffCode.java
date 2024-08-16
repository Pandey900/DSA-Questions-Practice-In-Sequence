package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDiffCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of A Array:");
        int sizeA= sc.nextInt();
        System.out.println("Enter the size of B Array:");
        int sizeB= sc.nextInt();
        int A[]=new int[sizeA];
        int B[]=new int[sizeB];
        System.out.println("Enter the elements of the A Array:");
        for(int i=0;i<sizeA;i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of B Array:");
        for (int i=0;i<sizeB;i++){
            B[i]= sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for (int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Sum of the min Absolute difference is: " +minDiff);
    }
}
