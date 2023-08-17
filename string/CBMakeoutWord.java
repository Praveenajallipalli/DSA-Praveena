import java.util.*;
public class CBMakeoutWord {
    public static String makeOutWord(String out, String word) {
        int middle=out.length()/2;
        String ans=out.substring(0,middle)+word+out.substring(middle,out.length());
        return ans;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String out=sc.nextLine();
        String word=sc.nextLine();
        System.out.println(makeOutWord(out,word));
      }
}
