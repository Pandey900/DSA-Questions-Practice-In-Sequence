package leetcodequestions;

import java.util.Scanner;

public class MergeSortedArrayCode {
    public static void mergeSortedArray(int nums1[],int nums2[],int m,int n){
        int i=m-1;
        int j=n-1;
        int x=m+n-1;
        while (i>=0&&j>=0){
            if (nums1[i]>nums2[j]){
                nums1[x--]=nums1[i--];
            }else {
                nums1[x--]=nums2[j--];
            }
        }
        while (j>=0){
            nums1[x--]=nums2[j--];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of nums1:");
        int m= sc.nextInt();
        System.out.println("Enter the size of nums2:");
        int n= sc.nextInt();
        int nums1[]=new int[m];
        int nums2[]=new int[n];
        System.out.println("Enter the nums1 elements:");
        for (int i=0;i<m;i++){
            nums1[i]= sc.nextInt();
        }
        System.out.println("Enter the nums2 elements:");
        for (int i=0;i<n;i++){
            nums2[i]= sc.nextInt();
        }
        mergeSortedArray(nums1,nums2,3,3);
        for (int i=0;i<m;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
