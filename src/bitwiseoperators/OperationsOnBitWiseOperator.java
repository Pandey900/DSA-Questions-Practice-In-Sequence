package bitwiseoperators;

import java.util.Scanner;

public class OperationsOnBitWiseOperator {
    public static int getIthBit(int n,int i){
        int bitMask=((1<<i));
        if ((n&bitMask)==0){
            return 0;
        }
        return 1;
    }

    public  static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n,int i,int newBit){
//        if (newBit==0){
//            return clearIthBit(n,i);
//        }
//        return setIthBit(n,i);

        n=clearIthBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }

    public static int clearLastIthBit(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        System.out.println("Enter the Ith Bit:");
        int i= sc.nextInt();
        System.out.println("Gives the Ith Bit of the given number = " + getIthBit(n,i));
        System.out.println("Sets the ith bit of the given number = " + setIthBit(n,i));
        System.out.println("Clears the ith bit of the given number = " + clearIthBit(n,i));
        System.out.println("Enter the newBit:");
        int newBit= sc.nextInt();
        System.out.println("The updated ith bit of the given number is = " + updateIthBit(n,i,newBit));
        System.out.println("The last cleared ith bit of the given number is = " + clearLastIthBit(n,i));
    }
}
