package practiceFromStart;

import java.util.Scanner;

public class IntegerToRoman {
//    We Can Solve  This By Subtraction Also But That Will Not Be The Efficient Method
    public static String integerToRoman1(int n){
        StringBuilder roman=new StringBuilder();
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String letter[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while (n>=values[i]){
                roman.append(letter[i]);
                n-=values[i];
            }
        }
        return roman.toString();
    }
//    This is Division Method And It Is Most Efficient Method In Terms Of Space And Time Complexity
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
        System.out.println(integerToRoman1(n));
    }
}
