package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingInArrayListCode {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int element = scanner.nextInt();
            list.add(element);
        }

        System.out.println("Original ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " +list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse Order: " +list);

    }
}
