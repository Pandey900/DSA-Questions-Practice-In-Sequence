package arrays;

import java.util.Scanner;

public class TrappingRainWaterCode {
    public static int trappedRainWater(int h[]){
        int n=h.length;
//        Left Maximum
        int leftMax[]=new int[n];
        leftMax[0]=h[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(h[i],leftMax[i-1]);
        }
//        Right Maximum
        int rightMax[]=new int[n];
        rightMax[n-1]=h[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(h[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for (int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-h[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Trapped Water is:"+trappedRainWater(n));
    }
}
