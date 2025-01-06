package practiceFromStart;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesFromSortedArray(int arr[]){
        int i=0;
        for(int j=i;j<arr.length;j++){
            if (arr[i]<arr[j]){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return i+1;
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
        System.out.println("Left Elements After Remove The Duplicate Elements From It:"+removeDuplicatesFromSortedArray(arr));
    }
}
