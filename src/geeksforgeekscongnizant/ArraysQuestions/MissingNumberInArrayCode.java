package geeksforgeekscongnizant.ArraysQuestions;

public class MissingNumberInArrayCode {
    public static int missingNumber(int arr[],int n){
        int sum=0;
        for (int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        int actualSum=(n*(n+1))/2;
        return actualSum-sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(missingNumber(arr,5));
    }
}
