package hashmap.com;


import java.util.*;

public class MajorityElementCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i< arr.length;i++){
//            if (map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else {
//                map.put(arr[i],1);
//            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
//        Set<Integer> keySet=map.keySet();
        for (Integer key: map.keySet()){
            if (map.get(key)> arr.length/3){
                System.out.println("Majority Element is:"+key);
            }
        }
    }
}
