package practiceFromStart;

import java.util.Scanner;

public class SubArrayRangeSum {
    public static int sumOfSubArrayRange(int arr[]){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            int minValue=arr[i];
            int maxValue=arr[i];
            for (int j=i;j<arr.length;j++){
                minValue=Math.min(minValue,arr[j]);
                maxValue=Math.max(maxValue,arr[j]);
                ans+=maxValue-minValue;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(sumOfSubArrayRange(arr));
    }
}
