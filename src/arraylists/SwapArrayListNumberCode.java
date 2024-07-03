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
        list.add(12);
        list.add(15);
        list.add(9);
        list.add(6);
        list.add(18);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index 1:");
        int i1= sc.nextInt();
        System.out.println("Enter the index 2:");
        int i2= sc.nextInt();
        System.out.println("Original List: " + list);
        swap(list,i1,i2);
        System.out.println("List After Swapping Number: " +list);
    }
}
