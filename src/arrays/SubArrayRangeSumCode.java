package arrays;

import java.util.Scanner;

public class SubArrayRangeSumCode {

    public static long subArrayRangeSum(int n[]){
        long ans=0;
        for (int i=0;i<n.length;i++){
            int maxValue=n[i];
            int minValue=n[i];
            for (int j=i;j<n.length;j++){
                maxValue=Math.max(maxValue,n[j]);
                minValue=Math.min(minValue,n[j]);
                ans+=maxValue-minValue;
            }
        }
        return ans;
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
        System.out.println("Sub Array Sum For the Range is:"+subArrayRangeSum(n));
    }
}
