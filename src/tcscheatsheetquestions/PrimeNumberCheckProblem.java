package tcscheatsheetquestions;

public class PrimeNumberCheckProblem {
    public static int primeCheck(int n){
        if(n<=1){
            return 0;
        }
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(primeCheck(n));
    }
}
