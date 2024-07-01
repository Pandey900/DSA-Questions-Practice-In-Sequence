package backtracking;

import java.util.Scanner;

public class ChangeArrayCode {
    public static void changeArray(int n[],int i,int val){
        if (i==n.length){
            printArray(n);
            return;
        }
        n[i]=val;
        changeArray(n,i+1,val+1);
        n[i]-=2;
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

//        1(1,2,3,4,5) or 5(5,6,7,8,9)
        System.out.println("Enter the value from which you want to print:");
        int val= sc.nextInt();
        changeArray(n,0,val);
        printArray(n);
    }
}
