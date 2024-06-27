package divideandconquere;

import java.util.Scanner;

public class QuickSortArrayCode {
    public static void printArray(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int n[],int si,int ei){
        if (si>=ei){
            return;
        }
        int pivIndex=partition(n,si,ei);
        quickSort(n,si,pivIndex-1);
        quickSort(n,pivIndex+1,ei);
    }
    public static int partition(int n[],int si,int ei){
        int pivot=n[ei];
        int i=si-1;
        for (int j=0;j<ei;j++){
            if (n[j]<=pivot){
                i++;
                int temp=n[i];
                n[i]=n[j];
                n[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        n[ei]=n[i];
        n[i]=temp;
        return i;
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
        quickSort(n,0,n.length-1);
        printArray(n);
    }
}
