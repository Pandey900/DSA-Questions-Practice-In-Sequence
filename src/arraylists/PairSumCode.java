package arraylists;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class PairSumCode {

//    Brute Force Approach Code
//    public static boolean pairSum(ArrayList<Integer> list,int target){
//        for (int i=0;i<list.size();i++){
//            for (int j=i+1;j<list.size();j++){
//                if (list.get(i)+ list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


//    2 Pointers Approach Code
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp){
            if (list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target){
                lp++;
            }else {
                rp--;
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
