import java.util.Scanner;

public class CBSeeColors {
    public static String seeColor(String str) {
        if(str.startsWith("red")){
          return "red";
        }else if(str.startsWith("blue")){
          return "blue";
        }else{
          return "";
        }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(seeColor(str));
      }
}
