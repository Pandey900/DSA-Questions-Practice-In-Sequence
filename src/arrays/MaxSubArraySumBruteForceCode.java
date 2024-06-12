package arrays;

import java.util.Scanner;

public class MaxSubArraySumBruteForceCode {
    public static void printMaxSubArraySum(int n[]){
//        int ts=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                currSum=0;
                for (int k=i;k<j;k++){
                    System.out.print(n[k]+" ");
//                    ts++;
                    currSum+=n[k];
                }
                if (maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.println();
            }
            System.out.println(currSum);
//            System.out.println();
        }
        System.out.println("Maximum SubArrays sum is:"+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        printMaxSubArraySum(n);
    }
}
