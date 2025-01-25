package practiceFromStart;

import java.util.HashSet;
import java.util.Scanner;

public class SubStringWithoutRepeatingCharacter {
    public static int longestSubStringWithoutRepeatingCharacter(String str){
        int left=0;
        int max=0;
        HashSet<Character> seen=new HashSet<>();
        for (int right=0;right<str.length();right++){
            while (seen.contains(str.charAt(right))){
                seen.remove(str.charAt(left));
                left++;
            }
            seen.add(str.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        System.out.println(longestSubStringWithoutRepeatingCharacter(str));
    }
}
