package strings;

import java.util.Scanner;

public class ReverseStringCode {
    public static String reverseString(String str){
        String[] newStr=str.trim().split("\\s+");
        int i=0,j=newStr.length-1;
        while (i<j){
            String reverse=newStr[i];
            newStr[i]=newStr[j];
            newStr[j]=reverse;
            i++;
            j--;
        }
        return String.join(" ",newStr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        System.out.println("output of the reversed string is:"+reverseString(str));
    }
}
