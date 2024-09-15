package strings;

import java.util.Scanner;

public class DeloitteAllPossibleLeftRotationSolution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            scanner.close();

            StringBuilder result = new StringBuilder();
            int len = str.length();

            for (int i = 1; i < len; i++) {
                StringBuilder rotated = new StringBuilder(len);
                for (int j = i; j < len + i; j++) {
                    rotated.append(str.charAt(j % len));
                }
                result.append(Long.parseLong(rotated.toString())).append(" ");
            }

            System.out.print(result.toString().trim());
        }
}
