package backtracking;

import java.math.BigInteger;
import java.util.Scanner;

public class OptimizedGridWaysCode {
    // Optimized factorial function using BigInteger to avoid overflow
    public static BigInteger factN(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Function to calculate grid ways using the formula
    public static BigInteger gridWays(int n, int m) {
        int totalSteps = (n - 1) + (m - 1);
        BigInteger numerator = factN(totalSteps);
        BigInteger denominator = factN(n - 1).multiply(factN(m - 1));
        return numerator.divide(denominator);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        System.out.println("Enter the value of M:");
        int m = sc.nextInt();
        System.out.println("Total Ways is: " + gridWays(n, m));
    }
}

