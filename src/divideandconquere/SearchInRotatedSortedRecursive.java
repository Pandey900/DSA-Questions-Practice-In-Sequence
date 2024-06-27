package divideandconquere;

import java.util.Scanner;

public class SearchInRotatedSortedRecursive {
    public static void printArray(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static int search(int n[],int target,int si,int ei){
        if (si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if (n[mid]==target){
            return mid;
        }
        if (n[si]<=n[mid]){
            if (n[si]<=target&&target<=n[mid]){
                return search(n,target,si,mid-1);
            }else {
                return search(n,target,mid+1,ei);
            }
        }else{
            if (n[mid]<=target&&target<=n[ei]){
                return search(n,target,mid+1,ei);
            }else {
                return search(n,target,si,mid-1);
            }
        }
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
        System.out.println("Enter the element you want to search:");
        int target= sc.nextInt();
        int index=search(n,target,0, n.length-1);
        if (index==-1){
            System.out.println("ELEMENT NOT FOUND");
        }else {
            System.out.println("ELEMENT FOUND AT INDEX " +index);
        }
    }
}
