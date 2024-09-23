package geeksforgeekscongnizant.ArraysQuestions;

import java.util.PriorityQueue;

public class KLargestElementInArrayProblem {
    public static int kLargestElement(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if (pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println(kLargestElement(arr,2));
    }
}
