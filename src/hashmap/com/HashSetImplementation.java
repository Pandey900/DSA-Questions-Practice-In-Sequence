package hashmap.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Mumbai");
        set.add("Delhi");
        set.add("Lucknow");
        set.add("Gorakhpur");
        System.out.println(set);
//        Iterator it=set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        for (String sets:set){
//            System.out.println(sets);
//        }
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("Mumbai");
        set1.add("Delhi");
        set1.add("Lucknow");
        set1.add("Gorakhpur");
        System.out.println(set1);
        TreeSet<String> set2=new TreeSet<>();
        set2.add("Mumbai");
        set2.add("Delhi");
        set2.add("Lucknow");
        set2.add("Gorakhpur");
        System.out.println(set2);
    }
}
