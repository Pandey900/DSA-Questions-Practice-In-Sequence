package leetcodequestions;

import java.util.Scanner;

public class SubArrayRangeSumCode {
    public static long subArrayRange(int n[]){
        long ans=0;
        for (int i=0;i<n.length;i++){
            int maxV=n[i];
            int minV=n[i];
            for (int j=i;j<n.length;j++){
                maxV=Math.max(maxV,n[j]);
                minV=Math.min(minV,n[j]);
                ans+=maxV-minV;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n[]=new int[size];
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        System.out.println(subArrayRange(n));
    }
}
