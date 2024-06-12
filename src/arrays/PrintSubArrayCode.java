package arrays;

import java.util.Scanner;

public class PrintSubArrayCode {
    public static void printSubArray(int n[]){
        int ts=0;
        for (int i=0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    ts++;
                }
                System.out.println();
            }
//            System.out.println();
        }
        System.out.println("Total SubArrays is:"+ts);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        printSubArray(n);
    }
}
