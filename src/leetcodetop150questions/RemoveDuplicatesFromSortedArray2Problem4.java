package leetcodetop150questions;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray2Problem4 {
//    Remove
    public static int removeDuplicatesFromSortedArray2(int arr[]){
        int i=0;
        for (int j=0;j<arr.length;j++){
            if (i<2 || arr[j]!=arr[i-2]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(removeDuplicatesFromSortedArray2(arr));
    }
}
