package arraylists;

import javax.sql.rowset.spi.SyncResolver;
import java.util.*;

public class GroupAnagramForStringsProblem {
//    public static List<List<String>> groupAnagram(String str[]){
//        List<List<String>> ans=new ArrayList<>();
//        HashMap<String,List<String>> map=new HashMap<>();
//        for (int i=0;i< str.length;i++){
//            char temp[]=str[i].toCharArray();
//            Arrays.sort(temp);
//            String s=String.valueOf(temp);
//            if (map.get(s)!=null){
//                List<String> a=map.get(s);
//                a.add(str[i]);
//                map.put(s,a);
//            }else {
//                List<String> a=new ArrayList<>();
//                a.add(str[i]);
//                map.put(s,a);
//            }
//        }
//        List<String> keys = new ArrayList<>(map.keySet());
//        for (int i = 0; i < keys.size(); i++) {
//            String key = keys.get(i);
//            List<String> group = map.get(key);
//            ans.add(group);
//        }
//        return ans;
//    }



//    Optimized Approach
    public static List<List<String>> groupAnagram(String str[]){
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (int i=0;i<str.length;i++){
            String word=str[i];
            int countString[]=new int[26];
            for (int j=0;j<word.length();j++){
                countString[word.charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for (int k=0;k<26;k++){
                sb.append('#').append(countString[k]);
            }
            String key= sb.toString();
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        for (String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(str));
    }
}
