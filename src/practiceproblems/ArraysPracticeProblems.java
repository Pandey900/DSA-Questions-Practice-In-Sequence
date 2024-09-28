package practiceproblems;

public class ArraysPracticeProblems {
    public static int largestNumber(int n[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            if (n[i]>largest){
                largest=n[i];
            }
        }
        return largest;
    }
    public static int binarySearch(int n[],int key){
        int si=0;
        int ei=n.length-1;
        while (si<=ei){
            int mid=si+((ei-si)/2);
            if (n[mid]==key){
                return mid;
            }
            if (n[mid]<key){
                si=mid+1;
            }else {
                ei=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;
        while (first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }

    public static void pairs(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int maxSumKadane(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for (int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if (currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static int trappedRainWater(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for (int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-arr[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
//        System.out.println(largestNumber(arr));
//        int key=11;
//        int index=binarySearch(arr,key);
//        if (index==-1){
//            System.out.println("Element Not Found");
//        }else {
//            System.out.println("Element Found At Index "+index);
//        }
//        reverse(arr);
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        pairs(arr);
//        printSubArrays(arr);
//        System.out.println(maxSumKadane(arr));
        System.out.println(trappedRainWater(arr));
    }
}
