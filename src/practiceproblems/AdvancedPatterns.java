package practiceproblems;

public class AdvancedPatterns {
    public static void hollowRectangle(int totRow,int totCol){
        for (int i=0;i<=totRow;i++){
            for(int j=0;j<=totCol;j++){
                if (i==0||i==totRow||j==0||j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedAndHalfPyramid(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        hollowRectangle(4,5);
        invertedAndHalfPyramid(4);

    }
}
