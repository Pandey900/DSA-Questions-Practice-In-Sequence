package divideandconquere;

import java.util.Scanner;

public class MergeSortArrayCode {
    public static void mergeSort(int n[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(n,si,mid);
        mergeSort(n,mid+1,ei);
        merge(n,si,mid,ei);
    }
    public static void merge(int n[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=ei){
            if (n[i]>n[j]){
                temp[k]=n[j];
                j++;
            }else {
                temp[k]=n[i];
                i++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=n[i++];
        }
        while (j<=ei){
            temp[k++]=n[j++];
        }

        for (k=0,i=si;k<temp.length;k++,i++){
            n[i]=temp[k];
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
        mergeSort(n,0,n.length-1);
        printArray(n);
    }
}
