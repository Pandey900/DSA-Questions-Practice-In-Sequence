package recursions;

import java.util.Scanner;

public class CheckArraySort {
    public static boolean isSorted(int n[],int i){
        if (i==n.length-1){
            return true;
        }
        if (n[i]>n[i+1]){
            return false;
        }
        return isSorted(n,i+1);
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
        System.out.println(isSorted(n,0));
    }
}
