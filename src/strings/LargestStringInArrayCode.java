package strings;

import java.util.Scanner;

public class LargestStringInArrayCode {
    public static String largestString(String str[]){
        String largest=str[0];
        for (int i=1;i<str.length;i++){
            if (largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the String Array:");
        int size= sc.nextInt();
        String arr[]=new String[size];
        System.out.println("Enter the character of the String in Array:");
        for (int i=0;i<size;i++){
            arr[i]= sc.next();
        }

        System.out.println("The largest String in an Array is:"+largestString(arr));
    }
}
