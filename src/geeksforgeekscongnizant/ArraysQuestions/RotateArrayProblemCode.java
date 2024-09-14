package geeksforgeekscongnizant.ArraysQuestions;

public class RotateArrayProblemCode {
    public static void reverse(int arr[],int si,int ei){
        while (si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void rotateArray(int arr[],int d,int n){
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void printArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int d=2;
        rotateArray(arr,d, arr.length);
        printArray(arr);
    }
}
