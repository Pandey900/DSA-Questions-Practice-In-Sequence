package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ArrayList Size:");
        int n= sc.nextInt();
        System.out.println("Enter the size of the sub-lists:");
        int size = sc.nextInt();

        for (int i = 0; i < n; i++) { // Create 3 sub-lists
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                System.out.println("Enter element " + (j + 1) + " for list " + (i + 1) + ":");
                int element = sc.nextInt();
                list.add(element);
            }
            mainList.add(list);
        }

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
