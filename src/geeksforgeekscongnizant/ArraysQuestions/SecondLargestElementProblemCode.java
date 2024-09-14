package geeksforgeekscongnizant.ArraysQuestions;

public class SecondLargestElementProblemCode {
    public static int secondLargestElement(int arr[]){
        if (arr.length<2){
            return -1;
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if (arr[i]>second&&first!=second) {
                second=arr[i];
            }
        }
        return (second==Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int secondLargest=secondLargestElement(arr);
        System.out.println(secondLargest);
    }
}
