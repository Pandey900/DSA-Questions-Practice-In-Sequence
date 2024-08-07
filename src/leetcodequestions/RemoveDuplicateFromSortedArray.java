package leetcodequestions;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static int mergeSortedArray(int n[]){
        int i=0;
        for (int j=1;j<n.length;j++){
            if (n[i]<n[j]) {
                int temp = n[i + 1];
                n[i + 1] = n[j];
                n[j] = temp;
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        System.out.println(mergeSortedArray(n));
    }
}
