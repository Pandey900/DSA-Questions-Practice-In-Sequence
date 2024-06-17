package sorting;

import java.util.Scanner;

public class SelectionSortCode {
    public static void selectionSort(int n[]){
        for (int i=0;i<n.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<n.length;j++){
//                Ascending Order
                if (n[minPos]>n[j]){
                    minPos=j;
                }
//                Descending Order
//                if (n[minPos]<n[j]){
//                    minPos=j;
//                }
            }
            int temp=n[minPos];
            n[minPos]=n[i];
            n[i]=temp;
        }
    }
    public static void printArray(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        selectionSort(n);
        printArray(n);
    }
}
