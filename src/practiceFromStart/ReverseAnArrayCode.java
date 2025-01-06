package practiceFromStart;

import java.util.Scanner;

public class ReverseAnArrayCode {
    public static void reverseAnArray(int arr[]){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
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
        reverseAnArray(arr);
        System.out.println("Reversed Array:");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
