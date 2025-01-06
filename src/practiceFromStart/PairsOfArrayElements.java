package practiceFromStart;

import java.util.Scanner;

public class PairsOfArrayElements {
    public static void pairsOfElements(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j< arr.length;j++){
                System.out.print("("+curr+","+arr[j]+"),");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        pairsOfElements(arr);
//        for(int i=0;i<size;i++){
//            System.out.print(arr[i]);
//        }
    }
}
