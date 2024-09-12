package heapsandpriorityqueues;

public class HeapSortCode {

    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
//        int maxIndex=i;
        int minIndex=i;
//        Ascending Order MaxHeap
//        if (left<size&&arr[left]>arr[maxIndex]){
//            maxIndex=left;
//        }
//        if (right<size&&arr[right]>arr[maxIndex]){
//            maxIndex=right;
//        }

//        Descending Order MinHeap
        if (left<size&&arr[left]<arr[minIndex]){
            minIndex=left;
        }
        if (right<size&&arr[right]<arr[minIndex]){
            minIndex=right;
        }


//        Ascending Order MaxHeap
//        if (maxIndex!=i){
//            int temp=arr[i];
//            arr[i]=arr[maxIndex];
//            arr[maxIndex]=temp;
//
//            heapify(arr,maxIndex,size);
//        }

//        Descending Order MinHeap
        if (minIndex!=i){
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            heapify(arr,minIndex,size);
        }
    }
    public static void heapSort(int arr[]){
        int n= arr.length;
        for (int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for (int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
