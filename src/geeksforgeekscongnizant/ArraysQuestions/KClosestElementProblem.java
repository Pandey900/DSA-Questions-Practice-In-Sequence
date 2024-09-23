package geeksforgeekscongnizant.ArraysQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestElementProblem {
    public static List<Integer> findKClosest(int arr[],int k,int x){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            if (k>0){
                pq.add(arr[i]);
                k--;
            } else if (Math.abs(pq.peek()-x)>Math.abs(arr[i]-x)) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        List<Integer> ans=new ArrayList<>();
        while (!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findKClosest(arr,4,3));
    }
}
