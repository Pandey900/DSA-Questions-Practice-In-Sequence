package hashmap.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UnionAndInterSectionCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the set1 element:");
        int size1= sc.nextInt();
        System.out.println("Enter the size of set2 element:");
        int size2= sc.nextInt();
        int set2[]=new int[size2];
        int set1[]=new int[size1];
        System.out.println("Enter the elements of the set1:");
        for (int i=0;i<size1;i++){
            set1[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of the set2 elements:");
        for (int i=0;i<size2;i++){
            set2[i]= sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i< set1.length;i++){
            set.add(set1[i]);
        }
        for (int i=0;i< set2.length;i++){
            set.add(set2[i]);
        }
        System.out.println("Union is = : "+set.size());
        set.clear();
        for (int i=0;i< set1.length;i++){
            set.add(set1[i]);
        }
        int count=0;
        for (int i=0;i<set2.length;i++){
            if (set.contains(set2[i])){
                count++;
                set.remove(set2[i]);
            }
        }
        System.out.println("Intersection is = : "+count);
    }
}
