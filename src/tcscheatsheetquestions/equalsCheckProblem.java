package tcscheatsheetquestions;

public class equalsCheckProblem {
    public static int validStringCheck(String str){
        int startCount=0;
        int hashCount=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='*'){
                startCount++;
            }else {
                hashCount++;
            }
        }
        return startCount-hashCount;
    }
    public static void main(String[] args) {
        String str="###***";
        System.out.println(validStringCheck(str));
    }
}
