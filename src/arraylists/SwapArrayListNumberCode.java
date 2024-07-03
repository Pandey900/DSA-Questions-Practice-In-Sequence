package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapArrayListNumberCode {
    public static void swap(ArrayList<Integer> list,int i1,int i2){
        int temp=list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter element " + (i+1) + ":");
            int element= sc.nextInt();
            list.add(element);
        }
        System.out.println("Enter the index 1:");
        int i1= sc.nextInt();
        System.out.println("Enter the index 2:");
        int i2= sc.nextInt();
        System.out.println("Original List: " + list);
        swap(list,i1,i2);
        System.out.println("List After Swapping Number: " +list);
    }
}
