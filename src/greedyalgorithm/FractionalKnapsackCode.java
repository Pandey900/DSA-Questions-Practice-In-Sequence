package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsackCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the value array:");
        int sizeValue= sc.nextInt();
        System.out.println("Enter the size of the weight array:");
        int sizeWeight= sc.nextInt();
        int value[]=new int[sizeValue];
        int weight[]=new int[sizeWeight];
        System.out.println("Enter the value of the knapsack array:");
        for (int i=0;i<sizeValue;i++){
            value[i]= sc.nextInt();
        }
        System.out.println("Enter the weight of the knapsack array:");
        for (int i=0;i<sizeWeight;i++){
            weight[i]= sc.nextInt();
        }
        System.out.println("Enter the total knapsack capacity value:");
        int capacity= sc.nextInt();
        double ratio[][]=new double[value.length][2];
        for (int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int finalValue=0;
        for (int i=ratio.length-1;i>=0;i--){
            int index=(int)ratio[i][0];
            if (capacity>=weight[index]){
                finalValue+=value[index];
                capacity-=weight[index];
            }else {
                finalValue+=((int) ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Maximum value in the knapsack is: " +finalValue);
    }
}
