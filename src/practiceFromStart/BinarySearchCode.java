package practiceFromStart;

import java.util.Scanner;

public class BinarySearchCode {
    public static int binarySearch(int arr[],int key){
        int si=0;
        int ei=arr.length-1;
        while (si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the elements want to search:");
        int key= sc.nextInt();
        int index=binarySearch(arr,key);
        if(index==-1){
            System.out.println("Key Not Found");
        }else {
            System.out.println("Key Found At Index " +index);
        }
    }
}
