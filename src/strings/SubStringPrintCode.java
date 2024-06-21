package strings;

import java.util.Locale;
import java.util.Scanner;

public class SubStringPrintCode {
    public static String subString(String str,int si,int ei){
        String subStr="";
        for (int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        System.out.println(subString(str,0,5));
    }
}
