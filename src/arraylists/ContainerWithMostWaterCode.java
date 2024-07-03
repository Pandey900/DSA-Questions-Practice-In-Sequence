package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainerWithMostWaterCode {

//    Brute Force Approach
//    public static int mostWater(ArrayList<Integer> list){
//        int max=0;
//        for (int i=0;i<list.size();i++){
//            for (int j=i+1;j<list.size();j++){
//                int ht=Math.min(list.get(i),list.get(j));
//                int width=j-1;
//                int currWater=ht*width;
//                max=Math.max(max,currWater);
//            }
//        }
//        return max;
//    }

//    2 Pointer Approach Code
    public static int mostWater(ArrayList<Integer> list){
        int max=0;
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp){
            int ht=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            max=Math.max(max,currWater);
            if (list.get(lp)<list.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size= sc.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1)+" :");
            int element= sc.nextInt();
            list.add(element);
        }
        System.out.println("Max Water is: "+mostWater(list));
    }
}
