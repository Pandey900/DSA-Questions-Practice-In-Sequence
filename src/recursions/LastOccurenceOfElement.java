package recursions;

import java.util.Scanner;

public class LastOccurenceOfElement {
    public static int lastOccurence(int n[],int key,int i){
        if (i==n.length){
            return -1;
        }
        int isFound=lastOccurence(n,key,i+1);
        if (isFound==-1&&n[i]==key){
            return i;
        }
        return isFound;
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
        System.out.println("Last Occurence of an element is at index:"+lastOccurence(n,key,0));
    }
}
