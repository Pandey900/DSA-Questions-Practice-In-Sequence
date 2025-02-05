package practiceFromStart;

import java.util.Scanner;

public class IntegerToRoman {
    public static String integerToRoman(int n){
        StringBuilder roman=new StringBuilder();
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String letter[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            int quotient=n/values[i];
            n%=values[i];
            while (quotient>0){
                roman.append(letter[i]);
                quotient--;
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        System.out.println(integerToRoman(n));
    }
}
