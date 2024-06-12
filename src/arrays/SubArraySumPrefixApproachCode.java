package arrays;

import java.util.Scanner;

public class SubArraySumPrefixApproachCode {
    public static void prefixSubArraySum(int n[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for (int i=0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (maxSum<currSum){
                    maxSum=currSum;
                }
            }
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
        prefixSubArraySum(n);
    }
}
