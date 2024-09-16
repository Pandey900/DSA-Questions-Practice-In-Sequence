package geeksforgeekscongnizant.ArraysQuestions;

public class CountZeroesInArrayProblem {
    public static int countZeroes(int n[]){
        if (n.length==0){
            return -1;
        }
        int count=0;
        for (int i=0;i<n.length;i++){
            if (n[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={0,2,4,5,0,3,0,6,0,0,7,0};
        System.out.println(countZeroes(arr));
    }
}
