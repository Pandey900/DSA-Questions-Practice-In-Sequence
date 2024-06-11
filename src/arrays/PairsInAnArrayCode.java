package arrays;

import java.util.Scanner;

public class PairsInAnArrayCode {
    public static void pairsInArray(int n[]){
        int tp=0;
        for (int i=0;i<n.length;i++){
            for (int j=i+1;j<n.length;j++){
                System.out.print("("+n[i]+","+n[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs is:"+tp);
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
        pairsInArray(n);
    }
}
