package leetcodetop150questions;

import java.util.Scanner;

public class MergeSortedArrayProblem1 {
    public static void mergeSortedArray(int arr1[],int m,int arr2[],int n){
        int i=m-1;
        int j=n-1;
        int x=m+n-1;
        while (i>=0 && j>=0){
            if (arr1[i]<arr2[j]){
                arr1[x--]=arr2[j--];
            }else{
                arr1[x--]=arr1[i--];
            }
        }
        while (i>=0){
            arr1[x--]=arr1[i--];
        }
        while (j>=0){
            arr1[x--]=arr2[j--];
        }
        for (int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array1:");
        int size1= sc.nextInt();
        System.out.println("Enter the size of the Array2:");
        int size2= sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        System.out.println("Enter the elements of the Array1:");
        for(int i=0;i<size1;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of the Array2:");
        for(int i=0;i<size2;i++){
            arr2[i]= sc.nextInt();
        }
        System.out.println("Merged Sorted Array Is:");
        mergeSortedArray(arr1,3,arr2,3);
    }
}
