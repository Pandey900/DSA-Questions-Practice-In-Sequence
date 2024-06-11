package arrays;

import java.util.Scanner;

public class ReverseAnArrayCode {
    public static void reverseArray(int n[]){
        int i=0;
        int j=n.length-1;
        while (i<j){
            int temp=n[i];
            n[i]=n[j];
            n[j]=temp;
            i++;
            j--;
        }
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
        reverseArray(n);
        System.out.println("Reversed Array is:");
        for (int i=0;i<size;i++){
            System.out.print(n[i]+" ");
        }
    }
}
