package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementCode {
    public static int[] nextGreaterElement(int arr[], Stack<Integer> s) {
        if (arr.length == 0) {
            return new int[0];
        }
        int[] nextGreater = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = nextGreaterElement(arr, s);
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
        sc.close();
    }
}