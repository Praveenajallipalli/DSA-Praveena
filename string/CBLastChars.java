import java.util.Scanner;

public class CBLastChars {
    public static String lastChars(String a, String b) {
        if(a.length()==0&&b.length()==0){
          return "@@";
        }
        if(a.length()==0){
          String ans= "@"+String.valueOf(b.charAt(b.length()-1));
          return ans;
        }
        if(b.length()==0){
          String ans= String.valueOf(a.charAt(0))+"@";
          return ans;
        }
        String x=String.valueOf(a.charAt(0))+String.valueOf(b.charAt(b.length()-1));
        return x;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(lastChars(a,b));
      }
}
