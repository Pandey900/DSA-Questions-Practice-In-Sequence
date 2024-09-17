package geeksforgeekscongnizant.ArraysQuestions;

import java.util.*;

public class ElementLeftSmallerRightGreaterProblem {
    public static int findElement(List<Integer> arr){
        int n= arr.size();
        int leftMax[]=new int[n];
        int rightMin[]=new int[n];
        leftMax[0]=arr.get(0);
        for (int i=1;i<n;i++){
            leftMax[i]= Math.max(leftMax[i-1],arr.get(i));
        }
        rightMin[n-1]=arr.get(n-1);
        for (int i=n-2;i>=0;i--){
            rightMin[i]=Math.min(rightMin[i+1],arr.get(i));
        }
        for (int i=1;i<n-1;i++){
            if (leftMax[i-1]<=arr.get(i)&&rightMin[i+1]>=arr.get(i)){
                return arr.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size= sc.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1)+" :");
            int element= sc.nextInt();
            list.add(element);
        }
        int ans=findElement(list);
        System.out.println(ans);
    }
}
