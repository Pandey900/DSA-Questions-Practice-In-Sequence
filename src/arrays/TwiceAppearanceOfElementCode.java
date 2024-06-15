package arrays;

import java.util.Scanner;

public class TwiceAppearanceOfElementCode {
    public static boolean twiceAppearanceOfElement(int n[]){
        int i=0;
        for(int j=1;j<n.length;j++){
            if (n[i]==n[j]){
                return true;
            }
            i++;
        }
        return false;
//        for (int i=0;i< n.length-1; i++){
//            for (int j=i+1;j< n.length;j++){
//                if (n[i]==n[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        System.out.println(twiceAppearanceOfElement(n));
    }
}
