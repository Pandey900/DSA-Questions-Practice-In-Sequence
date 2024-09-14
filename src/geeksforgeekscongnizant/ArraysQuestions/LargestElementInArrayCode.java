package geeksforgeekscongnizant.ArraysQuestions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestElementInArrayCode {
//    O(N)
    public static int largest(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

//    O(NlogN)
    public static int largest2(int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0;i< arr.length;i++){
            pq.add(arr[i]);
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={1,8,7,56,90};
//        System.out.println(largest(arr));
        int largestElement=largest2(arr);
        System.out.println(largestElement);
    }
}
