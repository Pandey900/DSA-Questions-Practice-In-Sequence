package arrays;

import java.util.Scanner;

public class MergeSortedArrayCode {
    public static void mergeSortedArray(int n1[],int n2[],int m,int n){
        int i=m-1;
        int j=n-1;
        int x=m+n-1;
        while (i>=0&&j>=0){
            if (n1[i]<n2[j]){
                n1[x]=n2[j];
                x--;
                j--;
            }else {
                n1[x]=n1[i];
                i--;
                x--;
            }
        }
        while (j>=0){
            n1[x]=n2[j];
            x--;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of n1 Array:");
        int s1=sc.nextInt();
        int n1[]=new int[s1];
        System.out.println("Enter the elements of n1 Array:");
        for (int i=0;i<s1;i++){
            n1[i]= sc.nextInt();
        }
        System.out.println("Enter the size of n2 Array:");
        int s2= sc.nextInt();
        int n2[]=new int[s2];
        System.out.println("Enter the elements of n2 Array:");
        for (int i=0;i<s2;i++){
            n2[i]= sc.nextInt();
        }
        System.out.println("Sorted And Merged Array is:");
        mergeSortedArray(n1,n2,3,3);
        for (int i=0;i<s1;i++){
            System.out.print(n1[i]+" ");
        }
    }
}
