import java.util.*;
public class CBNonStart {
    public static String nonStart(String a, String b) {
        String ans=a.substring(1,a.length())+b.substring(1,b.length());
        return ans;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(nonStart(a,b));
      }
}
