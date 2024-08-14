package greedyalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelectionCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the start time activity:");
        int sizeStart = sc.nextInt();
        System.out.println("Enter the size of the end time activity:");
        int sizeEnd = sc.nextInt();
        int start[] = new int[sizeStart];
        int end[] = new int[sizeEnd];
        System.out.println("Enter the elements of the start time:");
        for (int i = 0; i < sizeStart; i++) {
            start[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the end time activity:");
        for (int i = 0; i < sizeEnd; i++) {
            end[i] = sc.nextInt();
        }

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        System.out.println("Before Sorted Elements:");
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(activities[i][j] + " ");
            }
            System.out.println();
        }

        Arrays.sort(activities, Comparator.comparing(o -> o[2]));

        System.out.println("After Sorted Elements:");
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(activities[i][j] + " ");
            }
            System.out.println();
        }

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activity Perform is: " + maxAct);
        System.out.print("Selected activities: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i)+" ");
//            if (i < ans.size() - 1) {
//                System.out.print(", ");
//            }
        }
        System.out.println();
    }
}
