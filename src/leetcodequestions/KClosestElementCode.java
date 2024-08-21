package leetcodequestions;

import java.util.Scanner;
import java.util.*;

public class KClosestElementCode {
    public static List<Integer> findClosestElement(int n[],int k,int x){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<n.length;i++){
            if(k>0){
                pq.add(n[i]);
                k--;
            } else if (Math.abs(pq.peek()-x)>Math.abs(n[i]-x)) {
                pq.poll();
                pq.add(n[i]);
            }
        }
        List<Integer> ans=new LinkedList<>();
        while (!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k= sc.nextInt();
        System.out.println("Enter the value of x:");
        int x= sc.nextInt();
        System.out.println(findClosestElement(n,k,x));
    }
}
