package arraylists;

import java.util.*;

public class GroupAnagramForStringsProblem {
    public static List<List<String>> groupAnagram(String str[]){
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (int i=0;i< str.length;i++){
            char temp[]=str[i].toCharArray();
            Arrays.sort(temp);
            String s=String.valueOf(temp);
            if (map.get(s)!=null){
                List<String> a=map.get(s);
                a.add(str[i]);
                map.put(s,a);
            }else {
                List<String> a=new ArrayList<>();
                a.add(str[i]);
                map.put(s,a);
            }
        }
        for (Map.Entry<String,List<String>> x: map.entrySet()){
            ans.add(x.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(str));
    }
}
