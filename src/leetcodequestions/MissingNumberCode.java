package leetcodequestions;

import java.util.Scanner;

public class MissingNumberCode {
    public static int missingNumber(int n[]){
        int xor=n.length;
        for (int i=0;i<n.length;i++){
            xor=xor^i;
            xor=xor^n[i];
        }
        return xor;
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
        System.out.println("The missing number is:"+missingNumber(n));
    }
}
