package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int n[],int key){
        for (int i=0;i<n.length;i++){
            if (n[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        int index=linearSearch(n,key);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found at Index:"+index);
        }
    }
}
