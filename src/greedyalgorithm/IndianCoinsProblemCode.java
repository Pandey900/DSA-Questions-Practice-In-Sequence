package greedyalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IndianCoinsProblemCode {
    public static int minCoin(Integer n[],int amount){
        Arrays.sort(n,Comparator.reverseOrder());
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<n.length;i++){
            if(n[i]<=amount){
                while (n[i]<=amount){
                    count++;
                    ans.add(n[i]);
                    amount-=n[i];
                }
            }
        }
        System.out.println("Elements which are used to find the min coins ara:"+ans);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        Integer n[]=new Integer[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        System.out.println("Enter the amount you want to search for:");
        int amount= sc.nextInt();
        System.out.println(minCoin(n,amount));
    }
}
