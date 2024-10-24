package hashmap.com;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctElementsInArrayCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            nums[i]= sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set.size());
    }
}
