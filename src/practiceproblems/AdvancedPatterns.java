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
    public static void invertedAndHalfPyramidNumber(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n){
        int counter=1;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_Triangle(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterFlyPattern(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        hollowRectangle(4,5);
//        invertedAndHalfPyramid(4);
//        invertedAndHalfPyramidNumber(5);
//        floydTriangle(4);
//        zero_one_Triangle(4);
//        butterFlyPattern(5);
        solidRhombus(5);
    }
}
