package practiceFromStart;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int arr[],int key){
        int firstPosition = findFirstPosition(arr, key);
        int lastPosition = findLastPosition(arr, key);
        return new int[]{firstPosition, lastPosition};
    }

    public static int findFirstPosition(int arr[],int key){
        int index = -1, low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == key){
                index = mid;
                high = mid - 1;
            } else if(arr[mid] < key){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int findLastPosition(int arr[],int key){
        int index = -1, low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == key){
                index = mid;
                low = mid + 1;
            } else if(arr[mid] < key){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key which you want to search:");
        int key = sc.nextInt();
        int[] result = searchRange(arr, key);
        System.out.println("The first and last position of the element in the sorted array are: " + Arrays.toString(result));
    }
}
