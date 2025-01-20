package practiceFromStart;

import java.util.Scanner;

public class ContainerWithMostWaterProblem {



//    Brute Force Approach
    public static int mostWater(int arr[]){
        int maxWater=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                int water=height*width;
                maxWater=Math.max(maxWater,water);
            }
        }
        return maxWater;
    }

//    Optimized Approach
    public static int mostWater2(int arr[]){
        int maxWater=0;
        int lp=0;
        int rp=arr.length-1;
        while (lp<rp){
            int wt=Math.min(arr[lp],arr[rp]);
            int ht=rp-lp;
            int water=ht*wt;
            maxWater=Math.max(maxWater,water);
            if (lp<rp){
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(mostWater2(arr));
    }
}
