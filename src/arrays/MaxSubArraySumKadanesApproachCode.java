package arrays;

import java.util.Scanner;

public class MaxSubArraySumKadanesApproachCode {
    public static void maxSubArraySumKadanes(int n[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for (int i=0;i<n.length;i++){
            currSum+=n[i];
            if (n[i]<0){
                minSum=Math.min(currSum,minSum);
            }
            if (currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
//            minSum=Math.min(currSum,minSum);
        }
        System.out.println("Maximum Sub Array Sum in An Array Is:"+maxSum);
        System.out.println("Minimum Sub Array Sum In An Array Is:"+minSum);
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
        maxSubArraySumKadanes(n);
    }
}
