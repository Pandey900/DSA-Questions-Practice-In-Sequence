package tcscheatsheetquestions;

public class ArmStrongNumberCheckProblem {
    public static String checkArmStrong(int n){
        int originalN=n;
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if (sum==originalN){
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println(checkArmStrong(n));
    }
}
