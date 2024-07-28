package stack;

import java.util.Scanner;
import java.util.Stack;

public class RectangleHistogramCode {
    public static void maxHistogramRectangle(int n[]){
        int maxArea=0;
        int nsl[]=new int[n.length];
        int nsr[]=new int[n.length];
        Stack<Integer> s=new Stack<>();


//        Next Smaller Right
        for (int i=n.length-1;i>=0;i--){
            while (!s.isEmpty()&&n[s.peek()]>=n[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]=n.length;
            }else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }


//        Next Smaller Left
        for (int i=0;i<n.length;i++){
            while (!s.isEmpty()&&n[s.peek()]>=n[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]=-1;
            }else {
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for (int i=0;i<n.length;i++){
            int height=n[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Max Area To Form Rectangle Histogram is:"+maxArea);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        maxHistogramRectangle(n);
    }
}
