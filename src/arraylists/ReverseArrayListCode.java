package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayListCode {

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
        for (int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
