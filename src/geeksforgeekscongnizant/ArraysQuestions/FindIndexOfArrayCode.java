package geeksforgeekscongnizant.ArraysQuestions;

public class FindIndexOfArrayCode {

    // Binary search for the first occurrence of the key
    public static int findFirstOccurrence(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        int firstIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (arr[mid] == key) {
                firstIndex = mid; // Key found, but search on the left side for the first occurrence
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstIndex;
    }

    // Binary search for the last occurrence of the key
    public static int findLastOccurrence(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        int lastIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (arr[mid] == key) {
                lastIndex = mid; // Key found, but search on the right side for the last occurrence
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIndex;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5};
        int key = 5;

        // Get the first and last occurrences using binary search
        int firstIndex = findFirstOccurrence(arr, key);
        int lastIndex = findLastOccurrence(arr, key);

        // Print the original array
        printArray(arr);

        // Print the result
        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }
}
