package sorting;

import java.util.Scanner;

public class BubbleSortCode {
    public static void bubbleSort(int n[]){
        for (int turn=0;turn<n.length-1;turn++){
            int swap=0;
            for (int j=0;j<n.length-1-turn;j++){
                if (n[j]>n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0){
                break;
            }
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
        bubbleSort(n);
        printArray(n);
    }
}
