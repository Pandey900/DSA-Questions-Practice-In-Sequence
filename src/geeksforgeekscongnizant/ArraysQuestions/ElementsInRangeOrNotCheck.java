package geeksforgeekscongnizant.ArraysQuestions;

public class ElementsInRangeOrNotCheck {
    public static boolean elementsInRange(int arr[],int n,int A,int B){
        int range=B-A+1;
        boolean[] found=new boolean[range];
        for (int i=0;i<n;i++){
            if (arr[i]>=A&&arr[i]<=B){
                found[arr[i]-A]=true;
            }
        }
        for (int i=0;i<range;i++){
            if (!found[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,7,8,3};
        int n=7;
        int A=2;
        int B=5;
        System.out.println(elementsInRange(arr,n,A,B));
    }
}
