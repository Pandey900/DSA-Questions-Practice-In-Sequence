package greedyalgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblemCode {
    public static int chocolaProblem(Integer costVer[],Integer costHori[],int n,int m){
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHori,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while (h<costHori.length&&v<costVer.length){
            if (costVer[v]<=costHori[h]){
                cost+=(costHori[h]*vp);
                hp++;
                h++;
            }else {
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHori.length){
            cost+=(costHori[h]*vp);
            hp++;
            h++;
        }
        while (v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        return cost;
    }
    public static void main(String[] args) {
        Integer costVer[]={2,1,3,1,4};
        Integer costHori[]={4,1,2};
        System.out.println(chocolaProblem(costVer,costHori,4,6));
    }
}
