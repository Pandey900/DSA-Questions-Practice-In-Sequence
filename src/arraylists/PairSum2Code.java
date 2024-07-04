package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2Code {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for (int i=0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp){
            if (list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else {
                rp=(n+rp-1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraylist:");
        int size= sc.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("Enter Element " +(i+1)+ " :");
            int element = sc.nextInt();
            list.add(element);
        }
        System.out.println("Enter the target:");
        int target= sc.nextInt();
        boolean isTarget=pairSum(list,target);
        if (isTarget){
            System.out.println("Target Found");
        }else {
            System.out.println("Target NOT Found");
        }
    }
}
