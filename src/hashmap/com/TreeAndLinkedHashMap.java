package hashmap.com;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeAndLinkedHashMap {
    public static void main(String[] args) {
//        It Prints The Output In Sequence And Time Complexity Remains Same
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",120);
        lhm.put("China",150);
        lhm.put("Pakistan",60);
        lhm.put("Italy",30);

//        It Sorts The Values First Then Print The Output In Ascending Order, So it's time Complexity Become O(logN) Due To Sorting
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",120);
        tm.put("China",150);
        tm.put("Pakistan",60);
        tm.put("Italy",30);
        System.out.println(lhm);
        System.out.println(tm);
    }
}
