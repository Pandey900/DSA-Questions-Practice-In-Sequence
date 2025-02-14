package leetcodetop150questions;

import java.util.Scanner;

public class RemoveGivenElementProblem2 {
    public static int removeGivenElement(int arr[],int val){
        int i=0;
        for (int j=0;j<arr.length;j++){
            if (arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Element Left After Removing Duplicates:"+removeGivenElement(arr,3));
    }
}
