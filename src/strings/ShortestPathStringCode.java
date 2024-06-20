package strings;

import java.util.Scanner;

public class ShortestPathStringCode {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if (dir=='N'){
                y++;
            }
            else if (dir=='S'){
                y--;
            }
            else if (dir=='W'){
                x--;
            }
            else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path for which you the value:");
        String path=sc.next();
        System.out.println(getShortestPath(path));
    }
}
