package tcscheatsheetquestions;

public class SumAndAverageOfTheSubArrayProblem {
    public static int arr_Sum(int arr[],int si,int ei){
        int sum=0;
        for (int i=si;i<ei;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean isSplit(int arr[],int n){
        int total_Sum=arr_Sum(arr,0,n);
        for (int i=1;i<n;i++){
            int left_Sum=arr_Sum(arr,0,i);
            int right_Sum=total_Sum-left_Sum;
            if (left_Sum*(n-i)==right_Sum*i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        int arr[]={8,2,4,6};
        if (isSplit(arr,n)){
            System.out.println("Yes");;
        }else {
            System.out.println("No");
        }
    }
}
