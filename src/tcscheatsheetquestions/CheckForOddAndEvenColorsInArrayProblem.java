package tcscheatsheetquestions;

public class CheckForOddAndEvenColorsInArrayProblem {
    public static String checkForOddOrEvenBalloons(char str[],int n){
        int count[]=new int[26];
        for (int i=0;i<n;i++){
            count[str[i]-'a']++;
        }
        for (int i=0;i<n;i++){
            if (count[str[i]-'a']%2!=0){
                return String.valueOf(str[i]);
            }
        }
        return "All Are Even";
    }
    public static void main(String[] args) {
        int n=7;
        char[] balloons = {'r', 'g', 'b', 'b', 'g', 'y', 'y'};
        System.out.println(checkForOddOrEvenBalloons(balloons,n));
    }
}
