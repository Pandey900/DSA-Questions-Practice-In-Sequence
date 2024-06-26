package recursions;

import java.util.Scanner;

public class AllOccurenceOfElements {
    public static void allOccurence(int n[],int i,int key){
        if (i==n.length){
            return;
        }
        if (n[i]==key){
            System.out.print(i+" ");
        }
        allOccurence(n,i+1,key);
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
        allOccurence(n,0,key);
    }
}
