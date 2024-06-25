package recursions;

import java.util.Scanner;

public class RemovingDuplicatesFromString {
    public static void removeDuplicates(String str,int indx,StringBuilder sb,boolean map[]){
        if (indx==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(indx);
        if (map[currChar-'a']==true){
            removeDuplicates(str,indx+1,sb,map);
        }else {
            map[currChar-'a']=true;
            removeDuplicates(str,indx+1,sb.append(currChar),map);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
