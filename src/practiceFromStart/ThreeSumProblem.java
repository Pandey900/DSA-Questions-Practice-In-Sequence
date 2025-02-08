package practiceFromStart;

import java.util.*;

public class ThreeSumProblem {
    public static List<List<Integer>> threeSum(int arr[]){
        Arrays.sort(arr);
        HashSet<List<Integer>> result=new HashSet<>();
        for (int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while (left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if (sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }


//    Optimized Approach
    public static List<List<Integer>> threeSum2(int arr[]){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for (int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while (left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if (sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    while (left<right && arr[left]==arr[left+1]){
                        left++;
                    }
                    while (left<right && arr[right]==arr[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
//        List<List<Integer>> triplets = threeSum(arr);
//        System.out.println("Unique Triplets that sum to 0:");
//        for (List<Integer> triplet : triplets) {
//            System.out.println(triplet);
//        }
        List<List<Integer>> triplets = threeSum2(arr);
        System.out.println("Unique Triplets that sum to 0:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
