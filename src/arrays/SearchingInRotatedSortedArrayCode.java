package arrays;

import java.util.Scanner;

public class SearchingInRotatedSortedArrayCode {
    public static int searchInArray(int n[],int key){
        int si=0;
        int ei=n.length-1;
        while (si<=ei){
            int mid=si+((ei-si)/2);
            if (n[mid]==key){
                return mid;
            }
            if (n[si]<=n[mid]){
                if (n[si]<=key&&key<n[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }else{
                if(n[mid]<key&&key<=n[ei]){
                    si=mid+1;
                }else {
                    ei=mid-1;
                }
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
        System.out.println("Enter the element you want to search for:");
        int key= sc.nextInt();
        int index=searchInArray(n,key);
        if (index==-1){
            System.out.println("Key Is NOT Found");
        }else {
            System.out.println("Key Found At Index:"+index);
        }
    }
}
