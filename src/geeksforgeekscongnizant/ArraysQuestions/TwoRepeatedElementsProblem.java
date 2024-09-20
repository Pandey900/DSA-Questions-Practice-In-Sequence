package geeksforgeekscongnizant.ArraysQuestions;

public class TwoRepeatedElementsProblem {
    public static int[] repeatedElements(int n,int arr[]){
        int result[]=new int[2];
        int index=0;
        for (int i=0;i<n+2;i++){
            int val=Math.abs(arr[i]);
            if (arr[val-1]<0){
                result[index]=val;
                index++;
            }else {
                arr[val-1]=-arr[val-1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,3};
        int n=4;
        int result[]=repeatedElements(n,arr);
        System.out.println(result[0]+" "+result[1]);
    }
}
