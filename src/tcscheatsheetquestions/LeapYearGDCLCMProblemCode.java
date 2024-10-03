package tcscheatsheetquestions;

public class LeapYearGDCLCMProblemCode {
    public static int checkLeapYear(int n){
        if (n%400==0){
            return 1;
        }
        if (n%100==0){
            return 0;
        }
        if(n%4==0){
            return 1;
        }
        return 0;
    }
    public static Long[] gdcAndLcm(Long a,Long b){
        Long gdc=gdc(a,b);
        Long lcm=(a*b)/gdc;
        Long result[]=new Long[2];
        result[0]=lcm;
        result[1]=gdc;
        return result;
    }
    public static Long gdc(Long a,Long b){
        while (b!=0){
            Long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(checkLeapYear(n));
        long a=5;
        long b=10;
        Long result[]=gdcAndLcm(a,b);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
