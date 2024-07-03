package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxOfArrayListCode {
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
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
//            if (list.get(i)>max){
//                max=list.get(i);
//            }
            max=Math.max(max,list.get(i));
        }
        System.out.println("Max Element in ArrayList is: " +max);
    }
}
