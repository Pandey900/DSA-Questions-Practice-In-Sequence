package arraylists;

import java.util.ArrayList;

public class MaxOfArrayListCode {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(9);
        list.add(6);
        list.add(18);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
//            if (list.get(i)>max){
//                max=list.get(i);
//            }
            max=Math.max(max,list.get(i));
        }
        System.out.println("Max Element in ArrayList is: " +max);
    }
}
