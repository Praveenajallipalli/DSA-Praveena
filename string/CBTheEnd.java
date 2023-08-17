import java.util.Scanner;

public class CBTheEnd {
    public static String theEnd(String str, boolean front) {
        String a=Character.toString(str.charAt(0));
        String b=Character.toString(str.charAt(str.length()-1));
        if(front==true){
          return a;
        }else{
          return b;
        }
      }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        boolean front=sc.nextBoolean();
        System.out.println(theEnd(str,front));
      }
}
