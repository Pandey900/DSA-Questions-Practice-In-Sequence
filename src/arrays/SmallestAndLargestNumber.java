package arrays;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class SmallestAndLargestNumber {
    public static int smallestAndLargest(int n[]){
        int smallest= Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            if (smallest>n[i]){
                smallest=n[i];
            }
            if (largest<n[i]) {
                largest = n[i];
            }
        }
        System.out.println("Smallest Value is:"+smallest);
        return largest;
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
        System.out.println("Largest number is:"+smallestAndLargest(n));
    }
}
