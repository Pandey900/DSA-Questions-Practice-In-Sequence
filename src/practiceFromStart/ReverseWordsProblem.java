package practiceFromStart;

import java.util.Scanner;

public class ReverseWordsProblem {
    public static String reverseString(String s){
        String str[]=s.trim().split("\\s+");
        int i=0,j=str.length-1;
        while (i<j){
            String newStr=str[i];
            str[i]=str[j];
            str[j]=newStr;
            i++;
            j--;
        }
        return String.join(" ",str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println(reverseString(str));
    }
}
