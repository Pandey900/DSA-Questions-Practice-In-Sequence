package geeksforgeekscongnizant.ArraysQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FrequencyCountAndSort {
    public static ArrayList<Integer> sortByFrequency(ArrayList<Integer> arr,int n){
        int freq[]=new int[61];
        for (int i=0;i<n;i++){
            freq[arr.get(i)]++;
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<n;i++){
            result.add(arr.get(i));
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (freq[a]!=freq[b]){
                    return freq[b]-freq[a];
                }
                return a-b;
            }
        });
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> sorted = sortByFrequency(arr, n);
        for (int i : sorted) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
