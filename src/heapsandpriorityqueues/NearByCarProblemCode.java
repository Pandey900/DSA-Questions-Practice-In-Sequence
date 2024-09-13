package heapsandpriorityqueues;

import java.util.PriorityQueue;

public class NearByCarProblemCode {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int distance;
        int index;
        Points(int x,int y,int distance,int index){
            this.x=x;
            this.y=y;
            this.distance=distance;
            this.index=index;
        }
        @Override
        public int compareTo(Points p2){
            return this.distance-p2.distance;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Points> p=new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            int dist=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            p.add(new Points(arr[i][0],arr[i][1],dist,i));
        }

        for (int i=0;i<k;i++){
            System.out.println("C"+p.remove().index);
        }
    }
}
