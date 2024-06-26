package recursions;

import java.util.Scanner;

public class PrintBinaryStringCode {
    public static void printBinString(int n,int lastPlace,String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str+"0");
        if (lastPlace==0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        System.out.println("Enter the value of last Place:");
        int lastPlace= sc.nextInt();
        printBinString(n,lastPlace," ");
    }
}
