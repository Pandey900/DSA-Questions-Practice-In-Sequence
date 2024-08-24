package greedyalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JobSequenceProblemCode {
    static class Jobs{
        int deadLine;
        int id;
        int profit;
        public Jobs(int i,int d,int p){
            id=i;
            deadLine=d;
            profit=p;
        }
    }
    public static int maxJobPerform(int jobInfo[][]){
        ArrayList<Jobs> jobs=new ArrayList<>();
        for (int i=0;i<jobInfo.length;i++){
            jobs.add(new Jobs(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for (int i=0;i<jobs.size();i++){
            Jobs curr=jobs.get(i);
            if (curr.deadLine>time){
                seq.add(curr.id);
                time++;
            }
        }
//        for (int i=0;i<seq.size();i++){
//            System.out.print(seq.get(i)+" ");
//        }
        System.out.println(seq);
        return seq.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int columns= sc.nextInt();
        int jobInfo[][]=new int[rows][columns];
        System.out.println("Enter the elements of the Array:");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                jobInfo[i][j]= sc.nextInt();
            }
        }
//        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        System.out.println(maxJobPerform(jobInfo));
    }
}
