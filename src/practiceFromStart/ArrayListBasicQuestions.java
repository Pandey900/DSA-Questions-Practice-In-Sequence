package practiceFromStart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListBasicQuestions {

//    Reverse
//    public static void reverseArrayList(ArrayList<Integer> arr){
//        for (int i=arr.size()-1;i>=0;i--){
//            System.out.print(arr.get(i)+", ");
//        }
//        System.out.println();
//    }


//    SWAP
//    public static void swap(ArrayList<Integer> arr,int index1,int index2){
//        int temp=arr.get(index1);
//        arr.set(index1,arr.get(index2));
//        arr.set(index2,temp);
//    }


//MAXIMUM
//    public static int maxNumberInArray(ArrayList<Integer> arr){
//        int maxValue=Integer.MIN_VALUE;
//        for (int i=0;i<arr.size();i++){
//            if (maxValue<arr.get(i)){
//                maxValue=arr.get(i);
//            }
//        }
//        return maxValue;
//    }

// POSSIBLE PAIR BRUTE FORCE APPROACH
//    public static boolean possiblePairSumBruteForce(ArrayList<Integer> arr,int target){
//        for (int i=0;i<arr.size();i++){
//            for (int j=i+1;j<arr.size();j++){
//                if(arr.get(i)+arr.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }




// POSSIBLE PAIR OPTIMIZED APPROACH
//    public static boolean possiblePairSumOptimizedWay(ArrayList<Integer> arr,int target){
//        int lp=0;
//        int rp=arr.size()-1;
//        while (lp!=rp){
//            if(arr.get(lp)+arr.get(rp)==target){
//                return true;
//            }
//            if (arr.get(lp)+arr.get(rp)>target){
//                rp--;
//            }else{
//                lp++;
//            }
//        }
//        return false;
//    }
    public static boolean possiblePairSumInRotatedAndSortedArray(ArrayList<Integer> arr,int target){
        int pivot=-1;
        int n=arr.size();
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)>arr.get(i+1)){
                pivot=i;
                break;
            }
        }
        int rp=pivot;
        int lp=pivot+1;
        while (lp!=rp){
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }
            if (arr.get(lp)+arr.get(rp)>target){
                rp=(n+rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the size of the Arraylist:");
        int size= sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        for (int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("ArrayList "+arr);
//        Collections.sort(arr);
//        System.out.println("ArrayList "+arr);
//        System.out.println("Reverse ");
//        reverseArrayList(arr);
//        System.out.println("Enter index1: ");
//        int index1= sc.nextInt();
//        System.out.println("Enter index2: ");
//        int index2= sc.nextInt();
//        swap(arr,index1,index2);
//        System.out.println("ArrayList "+arr);
//
//        System.out.println("Maximum Value is: "+maxNumberInArray(arr));
//        Collections.sort(arr);
//        System.out.println("ArrayList: "+arr);
        System.out.println("Enter the target value: ");
        int target= sc.nextInt();
//        System.out.println("Target Sum "+possiblePairSumBruteForce(arr,target));
//        System.out.println("Target Sum "+possiblePairSumOptimizedWay(arr,target));
        System.out.println("Target Sum Of Rotated And Sorted Array:"+possiblePairSumInRotatedAndSortedArray(arr,target));
    }
}
