package practiceFromStart;


import java.util.Scanner;

public class SubArraySumKadanes {
    public static int kadanesSubArraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int smallestNegative=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                smallestNegative=Math.max(smallestNegative,arr[i]);
            }
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if (currSum<0){
                currSum=0;
            }
        }
        if (maxSum<=0){
            maxSum=smallestNegative;
        }
        System.out.println("Max SubArray Sum is:"+maxSum);
        return maxSum;
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
        System.out.println(kadanesSubArraySum(arr));
    }
}
