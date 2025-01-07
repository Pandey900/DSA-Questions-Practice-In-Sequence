package practiceFromStart;

import java.util.Scanner;

public class ReverseArrayCharacterCode {
    public static void reverseCharactersInArray(char arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void printArray(char arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        char arr[]=new char[size];
        System.out.println("Enter the characters of array:");
        for (int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }
        reverseCharactersInArray(arr);
        printArray(arr);
    }
}
