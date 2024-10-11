package hashmap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("Indonesia",20);
        map.put("Pakistan",60);
        map.put("Bangladesh",40);
        System.out.println(map);
//        System.out.println(map.get("India"));
//        System.out.println(map.containsKey("China"));
//        System.out.println(map.containsKey("Canada"));
//        System.out.println(map.remove("Indonesia"));
//        System.out.println(map);
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.isEmpty());
//        Set<String> keys=map.keySet();
//        System.out.println(keys);
//        for(String k:keys){
//            System.out.println("Key = "+k+" , value = "+map.get(k));
//        }
//        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
//        for (Map.Entry<String,Integer> entry:entrySet){
//            System.out.println("Key = "+entry.getKey()+" , value = "+entry.getValue());
//        }
    }
}
