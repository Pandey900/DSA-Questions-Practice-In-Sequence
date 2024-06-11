package arrays;

import java.util.Scanner;

public class BinarySearchCode {
    public static int binarySearch(int n[],int key){
        int si=0;
        int ei=n.length-1;
        while (si<=ei){
            int mid=(si+ei)/2;
            if(n[mid]==key){
                return mid;
            }
            if (n[mid]<key){
                si=mid+1;
            }else {
                ei=mid-1;
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
        int index=binarySearch(n,key);
        if (index==-1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key Found At Index:"+index);
        }
    }
}
