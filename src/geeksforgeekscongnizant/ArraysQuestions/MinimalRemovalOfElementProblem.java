package geeksforgeekscongnizant.ArraysQuestions;

import java.util.Arrays;

public class MinimalRemovalOfElementProblem {
    public static int minRemoval(int arr[]){
        Arrays.sort(arr);
        int n= arr.length;
        int maxLength=0;
        int left=0;
        for (int right=0;right<n;right++){
            while (2*arr[left]<arr[right]){
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return n-maxLength;
    }
    public static void main(String[] args) {
        int arr[]={4,5,100,9,10,11,12,15,200};
        System.out.println(minRemoval(arr));
    }
}
