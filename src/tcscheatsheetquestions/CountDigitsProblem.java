package tcscheatsheetquestions;


import java.util.Scanner;

public class CountDigitsProblem {
    public static int countDigits(int n){
        int count=0;
        int original=n;
        while (n>0){
            int digit=n%10;
            n/=10;
            if (digit!=0&&original%digit==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println(countDigits(n));
    }
}
