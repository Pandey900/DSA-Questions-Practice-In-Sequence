package leetcodetop150questions;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayProblem3 {
//    public static int removeDuplicatesFromSortedArray(int arr[]){
//        if(arr.length<=1){
//            return arr.length;
//        }
//        int i=0;
//        for (int j=0;j<arr.length;j++){
//            if (arr[i]<arr[j]){
//                int temp=arr[i+1];
//                arr[i+1]=arr[j];
//                arr[j]=temp;
//                i++;
//            }
//        }
//        return i+1;
//    }


//    More Optimized Way
    public static int removeDuplicatesFromSortedArray(int arr[]){
        if(arr.length<=1){
            return arr.length;
        }
        int i=1;
        for (int j=1;j<arr.length;j++){
            if (arr[j]!=arr[j-1]){
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
        System.out.println("Enter the elements of the Array:");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Left Elements After Sorting Array:"+removeDuplicatesFromSortedArray(arr));
    }
}
