package practiceFromStart;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockProblem {
    public static int buyAndSellStock(int arr[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if (buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else {
                buyPrice=arr[i];
            }
        }
        return maxProfit;
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
        System.out.println(buyAndSellStock(arr));
    }
}
