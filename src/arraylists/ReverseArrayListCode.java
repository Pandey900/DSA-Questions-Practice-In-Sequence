package arraylists;

import java.util.ArrayList;

public class ReverseArrayListCode {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(9);
        list.add(6);
        list.add(18);
        for (int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
