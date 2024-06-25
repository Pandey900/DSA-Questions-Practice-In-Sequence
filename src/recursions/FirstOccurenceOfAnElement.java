package recursions;

import java.util.Scanner;

public class FirstOccurenceOfAnElement {
    public static int firstOccurence(int n[],int key,int i){
        if (i==n.length-1){
            return -1;
        }
        if (n[i]==key){
            return i;
        }
        return firstOccurence(n,key,i+1);
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
        System.out.println("Enter the element you search for:");
        int key= sc.nextInt();
        System.out.println("Element found at Index:"+firstOccurence(n,key,0));
    }
}
